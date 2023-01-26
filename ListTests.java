import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class ListTests {
  @Test
  public void testFilter1() {
    String[] input = { "hellos", "worlds", "foo", "bar" };
    String[] expected = { "hellos", "worlds" };


    StringChecker checker = new MyStringChecker();
    List<String> actual = ListExamples.filter(Arrays.asList(input), checker);
    assertArrayEquals(expected, actual.toArray());
  }

  @Test
  public void testFilter2() {
    String[] input = { "hellos", "foo", "bar", "worlds"};
    String[] expected = { "hellos", "worlds" };


    StringChecker checker = new MyStringChecker();
    List<String> actual = ListExamples.filter(Arrays.asList(input), checker);
    assertArrayEquals(expected, actual.toArray());
  }

  @Test
  public void testMerge1() {
    String[] input1 = { "a", "c", "e", "g" };
    String[] input2 = { "b", "d", "f", "h" };
    String[] expected = { "a", "b", "c", "d", "e", "f", "g", "h" };

    List<String> actual = ListExamples.merge(Arrays.asList(input1), Arrays.asList(input2));
    assertArrayEquals(expected, actual.toArray());
  }
}

class MyStringChecker implements StringChecker {
  public boolean checkString(String s) {
    return s.length() > 5;
  }
}
