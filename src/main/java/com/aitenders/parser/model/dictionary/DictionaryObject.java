package com.aitenders.parser.model.dictionary;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.Getter;
@Data
@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")

public class DictionaryObject implements Serializable{
	private static final long serialVersionUID = -3974333660215684476L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Getter
	Long id;
	
	@Column(name = "name" )
//	@Getter
	String name;
	@Column(name = "title" )
//	@Getter
	String title;
	@Column(name = "code" )
//	@Getter
	String code;
	
	@Column(name = "type" )
//	@Getter
	String type;
	
	@Column(name = "nbs_code" )
//	@Getter
	String nbsCode;
	@Column(name = "nrm" )
//	@Getter
	String nrm;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	DictionarySection dictionarySection;
	
	
	
}
