/** 
 * Write the sum of numbers from 1 to n.
 */
public class Exercise04 {
	private long number;

	public Exercise04(long number) {
		this.number = number;
	}
	
	private boolean isNumberValid() {
		if (number < 1) {
			throw new IllegalArgumentException("Number is smaller then 1.");
		}
		return true;
	}

	public long calculateSum() {
		long sum = 0;
		boolean isNumberValid = true;
		try {
			isNumberValid = isNumberValid();
		} catch (Exception e) {
			isNumberValid = false;
		}
		if (isNumberValid) {
			for (long i = 1; i<=number; i++) {
				sum += i;
			}
		}
		return sum;
	}
}
