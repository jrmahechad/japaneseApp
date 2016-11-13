package com.jrmd.benkyoshimasu.fragments;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import com.jrmd.benkyoshimasu.R;
import com.jrmd.benkyoshimasu.Utils;
import com.jrmd.benkyoshimasu.activity.SettingsActivity;
import com.jrmd.benkyoshimasu.adapter.OptionsAdapter;
import com.jrmd.benkyoshimasu.object.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Created by julian on 13/11/2016.
 */

public class VocabularyFragment extends Fragment implements View.OnClickListener{

    View rootView;
    private TextView mMainWord,mKanji,mCorrectAnswer;
    private GridView mOptionGrid;
    private Word mainWord;
    private List<Word> options;
    private List<Word> words;
    private Random randomGenerator;
    private Integer lesson;
    /*Button mOption1,mOption2,mOption3,mOption4;
    List<Button> buttons;*/

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_vocabulary, container, false);
        randomGenerator = new Random();
        mMainWord = (TextView) rootView.findViewById(R.id.main_word);
        mKanji = (TextView) rootView.findViewById(R.id.kanji);
        mCorrectAnswer = (TextView) rootView.findViewById(R.id.correct_answer);
        mOptionGrid = (GridView) rootView.findViewById(R.id.options_grid);



        words = Utils.loadAllWords();
        refreshData();
        /*mOption1 = (Button) rootView.findViewById(vocabulary_button_opcion_1);
        mOption2 = (Button) rootView.findViewById(vocabulary_button_opcion_2);
        mOption3 = (Button) rootView.findViewById(vocabulary_button_opcion_3);
        mOption4 = (Button) rootView.findViewById(vocabulary_button_opcion_4);
        mOption1.setOnClickListener(this);
        mOption2.setOnClickListener(this);
        mOption3.setOnClickListener(this);
        mOption4.setOnClickListener(this);
        buttons.add(mOption1);
        buttons.add(mOption2);
        buttons.add(mOption3);
        buttons.add(mOption4);*/




        return rootView;
    }
    public void loadLesson(){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
        lesson =Integer.valueOf(prefs.getString(getString(R.string.max_lesson_key),"1"));
    }
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.main, menu);
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
        Boolean japanese= selectMainWord();
        OptionsAdapter adapter = new OptionsAdapter(getActivity(),options,japanese,mainWord,this);
        mOptionGrid.setAdapter(adapter);
    }

    public void notClickable(){
        int countChildren=mOptionGrid.getChildCount();
        for(int i=0;i<countChildren;i++){
            mOptionGrid.getChildAt(i).setClickable(false);
            mOptionGrid.getChildAt(i).setFocusable(false);
        }

    }

    private Boolean selectMainWord(){
        mCorrectAnswer.setText("");
        Integer mainPosition=randomGenerator.nextInt(words.size());
        boolean mainWordFound=false;
        do{
            mainWord=words.get(mainPosition);
            if(mainWord.getLevel()<=lesson)
                mainWordFound=true;
            else
                mainPosition=randomGenerator.nextInt(words.size());
        }while (!mainWordFound);

        List<Word> wordsCopy=new ArrayList<Word>(words);
        options = new ArrayList<Word>();
        //Collections.copy(wordsCopy,words);
        wordsCopy.remove(mainPosition);

        Integer count=0;
        while(count<3){
            Integer wrongOptionPosition= randomGenerator.nextInt(wordsCopy.size());
            //if(wordsCopy.get(wrongOptionPosition).getLevel()<=lesson&&!options.contains(wordsCopy.get(wrongOptionPosition))){
            if(!options.contains(wordsCopy.get(wrongOptionPosition))){
                options.add(wordsCopy.get(wrongOptionPosition));
                wordsCopy.remove(wrongOptionPosition);
                count++;
            }
        }

        options.add(randomGenerator.nextInt(options.size()),mainWord);

        Boolean japanese =randomGenerator.nextInt(100)<50;
        String textMain= japanese?mainWord.getJapanese():mainWord.getSpanish();
        String kanji=japanese?mainWord.getKanji():"";
        mMainWord.setText(textMain);
        mKanji.setText(kanji);
        return japanese;
    }

    public void highlightCorrect(Boolean japanese){
        String text = japanese?mainWord.getSpanish():mainWord.getJapanese();
        mCorrectAnswer.setText(text);

    }

    @Override
    public void onClick(View view) {
        /*switch (view.getId()){
            case vocabulary_button_opcion_1:
            case vocabulary_button_opcion_2:
            case vocabulary_button_opcion_3:
            case vocabulary_button_opcion_4:

                break;
            default:
                break;


        }*/

    }
}
