package com.jrmd.benkyoshimasu.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jrmd.benkyoshimasu.R;
import com.jrmd.benkyoshimasu.activity.AdvanceVocabularyActivity;
import com.jrmd.benkyoshimasu.activity.KanjisActivity;
import com.jrmd.benkyoshimasu.activity.ListActivity;
import com.jrmd.benkyoshimasu.activity.PracticeWritingActivity;
import com.jrmd.benkyoshimasu.activity.SettingsActivity;
import com.jrmd.benkyoshimasu.activity.VocabularyActivity;

/**
 * Created by julian on 13/11/2016.
 */

public class WelcomeFragment extends Fragment implements View.OnClickListener{

    View rootView;
    Button mVocabularyButton, mKanjisButton,mAdvVocabularyButton,mWritingPractice;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         rootView = inflater.inflate(R.layout.fragment_welcome, container, false);

        mVocabularyButton= (Button)rootView.findViewById(R.id.welcome_vocabulary_button);
        mKanjisButton = (Button)rootView.findViewById(R.id.welcome_kanjis_button);
        mAdvVocabularyButton = (Button)rootView.findViewById(R.id.welcome_advance_vocabulary_button);
        mWritingPractice = (Button)rootView.findViewById(R.id.welcome_write_advance_vocabulary_button);

        mVocabularyButton.setOnClickListener(this);
        mKanjisButton.setOnClickListener(this);
        mAdvVocabularyButton.setOnClickListener(this);
        mWritingPractice.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.welcome_vocabulary_button:
                Intent intentV= new Intent(getActivity(),VocabularyActivity.class);
                startActivity(intentV);
                break;
            case R.id.welcome_kanjis_button:
                Intent intentK= new Intent(getActivity(),KanjisActivity.class);
                startActivity(intentK);
                break;
            case R.id.welcome_advance_vocabulary_button:
                Intent intentAV= new Intent(getActivity(),AdvanceVocabularyActivity.class);
                startActivity(intentAV);
                break;
            case R.id.welcome_write_advance_vocabulary_button:
                Intent intentPW= new Intent(getActivity(),PracticeWritingActivity.class);
                startActivity(intentPW);
                break;
            default:
                break;
        }
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.main, menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            startActivity(new Intent(getActivity(), SettingsActivity.class));
            return true;
        }
        if(id == R.id.action_list){
            startActivity(new Intent(getActivity(), ListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
