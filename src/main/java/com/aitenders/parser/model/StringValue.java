package com.aitenders.parser.model;

import com.aitenders.parser.enums.Quantifier;

import lombok.Data;

@Data
public class StringValue {


     private String regex;
     private String[] in;
     private String[] not_in;
     

}
