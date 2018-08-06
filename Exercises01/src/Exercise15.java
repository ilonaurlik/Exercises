import java.util.ArrayList;
import java.util.List;
/**
 * Write a function that processes the input list in following way:
 * - if list[i+1] > list[i] then add list[i+1] to the sum
 * - otherwise subtract value of list[i+1] from the sum
 * - if list[i+1] = list[i] then then repeat previous operation (addition/subtraction)
 * - exception from the rule above: if list[0]=list[1] then add list[1] to the sum.
 */
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
