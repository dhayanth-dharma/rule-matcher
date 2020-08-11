package com.aitenders.parser.controller;

import java.util.List;

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

import com.aitenders.parser.dto.RuleDTO;
import com.aitenders.parser.dto.SchemaDTO;
import com.aitenders.parser.model.Operator;
import com.aitenders.parser.repositories.OperatorRepository;
import com.aitenders.parser.service.AttributeService;
import com.aitenders.parser.service.SchemaService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/api/rule")
public class RuleMatchingController {

	
	@Autowired
	private OperatorRepository operatorRepository;
	@Autowired
	private SchemaService schemaService;
	@Autowired
	private AttributeService attributeService;
	
	
	
	@GetMapping(value = "/operators", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Operator> getOperators() {
		List<Operator> operatorList=this.schemaService.getAllOperator();
		return operatorList;
	}
	
	@PostMapping(value = "/refresh", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getOperators(@RequestBody @Valid final List<RuleDTO> dto) {
	return null;	 
	}
	
}
