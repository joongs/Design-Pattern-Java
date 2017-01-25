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
		String expected = mDuck.quack();
		
		//assert
		assertEquals("²Ð²Ð", expected);
	}

}
