import java.util.ArrayList;
import java.util.List;

public class Exercise14 {
	private int firstNumber;
	private int secondNumber;
	
	public Exercise14(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	private boolean isPrime(int number) {
		boolean isPrime;
		if (number == 2) {
			isPrime = true;
		} else if (number < 2) {
			isPrime = false;
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
				}
			}
			isPrime = true;
		}
		return isPrime;
	}
	
	public List<Integer> getPrimeNumbers() {
		List<Integer> primeNumbers = new ArrayList<>();
		
		if (firstNumber < secondNumber) {
			for (int i = firstNumber; i < secondNumber; i++) {
				if (isPrime(i)) {
					primeNumbers.add(i);
				}
			}
		} else {
			for (int i = secondNumber+1; i <= firstNumber; i++) {
				if (isPrime(i)) {
					primeNumbers.add(i);
				}
			}
		}
		return primeNumbers;
	}
}
