package com.jrmd.benkyoshimasu.adapter;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jrmd.benkyoshimasu.R;
import com.jrmd.benkyoshimasu.object.Word;

import java.util.List;

/**
 * Created by julian on 06/11/2016.
 */

public class AdvanceVocabularyListAdapter extends BaseAdapter {

    Context context;
    List<Word> words;

    public AdvanceVocabularyListAdapter(Context context, List<Word> words) {
        this.context = context;
        this.words = words;

    }

    @Override
    public int getCount() {
        return words.size();
    }

    @Override
    public Object getItem(int position) {
        return words.get(position);
    }

    @Override
    public long getItemId(int position) {
        return words.get(position).hashCode();
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        int type = getItemViewType(position);
        if(convertView==null){
            if( type==0){
                convertView = LayoutInflater.from(context).inflate(R.layout.advance_vocabulary_list_item, parent, false);
            }else{
                convertView = LayoutInflater.from(context).inflate(R.layout.section_title_item, parent, false);
            }
        }

        if( type==0){
            TextView kanji = (TextView) convertView.findViewById(R.id.adv_vocabulary_kanji);
            TextView spanish = (TextView) convertView.findViewById(R.id.adv_vocabulary_spanish);
            TextView hiragana = (TextView) convertView.findViewById(R.id.adv_vocabulary_hiragana);




            kanji.setText(words.get(position).getKanji());
            spanish.setText(words.get(position).getSpanish());
            hiragana.setText(words.get(position).getJapanese());
            if(words.get(position).getSpanish().length()>12)
                spanish.setTextSize(TypedValue.COMPLEX_UNIT_SP,15);

        }else{
            TextView title = (TextView) convertView.findViewById(R.id.section_item_title);
            title.setText(words.get(position).getSpanish());
        }

        return convertView;
    }

    @Override
    public int getItemViewType(int position) {
        if( words.get(position).getLevel()!=-1)
            return 0;
        else
            return 1;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }
}
