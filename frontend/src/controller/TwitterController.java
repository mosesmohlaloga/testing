package controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Tweet;

import service.TweetEJB;
import twitter4j.TwitterException;



@ManagedBean(name = "twittercontroller")
@SessionScoped
public class TwitterController{
	

	
	
    @EJB
    private TweetEJB TweetEJB;

 
    
  //from form
  	@ManagedProperty(value="#{tweet}")
  	
    private Tweet tweet;
  	
  	
    private List<Tweet> tweettList = new ArrayList<>();

	 
   public List<Tweet> getTweetList() {
       
        return tweettList;
    }
 
   public String viewTwitter(){
        return "twittetList.xhtml";
    }
   
    public String addNewTweet()  {
    	TweetEJB.addNew(tweet.getEntity());
    	return "tweettList.xhtml";
        
    }
    
    public String addNewPost() throws TwitterException  {
    	TweetEJB.postTweet(tweet.getTweetBody());
    	
    	return "tweettList.xhtml";
        
    }
    


	public Tweet getTweet() {
		return tweet;
	}

	public void setTweet(Tweet tweet) {
		this.tweet = tweet;
	}
	
	
	

}