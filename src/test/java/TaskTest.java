import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {

  @Test
  public void Task_instantiatesCorrectly_true() {
    Task myTask = new Task("Water the garden");
    assertEquals(true, myTask instanceof Task);
  }

  @Test public void Task_instantiatesWithDescription_true() {
    Task myTask = new Task("Water the garden");
    assertEquals("Water the garden", myTask.getDescription());
  }
}
