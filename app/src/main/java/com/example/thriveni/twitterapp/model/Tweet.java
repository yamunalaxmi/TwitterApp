package com.example.thriveni.twitterapp.model;

public class Tweet /*implements Serializable */{

    private static final long serialVersionUID = 1L;
	String id, title , body;

	public String getId() {

        return id;
	}

	public void setId(String id)
    {
		this.id = id;
	}

	public String getTitle()
    {
		return title;
	}

	public void setTitle(String title)
    {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
}
