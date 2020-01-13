package com.codingc.team20.restofinder;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.Session;

public class logout extends Fragment{
public logout(){}


@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	
	View view=inflater.inflate(R.layout.activity_blank,container, false);
//	IntentIntegrator integrator = new IntentIntegrator(yourActivity);
	//integrator.initiateScan();
	
	 Session session = Session.getActiveSession();
	    if (session != null) {

	        if (!session.isClosed()) {
	            session.closeAndClearTokenInformation();
	            //clear your preferences if saved
	              }
	    }
		SharedPreferences setting=MainActivity.a.getSharedPreferences("preference",0);
     	SharedPreferences.Editor edit=setting.edit(); 
 
     	edit.remove("id");
     	edit.remove("name");
     	
     	edit.clear();
     	edit.commit();
           Intent it=new Intent(MainActivity.a,loginActivity.class);
           it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
           startActivity(it);
           
	return view;
}

}
