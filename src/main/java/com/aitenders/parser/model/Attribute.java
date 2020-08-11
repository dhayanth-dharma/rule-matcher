package com.aitenders.parser.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import com.aitenders.parser.dto.AttributeDTO;

import lombok.Data;
import lombok.Getter;
@Data
@Entity
public class Attribute implements Serializable{

private static final long serialVersionUID = -3974333660215684476L;
	
	@Transient
	UUID uuid;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Getter
	Long id;
	
	@Column(name = "value" )
	@Getter
	String value;
	@Column(name = "type" )
	@Getter
	String type;
	@Column(name = "text" )
	@Getter
	String text;
	
//	List<String> dictionaries;
		
}
