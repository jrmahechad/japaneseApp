package com.jrmd.benkyoshimasu.adapter;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jrmd.benkyoshimasu.R;
import com.jrmd.benkyoshimasu.Utils;
import com.jrmd.benkyoshimasu.object.Word;

import java.util.List;

/**
 * Created by julian on 06/11/2016.
 */

public class OptionsAdvanceWordsAdapter extends BaseAdapter {

    Context context;
    List<Word> options;
    Integer japanese;



    public OptionsAdvanceWordsAdapter(Context context, List<Word> options, Integer japanese) {
        this.context = context;
        this.options = options;
        this.japanese=japanese;


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
            convertView = LayoutInflater.from(context).inflate(R.layout.word_option_item, parent, false);
        }else{

        }

        int space = Utils.dpToPx(context,4);
        AbsListView.LayoutParams parms = new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT , (parent.getHeight()/2)-space);
        convertView.setLayoutParams(parms);


        final TextView optionText = (TextView) convertView.findViewById(R.id.word_option_text);
        String text="";
        if(japanese==1 ||japanese==6){
            text=options.get(position).getJapanese();

        }else if(japanese==2 ||japanese==4){
            text=options.get(position).getSpanish();
        }else{
            text=options.get(position).getKanji();
            optionText.setTextSize(TypedValue.COMPLEX_UNIT_SP,42);
        }

        optionText.setText(text);



        return convertView;
    }
}
