import java.util.Calendar;
import java.util.Date;

public class Post implements Likeable, Comparable<Post> {

    protected int likes;
    private Date timeStamp;
    private String userName;

    public Post(String userName) {
        this.userName = userName;
        this.timeStamp = Calendar.getInstance().getTime();
    }

    public String getUserName() {
        return userName;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    //methods required by the interface Likeable
    public void like() {
        likes++;
    }

    public int getLikes() {
        return likes;
    }

    public String toString() {
        return getClass().getName() + ": " + timeStamp + ", " + userName + ", likes = " + likes;
    }

    //method comparing date of 2 posts
    public int compareTo(Post other) {
        return this.timeStamp.compareTo(other.getTimeStamp());
    }

    //method returning true if post is popular (>100 likes)
    public boolean isPopular() {
        return likes > 100;
    }
}