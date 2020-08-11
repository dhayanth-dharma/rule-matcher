//package com.aitenders.parser.repositories;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//
//import com.aitenders.parser.model.RoleDictionary;
//
//public interface RoleDictionaryRepository extends CrudRepository<RoleDictionary, Long>{
//		
//		@Modifying
//		@Query(value = "SELECT * FROM role_rule WHERE group=:group", nativeQuery = true)
//		List<RoleDictionary> findByName(@Param("group") String group);
//
//
//}
