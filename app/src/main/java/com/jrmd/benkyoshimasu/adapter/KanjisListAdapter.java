package com.jrmd.benkyoshimasu.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.jrmd.benkyoshimasu.R;
import com.jrmd.benkyoshimasu.object.Kanji;

import java.util.List;

/**
 * Created by julian on 06/11/2016.
 */

public class KanjisListAdapter extends BaseAdapter {

    Context context;
    List<Kanji> kanjis;

    public KanjisListAdapter(Context context, List<Kanji> kanjis) {
        this.context = context;
        this.kanjis = kanjis;

    }

    @Override
    public int getCount() {
        return kanjis.size();
    }

    @Override
    public Object getItem(int position) {
        return kanjis.get(position);
    }

    @Override
    public long getItemId(int position) {
        return kanjis.get(position).hashCode();
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        int type = getItemViewType(position);
        if(convertView==null){
            if( type==0){
                convertView = LayoutInflater.from(context).inflate(R.layout.kanji_list_item, parent, false);
            }else{
                convertView = LayoutInflater.from(context).inflate(R.layout.section_title_item, parent, false);
            }
        }

        if( type==0){
            TextView kanji = (TextView) convertView.findViewById(R.id.kanji_list_kanji);
            GridView grid = (GridView) convertView.findViewById(R.id.kanji_list_grid);
            //grid.setNumColumns(kanjis.get(position).getReadings().size()/3);
            if(kanjis.get(position).getReadings()!=null&&kanjis.get(position).getReadings().size()>0){
                ReadingsKanjisAdapter readingsKanjisAdapter = new ReadingsKanjisAdapter(context,kanjis.get(position).getReadings());
                grid.setAdapter(readingsKanjisAdapter);
                /*for(Reading reading: kanjis.get(position).getReadings()){
                    View view = LayoutInflater.from(context).inflate(R.layout.kanji_reading_item,parent,false);
                    final TextView optionText = (TextView) view.findViewById(R.id.reading_option_text);
                    optionText.setText(reading.getReading());
                    if(reading.getKun()){
                        optionText.setBackgroundResource(R.drawable.border_round_kun);
                    }else{
                        optionText.setBackgroundResource(R.drawable.border_round_no_kun);
                    }
                    grid.addView(view);
                }*/
            }


            kanji.setText(kanjis.get(position).getKanji());

        }else{
            TextView title = (TextView) convertView.findViewById(R.id.section_item_title);
            title.setText(kanjis.get(position).getMeaning());
        }

        return convertView;
    }

    @Override
    public int getItemViewType(int position) {
        if( kanjis.get(position).getStrokes()!=-1)
            return 0;
        else
            return 1;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }
}
