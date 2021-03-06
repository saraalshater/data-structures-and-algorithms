/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codechallange26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  App app;

  @BeforeEach
  public void init() {
    app = new App();
  }

  @Test
  public void testExpected() {
    int arr[] = {15, 2, 6, 3, 1};
    app.insertionSort(arr);
    for (int i = 0; i < arr.length - 1; i++) {
      Assertions.assertTrue(arr[i] <= arr[i + 1], "Returns true if sorted");
    }
  }
}
