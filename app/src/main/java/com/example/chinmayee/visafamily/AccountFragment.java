package com.example.chinmayee.visafamily;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment {
    FragmentPagerAdapter adapterViewPager;
    private FragmentActivity myContext;

    public AccountFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      //  Intent i = new Intent(getActivity(), AccountDetails.class);
      //  startActivity(i);
        View view = inflater.inflate(R.layout.view_pager, container, false);
        ViewPager vpPager = (ViewPager) view.findViewById(R.id.pager);
        adapterViewPager = new PageAdapter(myContext.getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);
        return view;
    }


}
