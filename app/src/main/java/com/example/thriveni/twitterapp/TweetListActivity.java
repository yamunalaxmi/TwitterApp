package com.example.thriveni.twitterapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.thriveni.twitterapp.model.Tweet;

import java.util.ArrayList;
import java.util.List;

public class TweetListActivity extends ListActivity{
	ListView tweetlist;
	String tweetlistarray[] = new String[10];
	ArrayAdapter<Tweet> arrayadapter ;
	
	List<Tweet>  tweets = new ArrayList<Tweet>(); 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tweetlist);
		
	//	tweetlist = (ListView)findViewById(R.id.list);
		
		/*for(int i=0;i<10;i++){
		
			tweetlistarray[i]= "String "+i;
			
		}*/
		
		
		for ( int i = 0; i < 20; i++ ) {
		    Tweet tweet = new Tweet();
		    tweet.setTitle("A nice header for Tweet # " +i);
		    tweet.setBody("Some random body text for the tweet # " +i);
		    tweets.add(tweet);
		}
		
	//	arrayadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tweetlistarray);
		
		arrayadapter = new TweetAdapter(this, tweets);
		setListAdapter(arrayadapter);
		
		
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {

		/*TextView t = (TextView)v.findViewById(R.id.tweetTitle);
		t.setText("Tweet Clicked");*/
		 Tweet tweet = new Tweet();
		TextView header = (TextView) v.findViewById(R.id.tweetTitle);
		TextView body = (TextView) v.findViewById(R.id.tweetbodytxt);
		TextView date = (TextView) v.findViewById(R.id.tweet_date);
		
		//header.setText(tweet.getTitle().toString()[position]);
		//header.setText(tweet)
	//	header.setText(tweets.get(position));
		
		Intent intent = new Intent(getApplicationContext(), TweetDetailActivity.class);
		startActivity(intent);
	}
	
}
