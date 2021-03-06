package com.jrmd.benkyoshimasu.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jrmd.benkyoshimasu.R;
import com.jrmd.benkyoshimasu.activity.KanjisActivity;
import com.jrmd.benkyoshimasu.activity.VocabularyActivity;

/**
 * Created by julian on 13/11/2016.
 */

public class WelcomeFragment extends Fragment implements View.OnClickListener{

    View rootView;
    Button mVocabularyButton,KanjisButton;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         rootView = inflater.inflate(R.layout.fragment_welcome, container, false);

        mVocabularyButton= (Button)rootView.findViewById(R.id.welcome_vocabulary_button);
        KanjisButton= (Button)rootView.findViewById(R.id.welcome_kanjis_button);

        mVocabularyButton.setOnClickListener(this);
        KanjisButton.setOnClickListener(this);

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
            default:
                break;
        }
    }
}
