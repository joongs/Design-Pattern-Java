package test.strategy.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import duck.strategy.pattern.RedheadDuck;

public class TestRedheadDuck {

	@Test
	public void shouldQuackWhenCallQuack() {
		//arrange
		RedheadDuck rDuck = new RedheadDuck();
		
		//act
		String result = rDuck.quack();
		
		//assert
		assertEquals("Quack Quack", result);
	}
}
