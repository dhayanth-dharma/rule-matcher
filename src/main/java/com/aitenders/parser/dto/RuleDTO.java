package com.aitenders.parser.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class RuleDTO implements Serializable{
	private static final long serialVersionUID = 4934178135464762010L;
		
	private int id;
	private String data;
	private String ruleType;
	private String propertyType;
}
