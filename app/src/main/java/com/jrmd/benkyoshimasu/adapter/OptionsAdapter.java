package com.jrmd.benkyoshimasu.adapter;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jrmd.benkyoshimasu.R;
import com.jrmd.benkyoshimasu.Utils;
import com.jrmd.benkyoshimasu.fragments.VocabularyFragment;
import com.jrmd.benkyoshimasu.object.Word;

import java.util.List;

/**
 * Created by julian on 06/11/2016.
 */

public class OptionsAdapter extends BaseAdapter {

    Context context;
    List<Word> options;
    Boolean japanese;
    Word mainWord;
    Fragment fragment;


    public OptionsAdapter(Context context, List<Word> options, Boolean japanese, Word mainWord,Fragment fragment) {
        this.context = context;
        this.options = options;
        this.japanese = japanese;
        this.mainWord = mainWord;
        this.fragment=fragment;

    }

    @Override
    public int getCount() {
        return options.size();
    }

    @Override
    public Object getItem(int position) {
        return options.get(position);
    }

    @Override
    public long getItemId(int position) {
        return options.get(position).hashCode();
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.word_option, parent, false);
        }

        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int space = Utils.dpToPx(context,4);
        AbsListView.LayoutParams parms = new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT , (parent.getHeight()/2)-space);
        convertView.setLayoutParams(parms);


        final TextView optionText = (TextView) convertView.findViewById(R.id.word_option_text);
        optionText.setText(this.japanese?options.get(position).getSpanish():options.get(position).getJapanese());
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView optionTextClicked = (TextView) v.findViewById(R.id.word_option_text);
                Boolean result=false;
                if(japanese){
                    result= mainWord.getSpanish().equals(options.get(position).getSpanish());
                }else{
                    result= mainWord.getJapanese().equals(options.get(position).getJapanese());
                }
                Integer delayTime=1000;
                if(result){
                    v.setBackgroundColor(ContextCompat.getColor(context, R.color.myGreen));
                    optionTextClicked.setTextColor(Color.WHITE);

                }else {
                    ((VocabularyFragment)fragment).highlightCorrect(japanese);
                    v.setBackgroundColor(ContextCompat.getColor(context, R.color.myRed));
                    optionTextClicked.setTextColor(Color.WHITE);
                    delayTime=2000;
                }
                ((VocabularyFragment)fragment).notClickable();
                Handler mHandler = new Handler();
                mHandler.postDelayed(new Runnable() {
                    public void run() {
                        ((VocabularyFragment)fragment).refreshData();
                    }
                }, delayTime);


            }
        });


        return convertView;
    }
}
