package test.strategy.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import duck.strategy.pattern.MallardDuck;

public class TestMallardDuck {

	@Test
	public void shouldQuackWhenCallQuack() {
		//arrange
		MallardDuck mDuck = new MallardDuck();
		
		//act
		String result = mDuck.quack();
		
		//assert
		assertEquals("Quack Quack", result);
	}
	
	@Test
	public void shouldSwimWhenCallSwim() {
		//arrange
		MallardDuck mDuck = new MallardDuck();
		
		//act
		String result = mDuck.swim();
		
		//assert
		assertEquals("can swim", result);
	}

}
