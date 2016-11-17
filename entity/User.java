package entity;

/**
 * Created by Alex on 13.11.2016.
 */
public class User {
    private long id;
    private String login;
    private String password;
    private String path_to_the_photo;
    private String firstname;
    private String lastname;
    private String male;
    private String date;
    private int driving_stage;
    private String car;

    public User(long id, String login, String password, String path_to_the_photo, String firstname, String lastname, String male, String date, int driving_stage, String car) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.path_to_the_photo = path_to_the_photo;
        this.firstname = firstname;
        this.lastname = lastname;
        this.male = male;
        this.date = date;
        this.driving_stage = driving_stage;
        this.car = car;
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

}


