package ch.zhaw.iwi.devops.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void shouldReturnFizzForMultipleOf3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    void shouldReturnBuzzForMultipleOf5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    void shouldReturnFizzBuzzForMultipleOf15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }

    @Test
    void shouldReturnFizzForNegative3() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("Fizz", fizzBuzz.convert(-3)); // Testet negativen Fizz
}

    @Test
    void shouldReturnBuzzForNegative5() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("Buzz", fizzBuzz.convert(-5)); // Testet negativen Buzz
}

    @Test
    void shouldReturnFizzBuzzForNegative15() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("FizzBuzz", fizzBuzz.convert(-15)); // Testet negativen FizzBuzz
}
}
    }
}
