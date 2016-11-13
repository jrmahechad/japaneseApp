package com.jrmd.benkyoshimasu.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.TextView;

import com.jrmd.benkyoshimasu.R;
import com.jrmd.benkyoshimasu.Utils;
import com.jrmd.benkyoshimasu.adapter.OptionsAdapter;
import com.jrmd.benkyoshimasu.object.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    private TextView mMainWord,mKanji,mCorrectAnswer;
    private GridView mOptionGrid;
    private Word mainWord;
    private List<Word> options;
    private List<Word> words;
    private Random randomGenerator;
    private Integer lesson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomGenerator = new Random();
        mMainWord = (TextView) findViewById(R.id.main_word);
        mKanji = (TextView) findViewById(R.id.kanji);
        mCorrectAnswer = (TextView) findViewById(R.id.correct_answer);
        mOptionGrid = (GridView) findViewById(R.id.options_grid);

        words = Utils.loadAllWords();
        refreshData();

    }

    public void loadLesson(){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        lesson =Integer.valueOf(prefs.getString(getString(R.string.max_lesson_key),"1"));
        Log.e("lesson",lesson+"");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public  void refreshData(){
        loadLesson();
        Boolean japanese= selectMainWord();
        Log.e("he",mOptionGrid.getHeight()+"");
        OptionsAdapter adapter = new OptionsAdapter(this,options,japanese,mainWord,null);
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

}
