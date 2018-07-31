import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise12 {
	private List<Integer> numbers = new ArrayList<>();
	private List<Integer> numbers2 = new ArrayList<>();

	public Exercise12(List<Integer> numbers, List<Integer> numbers2) {
		this.numbers = numbers;
		this.numbers2 = numbers2;
	}
	
	public List<Integer> getSortedNumbers() {
		numbers.addAll(numbers2);
		Collections.sort(numbers, Collections.reverseOrder()); 
		
		return numbers;
	}
}
