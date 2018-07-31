public class Exercise05 {
	private String expression;

	public Exercise05(String expression) {
		this.expression = expression;
	}
	
	public String capitaliseFirstLetter() {
		String[] words = expression.split(" ");
		StringBuilder mergedText = new StringBuilder(); 
		String wordWithoutFirstLetter = null;
		
		for (int i = 0; i < words.length; i++) {
			char firstLetter = words[i].charAt(0);
			char capitalLetter = Character.toUpperCase(firstLetter);
			if (i != 0) {
				wordWithoutFirstLetter = words[i].substring(1);
				mergedText.append(" ").append(capitalLetter).append(wordWithoutFirstLetter);
			} else {
				wordWithoutFirstLetter = words[i].substring(1);
				mergedText.append(capitalLetter).append(wordWithoutFirstLetter);
			}
		}
		
		return mergedText.toString();
	}
}
