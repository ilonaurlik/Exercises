import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/** 
 * Return the largest element from the list.
 */
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
