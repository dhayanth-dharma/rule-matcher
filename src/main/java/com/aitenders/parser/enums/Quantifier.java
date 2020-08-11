package com.aitenders.parser.enums;

public enum Quantifier {


		equal("=="),
		greater_or_equal(">="),
		lesser_or_equal("<="),
		greator(">"),
		lesser("<");
 
	    private final String quantifier;

	    Quantifier(final String quantifier) {
	        this.quantifier= quantifier;
	    }

	    @Override
	    public String toString() {
	        return quantifier;
	    }
}
