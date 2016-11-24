package entity;

/**
 * Created by Alex on 21.11.2016.
 */
public class Follows {

    private long id;
    private User user;
    private User follower;

    public Follows(long id, User user, User follower) {
        this.id = id;
        this.user = user;
        this.follower = follower;
    }

    public Follows(User follower) {
        this.follower = follower;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getFollower() {
        return follower;
    }

    public void setFollower(User follower) {
        this.follower = follower;
    }
}
