import java.util.ArrayList;
import java.util.List;
/**
 * Return the sum of elements on the odd indexes in the list.
 */
public class Exercise11 {
	private List<Integer> numbers = new ArrayList<>();
    
	public Exercise11(List<Integer> first) {
		this.numbers = first;
	}
	
	public int calculateSumOfNumbers() {
		int sum = 0;
		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i) % 2 == 1) {
				sum += numbers.get(i);
			}
		}
		return sum;
	}
}
