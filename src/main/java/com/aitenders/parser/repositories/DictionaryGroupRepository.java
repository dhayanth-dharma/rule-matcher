package com.aitenders.parser.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aitenders.parser.model.dictionary.DictionaryGroup;

@Repository
public interface DictionaryGroupRepository extends JpaRepository<DictionaryGroup, Long>{

//	@Modifying
	@Query(value = "SELECT * FROM dictionary_group WHERE type=:type", nativeQuery = true)
	List<DictionaryGroup> findAllByType(@Param("type") String type);
	
	
}
