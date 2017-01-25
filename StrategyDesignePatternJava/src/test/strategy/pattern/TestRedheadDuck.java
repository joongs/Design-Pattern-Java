package test.strategy.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import duck.strategy.pattern.Duck;
import duck.strategy.pattern.RedheadDuck;

public class TestRedheadDuck {

	@Test
	public void shouldQuackWhenCallQuack() {
		//arrange
		Duck rDuck = new RedheadDuck();
		
		//act
		String result = rDuck.quack();
		
		//assert
		assertEquals("Quack Quack", result);
	}
	
	@Test
	public void shouldSwimWhenCallSwim() {
		//arrange
		Duck rDuck = new RedheadDuck();
		
		//act
		String result = rDuck.swim();
				
		//assert
		assertEquals("can swim", result);
	}
	
	@Test
	public void shouldSeeWhenCallDisplay() {
		//arrange
		Duck rDuck = new RedheadDuck();
		
		//act
		String result = rDuck.display();
		
		//assert
		assertEquals("RedheadDuck", result);
	}
}
