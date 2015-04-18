package com.example.thriveni.twitterapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.thriveni.twitterapp.model.Tweet;

import java.util.List;

public class TweetAdapter extends ArrayAdapter<Tweet> {
	private LayoutInflater infalter;
    private final List<Tweet> tweetlist;
    private final Activity activity;

	public TweetAdapter(Activity activity, List<Tweet> tweets) {
		super(activity, R.layout.rowtweet,  tweets);

		//infalter = activity.getWindow().getLayoutInflater();
        this.activity = activity;
        this.tweetlist = tweets;

	}


    static class ViewHolder {

        protected TextView header;
        protected TextView body;
        protected TextView date;
    }


	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

        View view = null;
      //	return infalter.inflate(R.layout.rowtweet, parent, false);
        if (convertView == null) {
            LayoutInflater inflator = activity.getLayoutInflater();

            view = inflator.inflate(R.layout.rowtweet, null);

            final ViewHolder viewHolder = new ViewHolder();

            viewHolder.header = (TextView) view.findViewById(R.id.tweetTitle);
            viewHolder.body = (TextView) view.findViewById(R.id.tweetbodytxt);
            viewHolder.date = (TextView) view.findViewById(R.id.tweet_date);
            view.setTag(viewHolder);

        } else {
            view = convertView;
        }
        ViewHolder holder = (ViewHolder) view.getTag();
        holder.header.setText(tweetlist.get(position).getTitle());
        holder.body.setText(tweetlist.get(position).getBody());
        holder.date.setText(tweetlist.get(position).getId());
        return view;
    }
	

	
}
