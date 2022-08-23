package LeapYearTDD;

public class LeapYearSrc {
	int year;
	
	public static boolean findLeapYear(int year){
		
		if (year < 0) {
			System.out.println(year);
			String message = "A year cannot be negative: " + year + ". Did you mean " + Math.abs(year) + "?";
			throw new IllegalArgumentException(message);
		}
		
		if (yearDivisibleby400(year) || yearDivisibleBy4andNotBy100(year)) {
			return true;
		}
		
		return false;
	}
	
	private static boolean yearDivisibleby400(int year) {
		if(year % 400 == 0)
			return true;
		
		return false;
	}
	
	private static boolean yearDivisibleBy4andNotBy100(int year) {
		if (yearDivisibleBy4(year) && yearNotDivisibleBy100(year))
			return true;
		
		return false;
	}
	
	private static boolean yearDivisibleBy4(int year) {
		if (year % 4 == 0)
			return true;
		
		return false;
	}
	
	private static boolean yearNotDivisibleBy100(int year) {
		if (year % 100 != 0)
			return true;
		
		return false;
	}
}
