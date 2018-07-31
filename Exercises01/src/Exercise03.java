public class Exercise03 {
	private String expression;
	private static final String ALPHABET = "abcdefghijklmnoprstuwyz"; 

	public Exercise03(String expression) {
		this.expression = expression;
	}

	private String encode() {
		char[] letters = expression.toLowerCase().toCharArray(); 
	    StringBuilder newExpression = new StringBuilder(); 
		int letterPosition;
		char newValue;

		if (expression != null) {	
			for (int i = 0; i < letters.length; i++) {
				if (Character.isLetter(letters[i])) {
					if (letters[i] == 'z') {
						newExpression.append('a'); 
					} else {
						letterPosition = ALPHABET.indexOf(letters[i]);
						newValue = ALPHABET.charAt(letterPosition + 1);
						newExpression.append(newValue);
					}
				} else {
					letterPosition = ALPHABET.indexOf(letters[i]);
					newExpression.append(letters[i]);
				}
			}
		} else {
			throw new IllegalArgumentException("Expression is null.");
		}
		return newExpression.toString();
	}
	
	private static boolean isVowel (String letter) {  
		final String VOVELS = "aeiouy";
		return VOVELS.indexOf(letter) != -1;
	}
	
	public String getConvertedExpression() {
	    StringBuilder convertedExpression = new StringBuilder();
		String[] convertedLetters = encode().split("");
		
		for (int i = 0; i < convertedLetters.length; i++) {
			if(isVowel(convertedLetters[i])) {
				convertedExpression.append(convertedLetters[i].toUpperCase()); 
			} else {
				convertedExpression.append(convertedLetters[i]);
			}
		}
		return convertedExpression.toString();
	}
}
