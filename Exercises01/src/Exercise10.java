import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Return reversed list.
 */
public class Exercise10 {
	private List<Integer> list = new ArrayList<>();

	public Exercise10(List<Integer> list) {
		this.list = list;
	}
	
	private void reverse() {
		Collections.reverse(list);
	}
	
	public List<Integer> getReversedList() {
		reverse();
		return list;
	}
}
