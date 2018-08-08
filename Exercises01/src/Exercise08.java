import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Check which letter occurs most often in the text.
 */
public class Exercise08 {
	private String expression;

	public Exercise08(String expression) {
		this.expression = expression;
	}

	public HashMap<String, Integer> countNumberOfOccurences() {

		HashMap<String, Integer> map;
		Scanner file = new Scanner(expression).useDelimiter("");
		map = new HashMap<>();
		try {

			while (file.hasNext()) {
				String letter = file.next().toLowerCase();
				if (map.containsKey(letter)) {
					map.put(letter, map.get(letter) + 1);
				} else {
					map.put(letter, 1);
				}
			}
		} catch (Exception e) {
		} finally {
			file.close();
		}
		List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
				return a.getValue().compareTo(b.getValue());
			}
		});

		for (int i = 0; i < 10; i++) {
			System.out.println(entries.get(entries.size() - i - 1).getKey());
		}
		return map;
	}
}
