package app;

import app.tasks.JsonTask;
import app.tasks.Task;
import app.tasks.UserTask;

import java.util.List;

public class App {
  public static void main(String[] args) {
      List.of(
          new UserTask(),
          new JsonTask()
      ).forEach(Task::run);
  }
}
