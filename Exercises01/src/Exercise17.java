public class Exercise17 {
	private int firstNumber;
	private int secondNumber;
	
	public Exercise17(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	public int getCalculatedProduct() {
		int product = 1;
		if (firstNumber < secondNumber) {
			for (int i = firstNumber; i <= secondNumber; i++) {
				product *= i;
			}
		} else {
			for (int i = secondNumber; i <= firstNumber; i++) {
				product *= i;
			}
		}
		return product;
	}
}
