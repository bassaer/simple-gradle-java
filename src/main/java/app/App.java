package app;

import com.google.gson.Gson;

public class App {
  public static void main(String[] args) {
    Gson gson = new Gson();
    User user = new User(100, "User1");
    System.out.println(gson.toJson(user));
  }
}
