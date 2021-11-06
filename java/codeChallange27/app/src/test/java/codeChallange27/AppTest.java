/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codeChallange27;

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
  public void testSorted() {
    int arr[] = {15, 22, 66, 73, 100};
    app.mergeSort(arr);
    for (int i = 0; i < arr.length - 1; i++) {
      Assertions.assertTrue(arr[i] <= arr[i + 1], "Returns true if sorted");
    }
  }

  @Test
  public void testEmpty() {
    int arr[] = {};
    app.mergeSort(arr);
    Assertions.assertTrue(arr.length == 0 , "returns an empty array");
  }
}