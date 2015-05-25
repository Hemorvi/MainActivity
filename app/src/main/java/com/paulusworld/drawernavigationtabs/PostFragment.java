package com.paulusworld.drawernavigationtabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Hemorvi Champaneria on 22-05-2015.
 */
public class PostFragment extends Fragment {

    public final static String TAG = WebViewFragment.class.getSimpleName();

    public PostFragment() {
        // TODO Auto-generated constructor stub
    }

    public static PostFragment newInstance() {
        return new PostFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.post, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /*WebView webView = (WebView) view.findViewById(R.id.webView);
        webView.loadUrl("http://www.spurthyschool.com");*/
        //webView.loadUrl("http://www.paulusworld.com");
    }
}

