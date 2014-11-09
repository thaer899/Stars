package StarsUpRSS;


import StarsUpRSS.Feed;
import StarsUpRSS.FeedMessage;
import StarsUpRSS.RSSFeedParser;

public class ReadTest {
  public static void main(String[] args) {
    RSSFeedParser parser = new RSSFeedParser("http://news.google.fr/?output=rss");
    Feed feed = parser.readFeed();
    System.out.println(feed);
    for (FeedMessage message : feed.getMessages()) {
      System.out.println(message);

    }

  }
} 