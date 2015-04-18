package com.example.thriveni.twitterapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity  extends Activity{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
			
		SharedPreferences pref = getSharedPreferences("codelearn_twitter",MODE_PRIVATE);
		
		String uname = pref.getString("key_name", null);
		String pass = pref.getString("key_pass", null);
		
		System.out.println(uname +";"+pass);
		  
		
		/*Intent listintent = new Intent(getApplicationContext(), LoginActivity.class);
		startActivity(listintent);	*/
		
		
		if((uname != null) && (pass!=null)){
					
			System.out.println("login"+uname +";"+pass);
			Intent listintent = new Intent(getApplicationContext(), TweetListActivity.class);
			startActivity(listintent);	
			finish();
			
		}else
		{
		
			System.out.println("Tweet:"+uname +";"+pass);
			Intent listintent = new Intent(getApplicationContext(), LoginActivity.class);
			startActivity(listintent);	
			finish();
			
		}
		
		super.onCreate(savedInstanceState);
	}

}
