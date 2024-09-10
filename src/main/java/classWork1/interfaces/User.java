package classWork1.interfaces;

public class User {
    private String name;
    private String surName;

    private User(String surName, String name) {
        this.surName = surName;
        this.name = name;
    }

    public static User of(String name, String surName){
        return new User(name, surName);
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
