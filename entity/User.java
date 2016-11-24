package entity;

/**
 * Created by Alex on 18.11.2016.
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

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath_to_the_photo() {
        return path_to_the_photo;
    }

    public void setPath_to_the_photo(String path_to_the_photo) {
        this.path_to_the_photo = path_to_the_photo;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDriving_stage() {
        return driving_stage;
    }

    public String getStrDriving_stage() {
        return "" + driving_stage;
    }

    public void setDriving_stage(int driving_stage) {
        this.driving_stage = driving_stage;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}
