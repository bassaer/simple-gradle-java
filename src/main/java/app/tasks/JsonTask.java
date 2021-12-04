package app.tasks;

import app.models.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTask implements Task {
    @Override
    public void run() {
        String src = "{\"id\":123,\"name\":\"foo\",\"message\":\"hello\"}";
        User user = new User(456, "abc");
        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.readValue(src, User.class).getName());
            System.out.println(mapper.writeValueAsString(user));
        } catch(JsonProcessingException e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }
    }


}
