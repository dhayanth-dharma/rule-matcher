package com.aitenders.parser.dto;

import lombok.Data;
import java.util.List;

import com.aitenders.parser.model.IntegerValue;
import com.aitenders.parser.enums.Operator;
import com.aitenders.parser.model.StringValue;
import com.aitenders.parser.model.UnderscoreValue;
@Data

public class SchemaDTO {

//	private List<StringValue>string_value;
//	private List<IntegerValue> inter_value;
//	private boolean boolean_value; //0 : false, 1 : true
//	private List<UnderscoreValue> underscore_value;
	private StringValue orth;
	private StringValue text;
	private StringValue lower;
	private StringValue pos;
	private StringValue tag;
	private StringValue dep;
	private StringValue lemma;
	private StringValue shape;
	private StringValue entType;
	private StringValue norm;
	private IntegerValue length;
	
	private boolean isDigit;
	private boolean isPunct;
	private boolean isAlpha;
	private boolean isLower;
	private boolean isUpper;
	private boolean isSpace;
	private boolean isStop;
	private boolean isTitle;
	private boolean isAcsii;
	private boolean isBracket;
	private boolean isQuote;
	private boolean isLeftPunct;
	private boolean isRightPunct;

	private boolean isSentStart;
	private boolean isCurrency;
	private boolean sentStart;
	
	private boolean like_num;
	private boolean  like_url;
	private boolean like_email;
	//- this operator not yet mapped
	private Operator operator; 
	
	
	
}
