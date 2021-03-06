package com.codingc.team20.restofinder;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Tab1Fragment();
		case 1:
			// Games fragment activity
			return new Tab5Fragment();
		case 2:
			// Movies fragment activity
			return new Tab3Fragment();
		case 3:
			// Movies fragment activity
			return new Tab2Fragment();
		case 4:
			// Movies fragment activity
			return new Tab4Fragment();
	
		
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 5;
	}

}
