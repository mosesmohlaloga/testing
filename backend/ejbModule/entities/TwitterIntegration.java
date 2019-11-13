package entities;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;



public class TwitterIntegration {
	

	public static Twitter getTwitterinstance() {
	ConfigurationBuilder cb = new ConfigurationBuilder();
	cb.setDebugEnabled(true)
	  .setOAuthConsumerKey("fMuB19EjYXAc5byQU5nnqmeNo")
	  .setOAuthConsumerSecret("kPg8MnUzjieFBW7KCLLRX62oFPrg8fVcEPBZwho5tk2pr9DpUK")
	  .setOAuthAccessToken("1176477308032552961-yAQFdV9bogHPNkW7GogM6segxJMkZc")
	  .setOAuthAccessTokenSecret("1zaejXSnH8qNvu0cvQJDJAsGWTnrANJt9sqRJryxnK1lm");
	TwitterFactory tf = new TwitterFactory(cb.build());
    Twitter twitter = tf.getInstance();
	

	return twitter;
	
	}
	public static String createTweet(String tweetBody) throws TwitterException {
	    Twitter twitter = getTwitterinstance();
	    Status status = twitter.updateStatus(tweetBody);
	    return status.getText();
	}
	
	
	
	
}



	

