package com.aitenders.parser.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.aitenders.parser.dto.SchemaDTO;
import com.aitenders.parser.model.Attribute;
import com.aitenders.parser.model.Operator;
import com.aitenders.parser.model.dictionary.DictionaryGroup;
import com.aitenders.parser.model.dictionary.DictionaryObject;
import com.aitenders.parser.model.dictionary.DictionarySubGroup;
import com.aitenders.parser.repositories.AttributeRepository;
import com.aitenders.parser.repositories.OperatorRepository;
import com.aitenders.parser.service.AttributeService;
import com.aitenders.parser.service.DictionaryService;
//import com.aitenders.parser.service.PasswordGeneratorService;
import com.aitenders.parser.service.SchemaService;


import antlr.Utils;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/api/dictionary")
public class DictionaryController {
 /*
  * 
  * 
  */
	
	@Autowired
	private DictionaryService dictionaryService;
//	@Autowired
//	private PasswordGeneratorService passwordService;
	@RequestMapping(method=RequestMethod.GET, path= "/save")
	public DictionarySubGroup getTest2()
	{

		DictionaryGroup group=new DictionaryGroup ();
		DictionarySubGroup subgroup=new DictionarySubGroup ();
		List<DictionarySubGroup> subgroupL=new 
				ArrayList<DictionarySubGroup> ();
		
		group.setCode("asd");
		group.setName("pname");
		group.setTitle("test");
		subgroup.setCode("asd");
		subgroup.setName("alskjd");
		subgroup.setTitle("askjd");
		
		DictionaryGroup dic=dictionaryService.saveGroup(group);

		
		subgroup.setDictionaryGroup(dic);
		subgroup= dictionaryService.saveSubGroup(subgroup);
		System.out.println(subgroup);
		
		return subgroup;
	}
	
	@GetMapping(value = "/get/{type}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<DictionaryGroup> getDictionaryByType(@PathVariable("type") String type) {
		List<DictionaryGroup> operatorList=this.dictionaryService.getAllGroupByType(type);
		return operatorList;
	}
	
	@GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<DictionaryGroup> getDictionary() {
		List<DictionaryGroup> operatorList=this.dictionaryService.getAllGroup();
		return operatorList;
	}
	@GetMapping(value = "/getRandPass/{count}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getPass(@PathVariable("count") int count) {
//		String pass =this.passwordService.generateSecureRandomPassword(count);
		return "ASD";
	}
	
	@GetMapping(value = "/getA", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<DictionaryGroup> getJoin() {
		List<DictionaryGroup> operatorList=
				this.dictionaryService.getAll();
		return operatorList;
	}
	
	@GetMapping(value = "/saveGruopsEntry", produces = MediaType.APPLICATION_JSON_VALUE)
	public DictionaryGroup saveGruopsEntry() {
		DictionaryGroup operatorList=
				this.dictionaryService.saveGroup();
		return operatorList;
	}
	
	@GetMapping(value = "/saveSectionObject", produces = MediaType.APPLICATION_JSON_VALUE)
	public DictionaryObject saveSectionObject() {
		DictionaryObject operatorList=
				this.dictionaryService.saveSection();
		return operatorList;
	}
	
	@RequestMapping(value = "/getpdf", method = RequestMethod.GET)
	public  ResponseEntity<InputStreamResource>  getPdf( HttpServletResponse response)  {
		String fileName="ADI_AGREEMENT.pdf";
	    try {
	    	File file = null;
	    	Properties properties = new Properties();
	        try {
	        	String env = String.format("classpath:pdf/ADI_AGREEMENT.pdf");
	 	 		file = ResourceUtils.getFile(env);	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        if (file.exists()) {
	        } else {
	            System.out.println("error with document not exist");
	        }
            InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
            return ResponseEntity.ok()
            		.header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + file.getName())
                    .contentLength(file.length())
                    .contentType(MediaType.APPLICATION_PDF)
                    .body(resource);
	    } catch (Exception exception) {
	        System.out.println(exception.getMessage());
exception.printStackTrace();
	        return null;
	    }
	}
	
//	@PostMapping(value = "/match", produces = MediaType.APPLICATION_JSON_VALUE)
//	public String getOperators(@RequestBody @Valid final List<SchemaDTO> dto) {
//
//
////		Matcher match=new Matcher();
//		return "ac";
//		
////		return operatorList;
//	}
	
	
//	@GetMapping(value = "/attribute/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<Attribute> getAllAttribute() {
//		List<Attribute > attrList=new ArrayList<Attribute >();
//		attrList=this.attributeService.getAllAttribute();
//		return attrList;
//		
//	}
	
	
}
