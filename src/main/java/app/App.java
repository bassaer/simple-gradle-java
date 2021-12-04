package app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
  public static void main(String[] args) {
    User user = new User(100, "User1");
    System.out.println(user.getId());
    System.out.println(user.getName());
    String src = "{\"id\":123,\"name\":\"foo\"}";
    ObjectMapper mapper = new ObjectMapper();
    try {
        System.out.println(mapper.readValue(src, User.class).getName());
    } catch(JsonProcessingException e) {
        System.out.println("Error: " + e.getLocalizedMessage());
    }
  }
}
