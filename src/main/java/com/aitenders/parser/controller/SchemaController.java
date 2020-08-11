package com.aitenders.parser.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.aitenders.parser.dto.SchemaDTO;
import com.aitenders.parser.model.Attribute;
import com.aitenders.parser.model.Operator;
import com.aitenders.parser.repositories.AttributeRepository;
import com.aitenders.parser.repositories.OperatorRepository;
import com.aitenders.parser.service.AttributeService;
import com.aitenders.parser.service.SchemaService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/api/schema")
public class SchemaController {
 /*
  * 
  * 
  */
	
	@Autowired
	private OperatorRepository operatorRepository;
	@Autowired
	private SchemaService schemaService;
	@Autowired
	private AttributeService attributeService;
	
	@RequestMapping(method=RequestMethod.GET, path= "getTest2")
	public String getTest2()
	{

//		Optional<User> u=userRepositoru.findById(0);
//		return u;
		
		return "a";
	}
	
	@GetMapping(value = "/operators", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Operator> getOperators() {
		List<Operator> operatorList=this.schemaService.getAllOperator();
		return operatorList;
	}
	
	@PostMapping(value = "/match", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getOperators(@RequestBody @Valid final List<SchemaDTO> dto) {


//		Matcher match=new Matcher();
		return "ac";
		
//		return operatorList;
	}
	
	
	@GetMapping(value = "/attribute/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Attribute> getAllAttribute() {
		List<Attribute > attrList=new ArrayList<Attribute >();
		attrList=this.attributeService.getAllAttribute();
		return attrList;
		
	}
	
	@GetMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
	public String saveOperators() {

		List<Attribute > attrList=new ArrayList<Attribute >();
		
		Attribute attr=new Attribute();
		Attribute attr2=new Attribute();
		Attribute attr3=new Attribute();
		Attribute attr4=new Attribute();
		Attribute attr5=new Attribute();
		Attribute attr6=new Attribute();
		Attribute attr7=new Attribute();
		Attribute attr8=new Attribute();
		Attribute attr9=new Attribute();
		Attribute attr10=new Attribute();

		Attribute attr11=new Attribute();
		Attribute attr12=new Attribute();
		Attribute attr13=new Attribute();
		Attribute attr14=new Attribute();
		Attribute attr15=new Attribute();
		Attribute attr16=new Attribute();
		Attribute attr17=new Attribute();
		Attribute attr18=new Attribute();
		Attribute attr19=new Attribute();
		Attribute attr20=new Attribute();
		
		Attribute attr21=new Attribute();
		Attribute attr22=new Attribute();
		Attribute attr23=new Attribute();
		Attribute attr24=new Attribute();
		Attribute attr25=new Attribute();
		Attribute attr26=new Attribute();
		Attribute attr27=new Attribute();
		Attribute attr28=new Attribute();
		Attribute attr29=new Attribute();
		Attribute attr30=new Attribute();
		Attribute attr31=new Attribute();
			
		
		
		attr.setValue( "orth");
		attr2.setValue( "text");
		attr3.setValue( "lower");
		attr4.setValue( "pos");
		attr5.setValue( "tag");
		attr6.setValue( "dep");
		attr7.setValue( "lemma");
		attr8.setValue( "shape");
		attr9.setValue( "entType");
		attr10.setValue( "norm");
		attr11.setValue( "length");
		attr12.setValue( "isDigit");
		attr13.setValue( "isPunct");
		attr14.setValue( "isAlpha");
		attr15.setValue( "isLower");
		attr16.setValue( "isUpper");
		attr17.setValue( "isSpace");
		attr18.setValue( "isStop");
		attr19.setValue( "isTitle");
		attr20.setValue( "isAscii");
		attr21.setValue( "isBracket");
		attr22.setValue( "isQuote");
		attr23.setValue( "isLeftPunct");
		attr24.setValue( "isRightPunct");
		attr25.setValue( "isSentStart");
		attr26.setValue( "isCurrency");
		attr27.setValue( "sentStart");
		attr28.setValue( "like_num");
		attr29.setValue( "like_url");
		attr30.setValue( "like_email");
		attr31.setValue( "operator");



		attr.setText(  "ORTH");
		attr2.setText(  "TEST");
		attr3.setText(  "LOWER");
		attr4.setText(  "POS");
		attr5.setText(  "TAG");
		attr6.setText(  "DEP");
		attr7.setText(  "LEMMA");
		attr8.setText(  "SHAPE");
		attr9.setText(  "ENT_TYPE");
		attr10.setText(  "NORM");
		attr11.setText(  "LENGTH");
		attr12.setText(  "IS_DIGIT");
		attr13.setText(  "IS_PUNCT");
		attr14.setText(  "IS_ALPHA");
		attr15.setText(  "IS_LOWER");
		attr16.setText(  "IS_UPPER");
		attr17.setText(  "IS_SPACE");
		attr18.setText(  "IS_STOP");
		attr19.setText(  "IS_TITLE");
		attr20.setText(  "IS_ASCII");
		attr21.setText(  "IS_BRACKET");
		attr22.setText(  "IS_QUOTE");
		attr23.setText(  "IS_LEFT_PUNCT");
		attr24.setText(  "IS_RIGHT_PUNCT");
		attr25.setText(  "IS_SENT_START");
		attr26.setText(  "IS_CURRENCY");
		attr27.setText(  "SENT_START");
		attr28.setText(  "LIKE_NUM");
		attr29.setText(  "LIKE_URL");
		attr30.setText(  "LIKE_EMAIL");
		attr31.setText(  "OPR");
		
		
		attr.setType( "text");
		attr2.setType( "text");
		attr3.setType( "text");
		attr4.setType( "text");
		attr5.setType( "text");
		attr6.setType( "text");
		attr7.setType( "text");
		attr8.setType( "text");
		attr9.setType( "text");
		attr10.setType( "text");
		attr11.setType( "number");
		attr12.setType( "bool");
		attr13.setType( "bool");
		attr14.setType( "bool");
		attr15.setType( "bool");
		attr16.setType( "bool");
		attr17.setType( "bool");
		attr18.setType( "bool");
		attr19.setType( "bool");
		attr20.setType( "bool");
		attr21.setType( "bool");
		attr22.setType( "bool");
		attr23.setType( "bool");
		attr24.setType( "bool");
		attr25.setType( "bool");
		attr26.setType( "bool");
		attr27.setType( "bool");
		attr28.setType( "bool");
		attr29.setType( "bool");
		attr30.setType( "bool");
		attr31.setType( "opr");
		
		attrList.add(attr);
		attrList.add(attr2);
		attrList.add(attr3);
		attrList.add(attr4);
		attrList.add(attr5);
		attrList.add(attr6);
		attrList.add(attr7);
		attrList.add(attr8);
		attrList.add(attr9);
		attrList.add(attr10);
		attrList.add(attr11);
		attrList.add(attr12);
		attrList.add(attr13);
		attrList.add(attr14);
		attrList.add(attr15);
		attrList.add(attr16);
		attrList.add(attr17);
		attrList.add(attr18);
		attrList.add(attr19);
		attrList.add(attr20);
		attrList.add(attr21);
		attrList.add(attr22);
		attrList.add(attr23);
		attrList.add(attr24);
		attrList.add(attr25);
		attrList.add(attr26);
		attrList.add(attr27);
		attrList.add(attr28);
		attrList.add(attr29);
		attrList.add(attr30);
		attrList.add(attr31);

		this.attributeService.saveAllAttribute(attrList);
		return "success";
		
	}
	
}
