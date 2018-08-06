/**
 * Convert given number to array in following way: 2018 -> [2,0,1,8].
 */
public class Exercise13 {
	private int number;

	public Exercise13(int number) {
		this.number = number;
	}
	
	public int[] getNumberConvertedToArray() {
		String dividedNumber = Integer.toString(number);
		int[] numbers = new int[dividedNumber.length()];
		
		for (int i = 0; i < dividedNumber.length(); i++)
		{
			numbers[i] = convertCharToInt(dividedNumber, i);
		}
		
		return numbers;
	}

	private int convertCharToInt(String dividedNumber, int i) {
		return dividedNumber.charAt(i) - '0';
	}
}
