package com.example.chinmayee.visafamily;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends android.support.v4.app.Fragment {
    private String title;

    public static SecondFragment newInstance(String title) {
        SecondFragment fragmentsecond = new SecondFragment();
        Bundle args = new Bundle();
        args.putString("someTitle", title);
        fragmentsecond.setArguments(args);
        return fragmentsecond;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        title = getArguments().getString("someTitle");

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.card_title1);
        tvLabel.setText(title);
        return view;
    }




}

