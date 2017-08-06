package com.jrmd.benkyoshimasu.adapter;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.GridView;
import android.widget.TextView;

import com.jrmd.benkyoshimasu.R;
import com.jrmd.benkyoshimasu.object.Kanji;
import com.jrmd.benkyoshimasu.object.Reading;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by julian on 06/11/2016.
 */

public class KanjisListAdapter extends BaseAdapter implements Filterable {

    Context context;
    List<Kanji> kanjis;
    List<Kanji> allKanjis;
    boolean japaneseSearch;
    private ItemFilter mFilter = new ItemFilter();

    public KanjisListAdapter(Context context, List<Kanji> kanjis) {
        this.context = context;
        this.allKanjis=kanjis;
        this.kanjis = filterList("");

    }

    public boolean isJapaneseSearch() {
        return japaneseSearch;
    }

    public void setJapaneseSearch(boolean japaneseSearch) {
        this.japaneseSearch = japaneseSearch;
    }

    private List<Kanji> filterList(String searchText){
        List<Kanji> list = this.allKanjis;
        List<Kanji> result= new ArrayList<Kanji>();
        if(searchText==null || searchText.isEmpty())
            return list;
        for (Kanji k: list) {
            if(japaneseSearch){
                List<Reading>readings=k.getReadings();
                if(readings!=null && readings.size()>0)
                    for (Reading r:readings) {
                        if(r.getReading().contains(searchText)){
                            result.add(k);
                            break;
                        }
                    }
                /*if(k.get.contains(searchText))
                    result.add(w);*/
            }else{
                String spanish = k.getMeaning();
                spanish = Normalizer.normalize(spanish, Normalizer.Form.NFD);
                spanish = spanish.replaceAll("[^\\p{ASCII}]", "");
                if(spanish.toLowerCase().contains(searchText.toLowerCase()))
                    result.add(k);
            }
            if(k.getStrokes()==-1){
                result.add(k);
            }

        }

        return result;
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
            TextView spanish = (TextView) convertView.findViewById(R.id.kanji_list_spanish);
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
            spanish.setText(kanjis.get(position).getMeaning());
            if(kanjis.get(position).getMeaning().length()>12)
                spanish.setTextSize(TypedValue.COMPLEX_UNIT_SP,15);

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

    @Override
    public Filter getFilter() {
        return mFilter;
    }

    private class ItemFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            String filterString = constraint.toString().toLowerCase();

            FilterResults results = new FilterResults();


            final List<Kanji> nlist = filterList(filterString);


            results.values = nlist;
            results.count = nlist.size();

            return results;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            kanjis = (ArrayList<Kanji>) results.values;
            notifyDataSetChanged();
        }

    }
}
