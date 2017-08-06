package com.jrmd.benkyoshimasu.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.jrmd.benkyoshimasu.R;
import com.jrmd.benkyoshimasu.object.Word;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by julian on 06/11/2016.
 */

public class WordsListAdapter extends BaseAdapter implements Filterable{

    Context context;
    List<Word> words;
    List<Word> allWords;
    boolean japaneseSearch;

    private ItemFilter mFilter = new ItemFilter();

    public WordsListAdapter(Context context, List<Word> words) {
        this.context = context;
        this.allWords=words;
        this.words = filterList("");
    }

    public boolean isJapaneseSearch() {
        return japaneseSearch;
    }

    public void setJapaneseSearch(boolean japaneseSearch) {
        this.japaneseSearch = japaneseSearch;
    }

    private List<Word> filterList(String searchText){
        List<Word> list = this.allWords;
        List<Word> result= new ArrayList<Word>();
        if(searchText==null || searchText.isEmpty())
            return list;


        for (Word w: list) {
            if(japaneseSearch){
                if(w.getJapanese().contains(searchText))
                    result.add(w);
            }else{
                String spanish = w.getSpanish();
                spanish = Normalizer.normalize(spanish, Normalizer.Form.NFD);
                spanish = spanish.replaceAll("[^\\p{ASCII}]", "");
                if(spanish.toLowerCase().contains(searchText.toLowerCase()))
                    result.add(w);
            }
            if(w.getLevel()==-1){
                result.add(w);
            }

        }
        return result;
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
                convertView = LayoutInflater.from(context).inflate(R.layout.word_list_item, parent, false);
            }else{
                convertView = LayoutInflater.from(context).inflate(R.layout.section_title_item, parent, false);
            }
        }

        if( type==0){
            TextView spanish = (TextView) convertView.findViewById(R.id.item_spanish);
            TextView japanese = (TextView) convertView.findViewById(R.id.item_japanese);
            TextView kanji = (TextView) convertView.findViewById(R.id.item_kanji);
            spanish.setText(words.get(position).getSpanish());
            japanese.setText(words.get(position).getJapanese());
            kanji.setText(words.get(position).getKanji());
            if(!words.get(position).getKanji().isEmpty())
                kanji.setVisibility(View.VISIBLE);
            else
                kanji.setVisibility(View.GONE);
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

    @Override
    public Filter getFilter() {
        return mFilter;
    }

    private class ItemFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            String filterString = constraint.toString().toLowerCase();

            FilterResults results = new FilterResults();


            final List<Word> nlist = filterList(filterString);


            results.values = nlist;
            results.count = nlist.size();

            return results;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            words = (ArrayList<Word>) results.values;
            notifyDataSetChanged();
        }

    }
}
