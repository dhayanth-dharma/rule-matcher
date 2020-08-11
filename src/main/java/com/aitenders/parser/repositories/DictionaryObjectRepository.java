package com.aitenders.parser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aitenders.parser.model.dictionary.DictionaryObject;

public interface DictionaryObjectRepository extends JpaRepository<DictionaryObject, Long>{

}
