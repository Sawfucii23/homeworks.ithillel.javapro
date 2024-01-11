package homeworks.hw24;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MathLibraryTest {

    @Test
    void testSqrt() {
        assertEquals(3, MathLibrary.sqrt(9), 0.001);
        assertEquals(4, MathLibrary.sqrt(16), 0.001);
        assertEquals(Double.NaN, MathLibrary.sqrt(-1)); // корінь з від'ємного числа
    }


    void testExp() {
        assertEquals(Math.exp(1), MathLibrary.exp(1), 0.001);
        assertEquals(Math.exp(0), MathLibrary.exp(0), 0.001);
    }

    void testLog() {
        assertEquals(Math.log(1), MathLibrary.log(1), 0.001);
        assertEquals(Math.log(Math.E), MathLibrary.log(Math.E), 0.001);
        assertEquals(Double.NaN, MathLibrary.log(-1)); // логарифм від'ємного числа
    }


}
