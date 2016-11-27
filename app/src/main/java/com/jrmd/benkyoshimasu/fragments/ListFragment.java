package com.jrmd.benkyoshimasu.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.jrmd.benkyoshimasu.R;
import com.jrmd.benkyoshimasu.Utils;
import com.jrmd.benkyoshimasu.adapter.KanjisListAdapter;
import com.jrmd.benkyoshimasu.adapter.WordsListAdapter;
import com.jrmd.benkyoshimasu.object.Kanji;
import com.jrmd.benkyoshimasu.object.LessonsKanjis;
import com.jrmd.benkyoshimasu.object.LessonsWords;
import com.jrmd.benkyoshimasu.object.Word;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by julian on 26/11/2016.
 */

public class ListFragment extends Fragment {

    private View rootView;
    private ListView listViewVocabulary,listViewKanjis;
    private List<Word> words;
    private List<Kanji> kanjis;
    private int from;
    private TabLayout tabLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_list, container, false);
        listViewVocabulary = (ListView) rootView.findViewById(R.id.fragment_list_vocabulary);
        listViewKanjis = (ListView) rootView.findViewById(R.id.fragment_list_kanjis);
        tabLayout = (TabLayout) rootView.findViewById(R.id.list_tablayout);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                listViewVocabulary.setVisibility(View.GONE);
                listViewKanjis.setVisibility(View.GONE);
                switch (tab.getPosition()){
                    case 0:
                        listViewVocabulary.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        listViewKanjis.setVisibility(View.VISIBLE);
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

        WordsListAdapter wordsAdapter = new WordsListAdapter(getActivity(),words);
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

        KanjisListAdapter kanjisAdapter = new KanjisListAdapter(getActivity(),kanjis);
        listViewKanjis.setAdapter(kanjisAdapter);


        return rootView;
    }
}
