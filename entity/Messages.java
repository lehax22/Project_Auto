package entity;

import java.sql.Timestamp;

/**
 * Created by Alex on 20.11.2016.
 */
public class Messages {

    private long id;
    private long send;
    private long recipient;
    private String content;
    private Timestamp time;
    private boolean unread;

    public Messages(long id, long send, long recipient, String content, Timestamp time, boolean unread) {
        this.id = id;
        this.send = send;
        this.recipient = recipient;
        this.content = content;
        this.time = time;
        this.unread = unread;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSend() {
        return send;
    }

    public void setSend(long send) {
        this.send = send;
    }

    public long getRecipient() {
        return recipient;
    }

    public void setRecipient(long recipient) {
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public boolean isUnread() {
        return unread;
    }

    public void setUnread(boolean unread) {
        this.unread = unread;
    }
}
