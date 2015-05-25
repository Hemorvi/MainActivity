package com.paulusworld.drawernavigationtabs;

import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.content.res.Configuration;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {

	private static final String TAG = MainActivity.class.getSimpleName();


    public String selectedFromList;
	private DrawerLayout mDrawerLayout;
	private ListView mDrawerList;
	private ActionBarDrawerToggle mDrawerToggle;
	
	private CharSequence mDrawerTitle;
	private CharSequence mTitle;
	private String[] mDrawerItmes;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mTitle = mDrawerTitle = getTitle();
		
		mDrawerItmes = getResources().getStringArray(R.array.drawer_titles);
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

		mDrawerList = (ListView) findViewById(R.id.left_drawer);

		
		// set a custom shadow that overlays the main content when the drawer oepns
		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,  GravityCompat.START);
		
		// Add items to the ListView
		mDrawerList.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_list_item, mDrawerItmes));
		// Set the OnItemClickListener so something happens when a 
		// user clicks on an item.
		mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
		
		// Enable ActionBar app icon to behave as action to toggle nav drawer
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setHomeButtonEnabled(true);
		
		mDrawerToggle = new ActionBarDrawerToggle(
				this, 
				mDrawerLayout, 
				R.drawable.ic_drawer, 
				R.string.drawer_open, 
				R.string.drawer_close
				) {
			public void onDrawerClosed(View view) {
				//getActionBar().setTitle(mTitle);
                getActionBar().setTitle(selectedFromList);
				invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu
			}
			
			public void onDrawerOpened(View drawerView) {
				getActionBar().setTitle(mDrawerTitle);
				invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu
			}
		};

		mDrawerLayout.setDrawerListener(mDrawerToggle);

		
		// Set the default content area to item 0
		// when the app opens for the first time
		if(savedInstanceState == null) {
			navigateTo(1);
		}
	
	}
	
	/*
	 * If you do not have any menus, you still need this function
	 * in order to open or close the NavigationDrawer when the user 
	 * clicking the ActionBar app icon.
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(mDrawerToggle.onOptionsItemSelected(item)) {
			return true;
		}		
		return super.onOptionsItemSelected(item);		
	}
	
	/*
	 * When using the ActionBarDrawerToggle, you must call it during onPostCreate()
	 * and onConfigurationChanged()
	 */
	
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		mDrawerToggle.syncState();
	}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		mDrawerToggle.onConfigurationChanged(newConfig);
	}
	
	private class DrawerItemClickListener implements OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Log.v(TAG, "ponies");
			navigateTo(position);

            selectedFromList =(String) (mDrawerList.getItemAtPosition(position));

            getActionBar().setTitle(selectedFromList);

			//mDrawerList.setItemChecked(position, true);
            mDrawerLayout.closeDrawer(mDrawerList);

		}
	}
	
	private void navigateTo(int position) {
		Log.v(TAG, "List View Item: " + position);
		
		switch(position) {
		case 0:

			getSupportFragmentManager()
					.beginTransaction()
					.replace(R.id.content_frame, TabbedActivitySecond.newInstance(), TabbedActivitySecond.TAG).commit();
			/*getSupportFragmentManager()
			.beginTransaction()
			.replace(R.id.content_frame,
                    ProfileFragment.newInstance(),
                    ProfileFragment.TAG).commit();*/
			/*getSupportFragmentManager()
				.beginTransaction()
				.add(R.id.content_frame, 
						ItemOne.newInstance(),
						ItemOne.TAG).commit();*/			
			break;
		case 1:
			/*getSupportFragmentManager()
				.beginTransaction()
				.replace(R.id.content_frame,
						SpurthyProfileFragment.newInstance(),
						SpurthyProfileFragment.TAG).commit();*/
			getSupportFragmentManager()
			.beginTransaction()
			.replace(R.id.content_frame, TabbedActivity.newInstance(), TabbedActivity.TAG).commit();
			break;

			case 2:

				getSupportFragmentManager()
						.beginTransaction()
						.replace(R.id.content_frame, PostFragment.newInstance(), PostFragment.TAG).commit();
				break;

			case 3:

				getSupportFragmentManager()
						.beginTransaction()
						.replace(R.id.content_frame, WebViewFragment.newInstance(), WebViewFragment.TAG).commit();
				break;

			case 4:

				getSupportFragmentManager()
						.beginTransaction()
						.replace(R.id.content_frame,
								DirectoryTabActivity.newInstance(),
								DirectoryTabActivity.TAG).commit();
				break;

            case 5:

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content_frame, TabbedActivityThird.newInstance(), TabbedActivityThird.TAG).commit();
                break;

			case 6:

				getSupportFragmentManager()
						.beginTransaction()
						.replace(R.id.content_frame, TabbedActivityForth.newInstance(), TabbedActivityForth.TAG).commit();
				break;


			case 7:
				getSupportFragmentManager()
						.beginTransaction()
						.replace(R.id.content_frame,
								OthersTabActivity.newInstance(),
								OthersTabActivity.TAG).commit();
				break;
		}
	}
	
	@Override
	public void setTitle(CharSequence title) {
		mTitle = title;
		getActionBar().setTitle(mTitle);
	}
	
}
