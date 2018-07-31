import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise09 {
	private List<Integer> list = new ArrayList<>();
	
	public Exercise09(List<Integer> list) {
		this.list = list;
	}

	public int findMaximumElement() {
		int maximumValue = Collections.max(list);
		return maximumValue;
	}
}
