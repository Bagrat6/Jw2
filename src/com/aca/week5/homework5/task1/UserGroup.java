package com.aca.week5.homework5.task1;

public class UserGroup implements Cloneable {
    private User[] users;
    private static int size = 10;


    public UserGroup(User[] users) {
        if (users.length > 10) {
            throw new IllegalArgumentException("Error");
        }
        this.users = new User[size];
        for (int i = 0; i < users.length; i++) {
            this.users[i] = new User(users[i]);
        }
    }

    public void printUsers() {
        for (int i = 0; i < users.length; i++) {
            if(this.users[i] != null){
                System.out.println(users[i].getFirstName());
            }
        }
    }

    public void addUser(User user){
        if(user == null){
            throw new IllegalArgumentException("The user is null");
        }
        Boolean test = true;
        for(int i = 0; i < users.length; i++){
            if(users[i] == null){
                users[i] = new User(user);
                test = false;
                break;
            }
        }
        if (test){
            throw new IllegalArgumentException("There is no space left in array.");
        }
    }

    @Override
    protected UserGroup clone() throws CloneNotSupportedException {
        UserGroup userGroup = (UserGroup) super.clone();
        for(int i = 0; i < userGroup.users.length; i++){
            if(this.users[i] != null){
                userGroup.users[i] = new User(this.users[i]);
            }
        }
        return userGroup;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("a", "a", "a", "a");
        User user1 = new User("b", "b", "b", "b");
        User user2 = new User("c", "c", "c", "c");
        User[] users = {user, user1, user2};
        UserGroup userGroup = new UserGroup(users);
        userGroup.printUsers();
        User user3 = new User("d","d","d","D");
        User[] users1 = {user3};
        UserGroup userGroup1 = new UserGroup(users1);
        userGroup1 = userGroup.clone();

        userGroup.printUsers();
        userGroup1.printUsers();


    }
}
