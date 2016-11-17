package entity;

/**
 * Created by Alex on 14.11.2016.
 */
public class Individual {

    private String path_to_the_photo;
    private String firstname;
    private String lastname;
    private Male male;
    private Birthdate date;
    private int driving_stage;
    private String car;

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

    public Male getMale() {
        return male;
    }
    public void setMale(Male male) {
        this.male = male;
    }

    public Birthdate getDate() {
        return date;
    }
    public void setDate(Birthdate date) {
        this.date = date;
    }

    public int getDriving_stage() {
        return driving_stage;
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

    public Individual(String path_to_the_photo, String firstname, String lastname, Male male, Birthdate date, int driving_stage, String car) {
        this.path_to_the_photo = path_to_the_photo;
        this.firstname = firstname;
        this.lastname = lastname;
        this.male = male;
        this.date = date;
        this.driving_stage = driving_stage;
        this.car = car;
    }
}

