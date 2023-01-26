import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2() {
    int[] input1 = { 3, 4 , 5, 6 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 6, 5, 4, 3 }, input1);
  }

  @Test
  public void testReverseInPlace3() {
    int[] input1 = { 3, 4 , 5, 6, 7};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 7, 6, 5, 4, 3 }, input1);
  }

  @Test
  public void testReversed2() {
    int[] input1 = { 3, 4 ,5, 6};
    assertArrayEquals(new int[]{ 6, 5, 4, 3 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed3() {
    int[] input1 = { 3, 4 ,5, 6, 7} ;
    assertArrayEquals(new int[]{ 7, 6, 5, 4, 3 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverage1() {
    double[] input1 = { 3.0, 4.0, 5.0, 6.0 };
    assertEquals(5, ArrayExamples.averageWithoutLowest(input1), 0);
  }

  @Test
  public void testAverage2() {
    double[] input1 = { 3.0, 4.0, 5.0, 6.0, 3.0 };
    assertEquals(4.5, ArrayExamples.averageWithoutLowest(input1), 0);
  }
}
