package com.paulusworld.drawernavigationtabs;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Hemorvi Champaneria on 24-05-2015.
 */
public class FirstClassActivity extends Activity implements ActionBar.OnNavigationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
    }

    @Override
    public boolean onNavigationItemSelected(int i, long l) {
        return false;
    }
}
