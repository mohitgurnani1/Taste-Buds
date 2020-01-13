package com.codingc.team20.restofinder;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class aboutus   extends Fragment {


	public aboutus()
	{
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view=inflater.inflate(R.layout.about_us,container, false);
	//	IntentIntegrator integrator = new IntentIntegrator(yourActivity);
		//integrator.initiateScan();
		return view;
	}

}
