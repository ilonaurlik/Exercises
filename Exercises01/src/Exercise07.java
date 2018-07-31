import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise07 {
	private int number;
	
	public Exercise07(int number) {
		this.number = number;
	}

	private int populateZeros() {
		String convertedNumber = Integer.toString(number);
		String addedZero = "0";
		final int MAX_LENGTH_OF_NUMBER = 4;
		
		if (number == 0 && convertedNumber.length() > MAX_LENGTH_OF_NUMBER) { 
			throw new IllegalArgumentException("Number is incorrect.");
		} else {
			while (convertedNumber.length() < MAX_LENGTH_OF_NUMBER) { 
				convertedNumber += addedZero;
			}
		}
		number = Integer.parseInt(convertedNumber);
		
		return number;
		
	}
	
	private boolean isExpressionValid() {
		Set<String> mySet = new HashSet<>(Arrays.asList(Integer.toString(number).split("")));

		boolean uniqueNumbersOk = true;
		boolean existThreeOrFourUniqueDigits = mySet.size() >= 3;
		boolean existTwoUniqueDigits = mySet.size() == 2;
		
		if(existThreeOrFourUniqueDigits || existTwoUniqueDigits) {
			uniqueNumbersOk = true;
		} else {
			uniqueNumbersOk = false;
		}
		return !Integer.toString(number).contains("[a-zA-Z]+") && uniqueNumbersOk;
	}
	
	private String[] getNumberConvertedToArray() {
		String[] numbers = null;
		number = populateZeros();
		boolean validExpression = isExpressionValid();
		if (validExpression) {
			numbers = Integer.toString(number).split("");
		}
		
		return numbers;
	}
		
	private String[] calculateAscendingNumbers() {	
		String[] ascendingNumbers = getNumberConvertedToArray();

		Arrays.sort(ascendingNumbers);
		return ascendingNumbers;
	}
	
	private String[] calculateDescendingNumbers() {	
		String[] ascendingNumbers = calculateAscendingNumbers();
	    StringBuilder reversedascendngNumbers = new StringBuilder();
		String[] descendingNumbers;
		
		for (int i = (ascendingNumbers.length - 1); i >= 0; i--) { 
			reversedascendngNumbers.append(ascendingNumbers[i]);
	    }
		descendingNumbers = reversedascendngNumbers.toString().split("");
		
		return descendingNumbers;
	}
		
	private int substractNumbers() {
		int descendingNumber = Integer.parseInt(String.join("", calculateDescendingNumbers()));
		int ascendingNumber = Integer.parseInt(String.join("", calculateAscendingNumbers()));
		
		number = descendingNumber - ascendingNumber;
		return number;
	}

	public int gimmie6174() {
		while(number != 6174) {
			number = substractNumbers();
		}
		System.out.println("Here it is: " + number);
		
		return number;
	}
}
