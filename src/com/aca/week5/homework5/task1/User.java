package com.aca.week5.homework5.task1;

public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String email;

    public User(){}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public User(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }

    public User(User user){
        copy(user);
    }

    public void copy(User user){
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.username = user.getUsername();
        this.email = user.getEmail();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User user = new User("a","a","a","a");
        User user1 = new User(user);
        System.out.println(user1);
        user.setFirstName("Gagul");
        System.out.println(user);
        System.out.println(user1);
    }

}
