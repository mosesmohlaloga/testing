package model;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.TwitterEntity;

@ManagedBean(name = "tweet")
@SessionScoped
public class Tweet implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String tweetBody;
	private Date timeStamp;
	
	
	public TwitterEntity getEntity()
	{
		TwitterEntity twitterEntity = new TwitterEntity();
		twitterEntity.setTweetBody(tweetBody);
		twitterEntity.setTimestamp(new Date());
		
		return twitterEntity;
		
		
	}
		
	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getTweetBody() {
		return tweetBody;
	}

	public void setTweetBody(String tweetBody) {
		this.tweetBody = tweetBody;
	}
	

}
