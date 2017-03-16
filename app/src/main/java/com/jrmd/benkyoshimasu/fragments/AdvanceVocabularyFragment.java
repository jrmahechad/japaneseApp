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
import com.jrmd.benkyoshimasu.activity.ListActivity;
import com.jrmd.benkyoshimasu.activity.SettingsActivity;
import com.jrmd.benkyoshimasu.adapter.OptionsAdvanceWordsAdapter;
import com.jrmd.benkyoshimasu.object.LessonsWords;
import com.jrmd.benkyoshimasu.object.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Created by julian on 13/11/2016.
 */

public class AdvanceVocabularyFragment extends Fragment{

    View rootView;
    private TextView mMainWord,mKanji,mCorrectAnswer,mCorrectCount,mIncorrectCount;;
    private GridView mOptionGrid;
    private Word mainWord;
    private List<Word> options;
    private List<Word> words;
    private List<Word> lastMainWords;
    private Random randomGenerator;
    private List<Integer>activeLessons;
    private Integer japanese;
    private int countWords;
    /*
        1 kanji-hiragana
        2 kanji-español
        3 hiragana-kanji
        4 hiragana-español
        5 español-kanji
        6 español-hiragana
        */

    private LessonsWords lessonsWords;
    SharedPreferences pref;
    private int MAX_LAST_MAIN_WORDS=5;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        pref=getActivity().getPreferences(Context.MODE_PRIVATE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_vocabulary, container, false);
        randomGenerator = new Random(System.currentTimeMillis()/1000);
        mMainWord = (TextView) rootView.findViewById(R.id.main_word);
        mKanji = (TextView) rootView.findViewById(R.id.kanji);
        mCorrectAnswer = (TextView) rootView.findViewById(R.id.correct_answer_word);
        mOptionGrid = (GridView) rootView.findViewById(R.id.options_grid);
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

    public  void refreshData(){
        loadLesson();
        if(words.size()==0){
            Snackbar
                    .make(rootView,getString(R.string.warning_no_vocabulary), Snackbar.LENGTH_LONG).show();
        }
        japanese= selectMainWord();
        OptionsAdvanceWordsAdapter adapter = new OptionsAdvanceWordsAdapter(getActivity(),options,japanese);
        mOptionGrid.setAdapter(adapter);
        mOptionGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long l) {
                mOptionGrid.setEnabled(false);
                TextView optionTextClicked = (TextView) v.findViewById(R.id.word_option_text);

                Boolean result=false;


                if(japanese==1||japanese==6){
                    //hiragana
                    result= mainWord.getJapanese().equals(options.get(i).getJapanese());
                }else if (japanese==3 || japanese==5){
                    //kanji
                    result= mainWord.getKanji().equals(options.get(i).getKanji());
                }else{
                    result= mainWord.getSpanish().equals(options.get(i).getSpanish());
                }

                updateAnswerCount(result);
                Integer delayTime=1000;
                if(result){
                    v.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.myGreen));
                    optionTextClicked.setTextColor(Color.WHITE);

                }else {
                    highlightCorrect(japanese);
                    v.setBackgroundColor(ContextCompat.getColor(getActivity(), R.color.myRed));
                    optionTextClicked.setTextColor(Color.WHITE);
                    delayTime=2000;
                }
                mKanji.setVisibility(View.VISIBLE);
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

    private Integer selectMainWord(){
        mCorrectAnswer.setText("");
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

        Integer firstSelection = randomGenerator.nextInt(100);
        Integer secondSelection = randomGenerator.nextInt(100);
        String textMain="";
        String secondText="";
        if(firstSelection<30){
            textMain=mainWord.getSpanish();
            if(secondSelection<50){
                //español-hiragana
                secondText=mainWord.getKanji();
                japanese=6;
            }else{
                //español-kanji
                secondText=mainWord.getJapanese();
                japanese=5;
            }
        }else if(firstSelection<60){
            textMain=mainWord.getJapanese();
            if(secondSelection<40){
                //hiragana-español
                secondText=mainWord.getKanji();
                japanese=4;
            }else{
                //hiragana-kanji
                secondText=mainWord.getSpanish();
                japanese=3;
            }
        }else{
            textMain=mainWord.getKanji();
            if(secondSelection<60){
                //kanji-español
                secondText=mainWord.getJapanese();
                japanese=2;
            }else{
                //kanji-hiragana
                secondText=mainWord.getSpanish();
                japanese=1;
            }
        }


        //String kanji=japanese?mainWord.getKanji():"";
        mMainWord.setText(textMain);
        mKanji.setText(secondText);

        mKanji.setVisibility(View.GONE);

        countWords++;
        //mKanji.setText(kanji);
        return japanese;
    }

    public void highlightCorrect(Integer japanese){
        String text ="";
        if(japanese==1 || japanese==6){
            text=mainWord.getJapanese();
        }else if(japanese==2||japanese==4){
            text=mainWord.getSpanish();
        }else{
            text=mainWord.getKanji();
        }
        mCorrectAnswer.setText(text);

    }

    public void updateAnswerCount(Boolean result){
        SharedPreferences.Editor editor = pref.edit();
        if(result){
            editor.putInt(getString(R.string.pref_correct_adv_word), pref.getInt(getString(R.string.pref_correct_adv_word), 0)+1);
        }else{
            editor.putInt(getString(R.string.pref_incorrect_adv_word), pref.getInt(getString(R.string.pref_incorrect_adv_word), 0)+1);
        }
        editor.commit();
        showAnswerCounts();
    }

    public void showAnswerCounts(){
        Integer correct = pref.getInt(getString(R.string.pref_correct_word), 0);
        Integer incorrect = pref.getInt(getString(R.string.pref_incorrect_word), 0);
        if(mCorrectCount!=null && mIncorrectCount!=null){
            mCorrectCount.setText(correct.toString());
            mIncorrectCount.setText(incorrect.toString());
        }
    }


}
