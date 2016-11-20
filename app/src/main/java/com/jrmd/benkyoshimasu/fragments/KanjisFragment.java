package com.jrmd.benkyoshimasu.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jrmd.benkyoshimasu.R;
import com.jrmd.benkyoshimasu.Utils;
import com.jrmd.benkyoshimasu.activity.SettingsActivity;
import com.jrmd.benkyoshimasu.adapter.OptionsKanjisAdapter;
import com.jrmd.benkyoshimasu.adapter.ReadingsKanjisAdapter;
import com.jrmd.benkyoshimasu.object.Kanji;
import com.jrmd.benkyoshimasu.object.LessonsKanjis;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Created by julian on 13/11/2016.
 */

public class KanjisFragment extends Fragment{

    View rootView;
    private TextView mMeaning,mCorrectAnswer,mCorrectCount,mIncorrectCount;
    private GridView mOptionGrid,mReadingsGrid;
    private Kanji mainKanji;
    private List<Kanji> options;
    private List<Kanji> kanjis;
    private Random randomGenerator;
    private List<Integer>activeLessons;
    private LessonsKanjis lessonsKanjis;
    SharedPreferences pref;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        pref=getActivity().getPreferences(Context.MODE_PRIVATE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_kanjis, container, false);
        randomGenerator = new Random();
        mMeaning = (TextView) rootView.findViewById(R.id.kanjis_meaning);
        mCorrectAnswer = (TextView) rootView.findViewById(R.id.correct_answer_kanji);
        mOptionGrid = (GridView) rootView.findViewById(R.id.kanjis_options_grid);
        mReadingsGrid = (GridView) rootView.findViewById(R.id.kanjis_readings_grid);

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        lessonsKanjis = Utils.loadAllKanjis();
        refreshData();
    }

    public void loadLesson(){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
        List<Boolean> tempLessons=new ArrayList<Boolean>();
        tempLessons.add(prefs.getBoolean(getString(R.string.lesson_1_key),false));
        tempLessons.add(prefs.getBoolean(getString(R.string.lesson_2_key),false));
        tempLessons.add(prefs.getBoolean(getString(R.string.lesson_3_key),false));
        tempLessons.add(prefs.getBoolean(getString(R.string.lesson_4_key),false));
        tempLessons.add(prefs.getBoolean(getString(R.string.lesson_5_key),false));
        tempLessons.add(prefs.getBoolean(getString(R.string.lesson_6_key),false));
        activeLessons= new ArrayList<Integer>();
        for(int i=0;i<tempLessons.size();i++){
            if(tempLessons.get(i))
                activeLessons.add(i+1);
        }
        if(activeLessons.size()==0){
            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean(getString(R.string.lesson_1_key), true);
            editor.commit();
            activeLessons.add(1);
            Snackbar snackbar = Snackbar
                    .make(rootView,getString(R.string.warning_no_lesson), Snackbar.LENGTH_LONG);
            snackbar.show();
        }
        kanjis= new ArrayList<Kanji>();
        for(Integer lesson :activeLessons){
            switch (lesson){
                case 1:
                    kanjis.addAll(lessonsKanjis.getKanjisLesson1());
                    break;
                case 2:
                    kanjis.addAll(lessonsKanjis.getKanjisLesson2());
                    break;
                case 3:
                    kanjis.addAll(lessonsKanjis.getKanjisLesson3());
                    break;
                case 4:
                    kanjis.addAll(lessonsKanjis.getKanjisLesson4());
                    break;
                case 5:
                    kanjis.addAll(lessonsKanjis.getKanjisLesson5());
                    break;
                case 6:
                    kanjis.addAll(lessonsKanjis.getKanjisLesson6());
                    break;
                default:
                    break;
            }

        }

    }
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.main_answers, menu);
        LinearLayout itemC =(LinearLayout) menu.findItem(R.id.action_correct_answers).getActionView();
        LinearLayout itemW =(LinearLayout) menu.findItem(R.id.action_wrong_answer).getActionView();
        mCorrectCount = (TextView) itemC.findViewById(R.id.correct_answer_count);
        mIncorrectCount = (TextView) itemW.findViewById(R.id.wrong_answer_count);
        showAnswerCounts();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            startActivity(new Intent(getActivity(), SettingsActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public  void refreshData(){
        loadLesson();
        selectMainKanji();
        ReadingsKanjisAdapter adapterReadings = new ReadingsKanjisAdapter(getActivity(),mainKanji.getReadings());
        mReadingsGrid.setAdapter(adapterReadings);
        OptionsKanjisAdapter adapter = new OptionsKanjisAdapter(getActivity(),options);
        mOptionGrid.setAdapter(adapter);
        mOptionGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long l) {
                mOptionGrid.setEnabled(false);
                TextView optionTextClicked = (TextView) v.findViewById(R.id.kanji_option_text);

                Boolean result=mainKanji.getMeaning().equals(options.get(i).getMeaning());

                Integer delayTime=1000;
                if(result){
                    v.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.myGreen));
                    optionTextClicked.setTextColor(Color.WHITE);

                }else {
                    highlightCorrect();
                    v.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.myRed));
                    optionTextClicked.setTextColor(Color.WHITE);
                    delayTime=2000;
                }
                updateAnswerCount(result);

                Handler mHandler = new Handler();
                mHandler.postDelayed(new Runnable() {
                    public void run() {
                       refreshData();
                    }
                }, delayTime);

            }
        });
        mOptionGrid.setEnabled(true);
    }

    private void selectMainKanji(){
        mCorrectAnswer.setText("");
        Integer mainPosition=randomGenerator.nextInt(kanjis.size());
        mainKanji=kanjis.get(mainPosition);
        List<Kanji> kanjisCopy=new ArrayList<Kanji>(kanjis);
        options = new ArrayList<Kanji>();
        kanjisCopy.remove(mainPosition);
        Integer count=0;
        while(count<7){
            Integer wrongOptionPosition= randomGenerator.nextInt(kanjisCopy.size());
            if(!options.contains(kanjisCopy.get(wrongOptionPosition))){
                options.add(kanjisCopy.get(wrongOptionPosition));
                kanjisCopy.remove(wrongOptionPosition);
                count++;
            }
        }

        options.add(randomGenerator.nextInt(options.size()),mainKanji);
        mMeaning.setVisibility(View.INVISIBLE);
        mReadingsGrid.setVisibility(View.INVISIBLE);
        Integer showMeaning =randomGenerator.nextInt(100);
        if(showMeaning<20){
            mMeaning.setVisibility(View.VISIBLE);
            mReadingsGrid.setVisibility(View.VISIBLE);
        }else if(showMeaning<60){
            mMeaning.setVisibility(View.VISIBLE);
        }else{
            mReadingsGrid.setVisibility(View.VISIBLE);
        }
        mMeaning.setText(mainKanji.getMeaning());

    }

    public void highlightCorrect(){
        String text = mainKanji.getKanji();
        mCorrectAnswer.setText(text);

    }

    public void updateAnswerCount(Boolean result){
        SharedPreferences.Editor editor = pref.edit();
        if(result){
            editor.putInt(getString(R.string.pref_correct_kanji), pref.getInt(getString(R.string.pref_correct_kanji), 0)+1);
        }else{
            editor.putInt(getString(R.string.pref_incorrect_kanji), pref.getInt(getString(R.string.pref_incorrect_kanji), 0)+1);
        }
        editor.commit();
        showAnswerCounts();
    }

    public void showAnswerCounts(){
        Integer correct = pref.getInt(getString(R.string.pref_correct_kanji), 0);
        Integer incorrect = pref.getInt(getString(R.string.pref_incorrect_kanji), 0);
        if(mCorrectCount!=null && mIncorrectCount!=null){
            mCorrectCount.setText(correct.toString());
            mIncorrectCount.setText(incorrect.toString());
        }
    }

}
