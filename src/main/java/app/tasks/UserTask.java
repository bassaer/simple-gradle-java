package app.tasks;

import app.models.User;

public class UserTask implements Task{

    @Override
    public void run() {
        User user = new User(100, "User1");
        System.out.println(user.getId());
        System.out.println(user.getName());
    }

}
