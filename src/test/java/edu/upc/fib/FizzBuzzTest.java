package edu.upc.fib;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testWhenInputIs1ResultIs1() {
		FizzBuzz fizzbuzz = new FizzBuzz ();
		String result = fizzbuzz.calculate(1);
		assertEquals("1",result);
	}

	@Test
	public void testWhenInputIs3ResultIsFizz() {
		FizzBuzz fizzbuzz = new FizzBuzz ();
		String result = fizzbuzz.calculate(3);
		assertEquals("Fizz",result);
	}

}
