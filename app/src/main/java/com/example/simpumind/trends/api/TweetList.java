package com.example.simpumind.trends.api;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class TweetList  {

	@SerializedName("statuses")
	public ArrayList<Tweet> tweets;

}
