package com.aitenders.parser.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitenders.parser.model.Attribute;
import com.aitenders.parser.model.Operator;
import com.aitenders.parser.repositories.AttributeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AttributeService {
	private static final Logger logger = Logger.getLogger(AttributeService.class);
	private final AttributeRepository attributeRepository;
	
	public List<Attribute> getAllAttribute()
	{
		Iterable<Attribute> operatorList=attributeRepository.findAll();
		System.out.println(operatorList.toString());
		List<Attribute> result = 
				  StreamSupport.stream(operatorList.spliterator(), false)
				    .collect(Collectors.toList());
		return result;
	}
	
	public List<Attribute> saveAllAttribute(List<Attribute> attrList)
	
	{
		Iterable<Attribute> operatorList=attributeRepository.saveAll(attrList);
		List<Attribute> result = 
				  StreamSupport.stream(operatorList.spliterator(), false)
				    .collect(Collectors.toList());
		return result;
	}
}
