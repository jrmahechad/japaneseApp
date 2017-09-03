package com.jrmd.benkyoshimasu.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jrmd.benkyoshimasu.R;
import com.jrmd.benkyoshimasu.Utils;
import com.jrmd.benkyoshimasu.activity.ListActivity;
import com.jrmd.benkyoshimasu.activity.SettingsActivity;
import com.jrmd.benkyoshimasu.object.LessonsWords;
import com.jrmd.benkyoshimasu.object.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Created by julian on 13/11/2016.
 */

public class PracticeWritingFragment extends Fragment{

    View rootView;
    private TextView mMainWord,mCorrectAnswer,mCorrectCount,mIncorrectCount;
    private EditText mWriteText;
    private ImageButton mCheckAWritingButton;

    private Word mainWord;
    private List<Word> options;
    private List<Word> words;
    private List<Word> lastMainWords;
    private Random randomGenerator;
    private List<Integer>activeLessons;
    private Boolean japanese;
    private LessonsWords lessonsWords;
    SharedPreferences pref;
    private int MAX_LAST_MAIN_WORDS=5;
    private int countWords;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        pref=getActivity().getPreferences(Context.MODE_PRIVATE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_practice_writing, container, false);
        randomGenerator = new Random(System.currentTimeMillis()/1000);
        mMainWord = (TextView) rootView.findViewById(R.id.main_word);
        mWriteText = (EditText) rootView.findViewById(R.id.writeText);
        mCorrectAnswer = (TextView) rootView.findViewById(R.id.correct_answer_word);
        mCheckAWritingButton = (ImageButton) rootView.findViewById(R.id.checkAWritingButton);

        mCheckAWritingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateWriting();

            }
        });
        lastMainWords = new ArrayList<Word>();
        countWords=0;

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        lessonsWords = Utils.loadAllAdvanceLessonWords();
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
        tempLessons.add(prefs.getBoolean(getString(R.string.lesson_7_key),false));
        tempLessons.add(prefs.getBoolean(getString(R.string.lesson_8_key),false));
        tempLessons.add(prefs.getBoolean(getString(R.string.lesson_9_key),false));
        tempLessons.add(prefs.getBoolean(getString(R.string.lesson_10_key),false));
        tempLessons.add(prefs.getBoolean(getString(R.string.lesson_11_key),false));
        tempLessons.add(prefs.getBoolean(getString(R.string.lesson_12_key),false));
        tempLessons.add(prefs.getBoolean(getString(R.string.lesson_13_key),false));
        tempLessons.add(prefs.getBoolean(getString(R.string.lesson_14_key),false));
        tempLessons.add(prefs.getBoolean(getString(R.string.lesson_15_key),false));
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
        words= new ArrayList<Word>();
        for(Integer lesson :activeLessons){
            switch (lesson){
                case 1:
                    words.addAll(lessonsWords.getWordsLesson1());
                    break;
                case 2:
                    words.addAll(lessonsWords.getWordsLesson2());
                    break;
                case 3:
                    words.addAll(lessonsWords.getWordsLesson3());
                    break;
                case 4:
                    words.addAll(lessonsWords.getWordsLesson4());
                    break;
                case 5:
                    words.addAll(lessonsWords.getWordsLesson5());
                    break;
                case 6:
                    words.addAll(lessonsWords.getWordsLesson6());
                    break;
                case 7:
                    words.addAll(lessonsWords.getWordsLesson7());
                    break;
                case 8:
                    words.addAll(lessonsWords.getWordsLesson8());
                    break;
                case 9:
                    words.addAll(lessonsWords.getWordsLesson9());
                    break;
                case 10:
                    words.addAll(lessonsWords.getWordsLesson10());
                    break;
                case 11:
                    words.addAll(lessonsWords.getWordsLesson11());
                    break;
                case 12:
                    words.addAll(lessonsWords.getWordsLesson12());
                    break;
                case 13:
                    words.addAll(lessonsWords.getWordsLesson13());
                    break;
                case 14:
                    words.addAll(lessonsWords.getWordsLesson14());
                    break;
                case 15:
                    words.addAll(lessonsWords.getWordsLesson15());
                    break;
                default:
                    break;
            }
            if(words.size()==0){
                SharedPreferences.Editor editor = prefs.edit();
                editor.putBoolean(getString(R.string.lesson_1_key), true);
                editor.commit();
                activeLessons.add(1);
                Snackbar snackbar = Snackbar
                        .make(rootView,getString(R.string.warning_no_lesson), Snackbar.LENGTH_LONG);
                snackbar.show();
                words.addAll(lessonsWords.getWordsLesson1());
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
        if(id == R.id.action_list){
            startActivity(new Intent(getActivity(), ListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void validateWriting(){
        Boolean result=false;
        result= mainWord.getJapanese().equals(mWriteText.getText().toString());

        updateAnswerCount(result);
        Integer delayTime=2000;
        if(result){

            mWriteText.setBackgroundResource(R.drawable.border_button_correct);
            //optionTextClicked.setTextColor(Color.WHITE);

        }else {
            highlightCorrect();
            mWriteText.setBackgroundResource(R.drawable.border_button_incorrect);
            //optionTextClicked.setTextColor(Color.WHITE);
            delayTime=4000;
        }

        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {
            public void run() {
                refreshData();
            }
        }, delayTime);

    }

    public  void refreshData(){
        loadLesson();
        if(words.size()==0){
            Snackbar
                    .make(rootView,getString(R.string.warning_no_vocabulary), Snackbar.LENGTH_LONG).show();
        }
        selectMainWord();

    }

    private void selectMainWord(){
        mWriteText.setText("");

        mWriteText.setBackgroundResource(R.drawable.border_button);
        int mainPosition;
        boolean mainWordSelected=false;
        if(countWords>=5){
            randomGenerator= new Random(System.currentTimeMillis()/1000);
            countWords=0;
        }
        do{
            mainPosition=randomGenerator.nextInt(words.size());
            mainWord=words.get(mainPosition);
            if(!lastMainWords.contains(mainWord)){
                lastMainWords.add(mainWord);
                mainWordSelected=true;
                if(lastMainWords.size()==MAX_LAST_MAIN_WORDS){
                    lastMainWords.remove(0);
                }
            }
        }while(!mainWordSelected);
        List<Word> wordsCopy=new ArrayList<Word>(words);
        options = new ArrayList<Word>();
        wordsCopy.remove(mainPosition);
        Integer count=0;
        while(count<3){
            int wrongOptionPosition= randomGenerator.nextInt(wordsCopy.size());
            if(!options.contains(wordsCopy.get(wrongOptionPosition))){
                options.add(wordsCopy.get(wrongOptionPosition));
                wordsCopy.remove(wrongOptionPosition);
                count++;
            }
        }

        options.add(randomGenerator.nextInt(options.size()),mainWord);


        //String kanji=japanese?mainWord.getKanji():"";
        mMainWord.setText(mainWord.getKanji());
        mCorrectAnswer.setText(mainWord.getJapanese());

        mCorrectAnswer.setVisibility(View.GONE);

        countWords++;


    }

    public void highlightCorrect(){
        mCorrectAnswer.setVisibility(View.VISIBLE);
        mCorrectAnswer.setText(mainWord.getJapanese());

    }

    public void updateAnswerCount(Boolean result){
        SharedPreferences.Editor editor = pref.edit();
        if(result){
            editor.putInt(getString(R.string.pref_write_correct_word), pref.getInt(getString(R.string.pref_write_correct_word), 0)+1);
        }else{
            editor.putInt(getString(R.string.pref_write_incorrect_word), pref.getInt(getString(R.string.pref_write_incorrect_word), 0)+1);
        }
        editor.commit();
        showAnswerCounts();
    }

    public void showAnswerCounts(){
        Integer correct = pref.getInt(getString(R.string.pref_write_correct_word), 0);
        Integer incorrect = pref.getInt(getString(R.string.pref_write_incorrect_word), 0);
        if(mCorrectCount!=null && mIncorrectCount!=null){
            mCorrectCount.setText(correct.toString());
            mIncorrectCount.setText(incorrect.toString());
        }
    }


}
