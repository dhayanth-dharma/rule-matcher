package com.aitenders.parser.enums;

public enum Operator {
	equal("="),
	optional("?"),
	required_one_or_more("+"),
	required_zero_or_more("*"),
	negation("!");

    private final String operator;

    Operator(final String operator) {
        this.operator= operator;
    }

    @Override
    public String toString() {
        return operator;
    }
}
