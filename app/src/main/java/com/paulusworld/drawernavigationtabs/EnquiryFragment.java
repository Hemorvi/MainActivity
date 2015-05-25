package com.paulusworld.drawernavigationtabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class EnquiryFragment extends Fragment {

    public static final String TAG = EnquiryFragment.class.getSimpleName();

    private static final String ARG_SECTION_NUMBER = "section_number";

    public static EnquiryFragment newInstance() {
        EnquiryFragment fragment = new EnquiryFragment();
        Bundle args = new Bundle();
        //args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public EnquiryFragment() {
    }


    public void onBackPressed() {
        return;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_enquiry, container, false);

        rootView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                return keyCode == KeyEvent.KEYCODE_BACK;
            }
        });


        return rootView;
    }

        /*@Override*/
       /* public void onAttach (Activity activity){
            super.onAttach(activity);
            ((MainActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }*/

}
