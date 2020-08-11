package com.aitenders.parser.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aitenders.parser.model.dictionary.DictionarySubGroup;
@Repository
public interface DictionarySubGroupRepository extends JpaRepository<DictionarySubGroup, Long>{

//	List<DictionarySubGroup> findAllByGrouId(Long groupId);
}
