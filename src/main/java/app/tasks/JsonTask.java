package app.tasks;

import app.models.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTask implements Task {
    @Override
    public void run() {
        String src = "{\"id\":123,\"name\":\"foo\"}";
        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.readValue(src, User.class).getName());
        } catch(JsonProcessingException e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }
    }
}
