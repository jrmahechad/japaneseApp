package com.jrmd.benkyoshimasu.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jrmd.benkyoshimasu.R;
import com.jrmd.benkyoshimasu.object.Reading;

import java.util.List;

/**
 * Created by julian on 06/11/2016.
 */

public class ReadingsKanjisAdapter extends BaseAdapter {

    Context context;
    List<Reading> options;



    public ReadingsKanjisAdapter(Context context, List<Reading> options) {
        this.context = context;
        this.options = options;


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
            convertView = LayoutInflater.from(context).inflate(R.layout.kanji_reading_item, parent, false);
        }

        /*int space = Utils.dpToPx(context,4);
        AbsListView.LayoutParams parms = new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT , (parent.getHeight()/2)-space);
        convertView.setLayoutParams(parms);*/


        final TextView optionText = (TextView) convertView.findViewById(R.id.reading_option_text);
        optionText.setText(options.get(position).getReading());
        if(options.get(position).getKun()){
            optionText.setBackgroundResource(R.drawable.border_round_kun);
        }else{
            optionText.setBackgroundResource(R.drawable.border_round_no_kun);
        }

        return convertView;
    }
}
