package com.aitenders.parser.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitenders.parser.dto.SchemaDTO;
import com.aitenders.parser.model.Operator;
import com.aitenders.parser.repositories.OperatorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SchemaService {
	private static final Logger logger = Logger.getLogger(SchemaService.class);
	private final OperatorRepository operatorRepository;
	
	public List<Operator> getAllOperator()
	{
		Iterable<Operator> operatorList=operatorRepository.findAll();
		List<Operator> result = 
				  StreamSupport.stream(operatorList.spliterator(), false)
				    .collect(Collectors.toList());
		return result;
	}
	
	public void process(List<SchemaDTO> schemas)
	{
		for(SchemaDTO schema: schemas)
		{
			System.out.println(schema);
		}
	}
	
	void test() {
		 logger.info("QA Document '{}' has been uploaded in {}");
	 }
}
