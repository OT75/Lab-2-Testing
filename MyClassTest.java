import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class MyClassTest {
    MyClass x = new MyClass();

    public void CheckEven0() {
        assertEquals("Even", x.isEvenOrOdd(0));
    }


    @Test
    public void CheckEven6() {
        assertEquals("Even", x.isEvenOrOdd(6));
    }

    @Test
    public void CheckEven120() {
        assertEquals("Even", x.isEvenOrOdd(120));
    }


    @Test
    public void CheckOdd1() {
        assertEquals("Odd", x.isEvenOrOdd(1));
    }

    @Test
    public void CheckOdd73() {
        assertEquals("Odd", x.isEvenOrOdd(73));
    }

    @Test
    public void CheckOdd15() {
        assertEquals("Odd", x.isEvenOrOdd(15));
    }

}