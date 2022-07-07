package LeapYear;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeapYearTest {

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
	
}
