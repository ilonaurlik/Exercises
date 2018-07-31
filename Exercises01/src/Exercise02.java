public class Exercise02 {
	private String expression;

	public Exercise02(String expression) {
		this.expression = expression;
	}
	
	public String getTextBackwards() {
		char[] expressionAsCharArray = expression.toCharArray();
	    StringBuilder reversedText = new StringBuilder(); 	
		
		if (expression != null) {	
			for (int i = (expressionAsCharArray.length - 1); i >= 0; i--) {
		    	reversedText.append(expressionAsCharArray[i]);
		    	} 
		} else {
			throw new IllegalArgumentException("Expression is null.");
		}
		return reversedText.toString();
	}
}
