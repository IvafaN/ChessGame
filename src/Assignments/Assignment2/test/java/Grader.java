import ca.ciccc.Assignment2;
import org.junit.*;
/**
 * Grader for the assignment 2
 * Your code need to pass all test cases.
 * WARNING
 * Just for the simplicity, each test method tests multiple test cases.
 * There are better practices for writing unit test cases.
 */
public class Grader {
    private static Assignment2 assignment2;
    @BeforeClass
    public static void setup() {
        assignment2 = new Assignment2();
    }
    @Test
    public void testNumberLoops() {
        Assert.assertEquals("1", assignment2.numberLoops(1));
        Assert.assertEquals("..1\n.22\n333", assignment2.numberLoops(3));
        Assert.assertEquals("....1\n...22\n..333\n.4444\n55555", assignment2.numberLoops(5));
    }
    @Test
    public void testCountNumbers() {
        Assert.assertEquals(true, assignment2.countNumbers(new int[]{1, 7, 1}));
        Assert.assertEquals(false, assignment2.countNumbers(new int[]{1, 7, 1, 7}));
        Assert.assertEquals(false, assignment2.countNumbers(new int[]{1, 2, 2, 7, 1, 7, 7}));
        Assert.assertEquals(false, assignment2.countNumbers(new int[]{}));
        Assert.assertEquals(true, assignment2.countNumbers(new int[]{1, 7, 1, 7, 1, 6}));
    }
    @Test
    public void testSumExcept13() {
        Assert.assertEquals(6, assignment2.sumExcept13(new int[]{1, 2, 2, 1}));
        Assert.assertEquals(0, assignment2.sumExcept13(new int[]{}));
        Assert.assertEquals(6, assignment2.sumExcept13(new int[]{1, 2, 2, 1, 13}));
        Assert.assertEquals(4, assignment2.sumExcept13(new int[]{1, 2, 13, 2, 1, 13}));
        Assert.assertEquals(0, assignment2.sumExcept13(new int[]{13, 1, 13}));
    }
    @Test
    public void testShiftArray() {
        Assert.assertArrayEquals(new int[]{2, 5, 3, 6}, assignment2.shiftArray(new int[]{6, 2, 5, 3}));
        Assert.assertArrayEquals(new int[]{}, assignment2.shiftArray(new int[]{}));
        Assert.assertArrayEquals(new int[]{1}, assignment2.shiftArray(new int[]{1}));
        Assert.assertArrayEquals(new int[]{2, 3, 1}, assignment2.shiftArray(new int[]{1, 2, 3}));
        Assert.assertArrayEquals(new int[]{1, 1, 1}, assignment2.shiftArray(new int[]{1, 1, 1}));
    }
    @Test
    public void testTripleIncreasingOrder(){
        Assert.assertEquals(true, assignment2.tripleIncreasingOrder(new int[]{1, 4, 5, 6, 5}));
        Assert.assertEquals(true, assignment2.tripleIncreasingOrder(new int[]{1, 2, 3}));
        Assert.assertEquals(false, assignment2.tripleIncreasingOrder(new int[]{1, 2, 4}));
        Assert.assertEquals(false, assignment2.tripleIncreasingOrder(new int[]{1 }));
        Assert.assertEquals(true, assignment2.tripleIncreasingOrder(new int[]{1, 2, 4, 5, 7, 6, 5, 6, 7, 6}));
        Assert.assertEquals(true, assignment2.tripleIncreasingOrder(new int[]{10, 9, 8, -100, -99, -98, 100}));
    }
    @Test
    public void testEvenOrOdds() {
        Assert.assertEquals(false, assignment2.evenOrOdd(new int[]{1, 4, 5, 6, 5}));
        Assert.assertEquals(false, assignment2.evenOrOdd(new int[]{1, 2, 3}));
        Assert.assertEquals( true, assignment2.evenOrOdd(new int[]{1, 2, 4, 5}));
        Assert.assertEquals( true, assignment2.evenOrOdd(new int[]{1, 6}));
        Assert.assertEquals( true, assignment2.evenOrOdd(new int[]{1, 2, 4, 5, 7, 6, 5, 6, 7, 6}));
        Assert.assertEquals( false, assignment2.evenOrOdd(new int[]{10, 9, 8, -100, -99, -98, 100}));
    }
    @AfterClass
    public static void teardown() {
        assignment2 = null;
    }
}