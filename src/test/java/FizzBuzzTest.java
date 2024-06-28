import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {


    @Test
    public void fizzBuzzTest_whenNumber1_thenReturn1ASString() {
        //GIVEN
        int num = 1;

        //WHEN
        String actual = FizzBuzz.fizzBuzz(num);

        //THEN
        assertEquals("1", actual);
    }

    @Test
    public void fizzBuzzTest_whenNumber7_thenReturn7AsString() {
        //GIVEN
        int num = 7;

        //WHEN
        String actual = FizzBuzz.fizzBuzz(num);

        //THEN
        assertEquals("7", actual);
    }

    @Test
    public void fizzBuzzTest_whenNumber3_thenReturnFizz() {
        //GIVEN
        int num = 3;

        //WHEN
        String actual = FizzBuzz.fizzBuzz(num);

        //THEN
        assertEquals("Fizz", actual);
    }

    @Test
    public void fizzBuzzTest_whenNumber5_thenReturnBuzz() {
        //GIVEN
        int num = 5;

        //WHEN
        String actual = FizzBuzz.fizzBuzz(num);

        //THEN
        assertEquals("Buzz", actual);
    }

    @Test
    public void fizzBuzzTest_whenNumber15_thenReturnFizzBuzz() {
        //GIVEN
        int num = 15;

        //WHEN
        String actual = FizzBuzz.fizzBuzz(num);

        //THEN
        assertEquals("FizzBuzz", actual);
    }
}
