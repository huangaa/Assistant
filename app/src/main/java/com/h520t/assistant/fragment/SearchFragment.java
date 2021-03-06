package com.h520t.assistant.fragment;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.h520t.assistant.R;
import com.h520t.assistant.search.activity.information.CalenderActivity;
import com.h520t.assistant.search.activity.search.GPAActivity;
import com.h520t.assistant.search.activity.search.SearchActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {
    private CardView gradeSearch;
    private CardView GPASearch;
    private CardView calender;

    @SuppressLint("ValidFragment")
    private SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        gradeSearch = view.findViewById(R.id.grade_search);
        GPASearch = view.findViewById(R.id.gpa_search);
        calender = view.findViewById(R.id.calender);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        gradeSearch.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), SearchActivity.class);
            startActivity(intent);
        });

        GPASearch.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), GPAActivity.class);
            startActivity(intent);
        });

        calender.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), CalenderActivity.class);
            startActivity(intent);
        });

    }

    public static SearchFragment getInstance(){
        return SearchFragmentHolder.SEARCH_FRAGMENT;
    }

    private static class SearchFragmentHolder{
        private static final SearchFragment SEARCH_FRAGMENT = new SearchFragment();
    }
}
