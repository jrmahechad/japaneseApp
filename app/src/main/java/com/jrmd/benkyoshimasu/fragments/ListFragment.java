package com.jrmd.benkyoshimasu.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

import com.jrmd.benkyoshimasu.R;
import com.jrmd.benkyoshimasu.Utils;
import com.jrmd.benkyoshimasu.adapter.AdvanceVocabularyListAdapter;
import com.jrmd.benkyoshimasu.adapter.KanjisListAdapter;
import com.jrmd.benkyoshimasu.adapter.WordsListAdapter;
import com.jrmd.benkyoshimasu.object.Kanji;
import com.jrmd.benkyoshimasu.object.LessonsKanjis;
import com.jrmd.benkyoshimasu.object.LessonsWords;
import com.jrmd.benkyoshimasu.object.Word;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by julian on 26/11/2016.
 */

public class ListFragment extends Fragment {

    private View rootView;
    private ListView listViewVocabulary,listViewKanjis,listViewAdvanceVocabulary;
    private List<Word> words,advanceWords;
    private List<Kanji> kanjis;
    private int from;
    private TabLayout tabLayout;
    private EditText searchTextView;
    private boolean japaneseSearch;
    private String searchText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_list, container, false);
        listViewVocabulary = (ListView) rootView.findViewById(R.id.fragment_list_vocabulary);
        listViewKanjis = (ListView) rootView.findViewById(R.id.fragment_list_kanjis);
        listViewAdvanceVocabulary = (ListView) rootView.findViewById(R.id.fragment_list_advance_vocabulary);
        tabLayout = (TabLayout) rootView.findViewById(R.id.list_tablayout);
        searchTextView = (EditText) rootView.findViewById(R.id.search_text);



        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                listViewVocabulary.setVisibility(View.GONE);
                listViewKanjis.setVisibility(View.GONE);
                listViewAdvanceVocabulary.setVisibility(View.GONE);
                switch (tab.getPosition()){
                    case 0:
                        listViewVocabulary.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        listViewKanjis.setVisibility(View.VISIBLE);
                        break;
                    case 2:
                        listViewAdvanceVocabulary.setVisibility(View.VISIBLE);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        LessonsWords lessonsWords = Utils.loadAllWords();

        words= new ArrayList<Word>();
        words.add(new Word("Lección 1","","",-1));
        words.addAll(lessonsWords.getWordsLesson1());
        words.add(new Word("Lección 2","","",-1));
        words.addAll(lessonsWords.getWordsLesson2());
        words.add(new Word("Lección 3","","",-1));
        words.addAll(lessonsWords.getWordsLesson3());
        words.add(new Word("Lección 4","","",-1));
        words.addAll(lessonsWords.getWordsLesson4());
        words.add(new Word("Lección 5","","",-1));
        words.addAll(lessonsWords.getWordsLesson5());
        words.add(new Word("Lección 6","","",-1));
        words.addAll(lessonsWords.getWordsLesson6());
        words.add(new Word("Lección 7","","",-1));
        words.addAll(lessonsWords.getWordsLesson7());
        words.add(new Word("Lección 8","","",-1));
        words.addAll(lessonsWords.getWordsLesson8());
        words.add(new Word("Lección 9","","",-1));
        words.addAll(lessonsWords.getWordsLesson9());
        words.add(new Word("Lección 10","","",-1));
        words.addAll(lessonsWords.getWordsLesson10());
        words.add(new Word("Lección 11","","",-1));
        words.addAll(lessonsWords.getWordsLesson11());
        words.add(new Word("Lección 12","","",-1));
        words.addAll(lessonsWords.getWordsLesson12());
        words.add(new Word("Lección 13","","",-1));
        words.addAll(lessonsWords.getWordsLesson13());
        words.add(new Word("Lección 14","","",-1));
        words.addAll(lessonsWords.getWordsLesson14());
        words.add(new Word("Lección 15","","",-1));
        words.addAll(lessonsWords.getWordsLesson15());
        words.add(new Word("Lección 16","","",-1));
        words.addAll(lessonsWords.getWordsLesson16());

        final WordsListAdapter wordsAdapter = new WordsListAdapter(getActivity(),words);
        listViewVocabulary.setAdapter(wordsAdapter);

        LessonsKanjis lessonsKanjis = Utils.loadAllKanjis();
        kanjis = new ArrayList<Kanji>();
        kanjis.add(new Kanji("","Lección 1",-1));
        kanjis.addAll(lessonsKanjis.getKanjisLesson1());
        kanjis.add(new Kanji("","Lección 2",-1));
        kanjis.addAll(lessonsKanjis.getKanjisLesson2());
        kanjis.add(new Kanji("","Lección 3",-1));
        kanjis.addAll(lessonsKanjis.getKanjisLesson3());
        kanjis.add(new Kanji("","Lección 4",-1));
        kanjis.addAll(lessonsKanjis.getKanjisLesson4());
        kanjis.add(new Kanji("","Lección 5",-1));
        kanjis.addAll(lessonsKanjis.getKanjisLesson5());
        kanjis.add(new Kanji("","Lección 6",-1));
        kanjis.addAll(lessonsKanjis.getKanjisLesson6());
        kanjis.add(new Kanji("","Lección 7",-1));
        kanjis.addAll(lessonsKanjis.getKanjisLesson7());
        kanjis.add(new Kanji("","Lección 8",-1));
        kanjis.addAll(lessonsKanjis.getKanjisLesson8());
        kanjis.add(new Kanji("","Lección 9",-1));
        kanjis.addAll(lessonsKanjis.getKanjisLesson9());
        kanjis.add(new Kanji("","Lección 10",-1));
        kanjis.addAll(lessonsKanjis.getKanjisLesson10());
        kanjis.add(new Kanji("","Lección 11",-1));
        kanjis.addAll(lessonsKanjis.getKanjisLesson11());
        kanjis.add(new Kanji("","Lección 12",-1));
        kanjis.addAll(lessonsKanjis.getKanjisLesson12());
        kanjis.add(new Kanji("","Lección 13",-1));
        kanjis.addAll(lessonsKanjis.getKanjisLesson13());
        kanjis.add(new Kanji("","Lección 14",-1));
        kanjis.addAll(lessonsKanjis.getKanjisLesson14());
        kanjis.add(new Kanji("","Lección 15",-1));
        kanjis.addAll(lessonsKanjis.getKanjisLesson15());
        kanjis.add(new Kanji("","Lección 16",-1));
        kanjis.addAll(lessonsKanjis.getKanjisLesson16());

        final KanjisListAdapter kanjisAdapter = new KanjisListAdapter(getActivity(),kanjis);
        listViewKanjis.setAdapter(kanjisAdapter);

        LessonsWords lessonsAdvanceWords = Utils.loadAllAdvanceLessonWords();

        advanceWords= new ArrayList<Word>();
        advanceWords.add(new Word("Lección 1","","",-1));
        advanceWords.addAll(lessonsAdvanceWords.getWordsLesson1());
        advanceWords.add(new Word("Lección 2","","",-1));
        advanceWords.addAll(lessonsAdvanceWords.getWordsLesson2());
        advanceWords.add(new Word("Lección 3","","",-1));
        advanceWords.addAll(lessonsAdvanceWords.getWordsLesson3());
        advanceWords.add(new Word("Lección 4","","",-1));
        advanceWords.addAll(lessonsAdvanceWords.getWordsLesson4());
        advanceWords.add(new Word("Lección 5","","",-1));
        advanceWords.addAll(lessonsAdvanceWords.getWordsLesson5());
        advanceWords.add(new Word("Lección 6","","",-1));
        advanceWords.addAll(lessonsAdvanceWords.getWordsLesson6());
        advanceWords.add(new Word("Lección 7","","",-1));
        advanceWords.addAll(lessonsAdvanceWords.getWordsLesson7());
        advanceWords.add(new Word("Lección 8","","",-1));
        advanceWords.addAll(lessonsAdvanceWords.getWordsLesson8());
        advanceWords.add(new Word("Lección 9","","",-1));
        advanceWords.addAll(lessonsAdvanceWords.getWordsLesson9());
        advanceWords.add(new Word("Lección 10","","",-1));
        advanceWords.addAll(lessonsAdvanceWords.getWordsLesson10());
        advanceWords.add(new Word("Lección 11","","",-1));
        advanceWords.addAll(lessonsAdvanceWords.getWordsLesson11());
        advanceWords.add(new Word("Lección 12","","",-1));
        advanceWords.addAll(lessonsAdvanceWords.getWordsLesson12());
        advanceWords.add(new Word("Lección 13","","",-1));
        advanceWords.addAll(lessonsAdvanceWords.getWordsLesson13());
        advanceWords.add(new Word("Lección 14","","",-1));
        advanceWords.addAll(lessonsAdvanceWords.getWordsLesson14());
        advanceWords.add(new Word("Lección 15","","",-1));
        advanceWords.addAll(lessonsAdvanceWords.getWordsLesson15());
        advanceWords.add(new Word("Lección 16","","",-1));
        advanceWords.addAll(lessonsAdvanceWords.getWordsLesson16());

        final AdvanceVocabularyListAdapter advanceVocabularyListAdapter = new AdvanceVocabularyListAdapter(getActivity(),advanceWords);
        listViewAdvanceVocabulary.setAdapter(advanceVocabularyListAdapter);

        searchTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                japaneseSearch=false;
                if(charSequence.length()>0){
                    int i = (int) charSequence.charAt(0);
                    if((i>=60 && i<=90) || (i>=97 && i<=122)){
                        japaneseSearch=false;
                    }else{
                        japaneseSearch=true;
                    }
                    searchText= charSequence.toString();

                }
                wordsAdapter.setJapaneseSearch(japaneseSearch);
                if(!japaneseSearch){
                    searchText = Normalizer.normalize(searchText, Normalizer.Form.NFD);
                    searchText = searchText.replaceAll("[^\\p{ASCII}]", "");
                }


                wordsAdapter.getFilter().filter(searchText);
                advanceVocabularyListAdapter.setJapaneseSearch(japaneseSearch);
                advanceVocabularyListAdapter.getFilter().filter(searchText);
                kanjisAdapter.setJapaneseSearch(japaneseSearch);
                kanjisAdapter.getFilter().filter(searchText);




            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        return rootView;
    }
}
