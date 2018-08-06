import java.util.ArrayList;
import java.util.List;
/**
 * Write 25 upcoming leap years.
 */
public class Exercise16 {
	private int year;

	public Exercise16(int year) {
		this.year = year;
	}

	private boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
	}
	
	public List<Integer> findNext25LeapYears() {
		List<Integer> leapYears = new ArrayList<Integer>();
		
		if (isLeapYear(year)) {
			for (int i = year + 4; i < year + 104; i+= 4) {
			leapYears.add(i);
			}
		} else if (isLeapYear(year + 1)) {
			for (int i = year + 1; i < year + 101; i+= 4) {
			leapYears.add(i);
			}
		} else if (isLeapYear(year + 2)) {
			for (int i = year + 2; i < year + 102; i+= 4) {
			leapYears.add(i);
			}
		} else if (isLeapYear(year + 3)) {
			for (int i = year + 3; i < year + 103; i+= 4) {
			leapYears.add(i);
			}
		}
		return leapYears;
	}
}
