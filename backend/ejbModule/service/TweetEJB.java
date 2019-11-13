package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import entities.TwitterEntity;
import entities.TwitterIntegration;
import twitter4j.TwitterException;


@Stateless
@LocalBean
public class TweetEJB {


	@PersistenceContext
	private EntityManager em;
	
	public TweetEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNew(TwitterEntity twitterEntity)
    {
    	System.out.println("============================");
    	System.out.println(twitterEntity.getTweetBody());
    	em.persist(twitterEntity);
    	System.out.println("============================");
    	
    }
  
	public void postTweet(String tweetBody) throws TwitterException {
		TwitterIntegration.getTwitterinstance();
		TwitterIntegration.createTweet(tweetBody);

	
	}

}
