package com.aitenders.parser.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class AttributeDTO implements Serializable {
private static final long serialVersionUID = 4934178135464762010L;
	
private String value;
private String type;
private String text;
}
