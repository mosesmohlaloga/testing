package entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="tweet_tbl")
public class TwitterEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long TweetID;
	
	private String tweetBody;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getTweetBody() {
		return tweetBody;
	}

	public void setTweetBody(String tweetBody) {
		this.tweetBody = tweetBody;
	}
	


}
