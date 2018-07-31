import java.util.ArrayList;
import java.util.List;

public class Exercise15 {
	private List<Integer> numbers = new ArrayList<Integer>();

	public Exercise15(List<Integer> numbers) {
		this.numbers = numbers;
	}

	public int getCalculatedSumOfNumbers() {
		int sum = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i) > getPreviousElementOf(i)) {
				sum += numbers.get(i);
			} else if (numbers.get(i) < getPreviousElementOf(i)) {
				sum -= numbers.get(i);
			} else if (numbers.get(0) == numbers.get(1)) {
				sum += numbers.get(i);
			} else if (numbers.get(i) == getPreviousElementOf(i)) {
					if (numbers.get(i) > getPreviousElementOf(i)) {
						sum += numbers.get(i);
					} else if (numbers.get(i) < getPreviousElementOf(i)) {
						sum -= numbers.get(i);
					}
				}
			}
		return sum;
		}

	private Integer getPreviousElementOf(int i) {
		return numbers.get(i-1);
	}
}
