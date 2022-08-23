package LeapYearTDD;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.rules.ExpectedException;

public class LeapYearTest {

	@Test
	public void allYearsDivisibleby400 () {
		assertEquals(true, LeapYearSrc.findLeapYear(2000));
	}
	
	@Test
	public void notDivisibleby400 () {
		assertEquals(false, LeapYearSrc.findLeapYear(500));
	}
	
	@Test
	public void notDivisibleBy100AreLeapYears() {
		assertEquals(false, LeapYearSrc.findLeapYear(1700));
		assertEquals(false, LeapYearSrc.findLeapYear(1800));
		assertEquals(false, LeapYearSrc.findLeapYear(1900));
		assertEquals(false, LeapYearSrc.findLeapYear(2100));
	}
	
	@Test
	public void divisibleBy4ButNotBy100 () {
		assertEquals(true, LeapYearSrc.findLeapYear(2008));
		assertEquals(true, LeapYearSrc.findLeapYear(2012));
		assertEquals(true, LeapYearSrc.findLeapYear(2016));
	}
	
	@Test
	public void allDivisibleBy4NotLeapYear () {
		assertEquals(false, LeapYearSrc.findLeapYear(2017));
		assertEquals(false, LeapYearSrc.findLeapYear(2018));
		assertEquals(false, LeapYearSrc.findLeapYear(2019));
	}
	
	@Test 
	public void negativeYearThrowsException(){
		
		IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			LeapYearSrc.findLeapYear(-2017);
		}, "IllegalArgumentException Expected");
		
		Assertions.assertEquals("A year cannot be negative: -2017. Did you mean 2017?", thrown.getMessage());
	}
}
