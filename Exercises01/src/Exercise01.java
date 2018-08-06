/**
 * Find the longest word in the text,
 * - if it occurs more than once, take the first one
 * - ignore the punctuation
 */
public class Exercise01 {
	private String expression;

	public Exercise01(String expression) {
		this.expression = expression;
	}

	public String findLongestWord() {
		String[] words = expression.replaceAll("[^a-zA-Z ]", "").split(" ");				
		String longestWord = "";
			
		if (expression != null) {
			for(int i = 0; i < words.length; i++){
				   if(words[i].length() > longestWord.length()){
				      longestWord = words[i];
				   }
				}
		} else {
			throw new IllegalArgumentException("Expression is null.");
		}
		return longestWord;
	}
}
