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

import lombok.Getter;
@Entity
public class Operator implements Serializable{

	private static final long serialVersionUID = -3974333660215684476L;
	
	@Transient
	UUID uuid;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Getter
	Long id;
	
	@Column(name = "name" )
	@Getter
	String name;
	
	@Column(name = "value")
	@Getter
	String value;
	
}
