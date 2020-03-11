import ca.ciccc.MagicSquare;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestMagicSquare {

    @Parameterized.Parameters(name = "{index}: MagicSquare.isMagicSquare([{index}]) = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new Integer[][]{{1, 2}, {2, 1}}, Boolean.TRUE}, // [0]
                {new Integer[][]{{1, 1}, {2, 1}}, Boolean.FALSE}, // [1]
                {new Integer[][]{{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}}, Boolean.TRUE}, // [2]
                {new Integer[][]{{5, 10, 1, 3}, {10, 4, 2, 3}, {1, 2, 8, 5}, {3, 3, 5, 0}}, Boolean.FALSE}, // [3]
                {new Integer[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}}, Boolean.FALSE}, // [4]
                {new Integer[][]{{1, 2, 3}, {3, 1, 2}, {2, 3, 1}}, Boolean.TRUE}, // [5]
        });
    }
    @Parameterized.Parameter
    public Integer[][] inputSquare;
    @Parameterized.Parameter(1)
    public boolean expected;
    @Test
    public void testIsMagicSquareData() {
        Assert.assertEquals(expected, MagicSquare.isMagicSquare(inputSquare));
    }
}
