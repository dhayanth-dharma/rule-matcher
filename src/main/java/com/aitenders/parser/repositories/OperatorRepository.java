package com.aitenders.parser.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.aitenders.parser.model.Operator;




//CrudRepository<Customer, Long>
//BaseRepository<Operator, Long>
	public interface OperatorRepository extends CrudRepository<Operator, Long>{
	
		@Modifying
		@Query(value = "SELECT * FROM operator WHERE name=:name", nativeQuery = true)
		List<Operator> findByName(@Param("name") String name);
		
		 	
		
	//	@Query(value = "SELECT COUNT(*) FROM acronym WHERE name=:name AND definition=:definition AND scope=:scope ", nativeQuery = true)
	//	Integer countAcronymsByNameAndDefinitionAndScope(@Param("name") String name ,@Param("definition") String definition, @Param("scope") String scope);
	//	
	////	@Modifying
	////	
	//	@Query(value = "SELECT * FROM acronym WHERE name=:name and definition=:definition and  scope=:scope", nativeQuery = true)
	//	Acronym findByNameAndScopeAndDefinition(@Param("name") String name ,@Param("definition") String definition,@Param("scope") String scope);
	// 
	//	@Query(value = "SELECT * FROM acronym WHERE scope=:scope", nativeQuery = true)
	//	List<Acronym> findTest(@Param("scope") String scope);
	// 
	//	
	//	@Query(value = "SELECT * FROM acronym WHERE id=:id", nativeQuery = true)
	//	AcronymReplace findAcronymById(@Param("id") long id);
	//	
	//	@Modifying
	//	@Query(value = "UPDATE acronym SET name=:name,  definition=:definition, scope=:scope  WHERE id=:id ", nativeQuery = true)
	//	void updateAcronym(@Param("id") long id, @Param("name") String name, @Param("scope") String scope);
	//	
	//	@Modifying
	//	@Query(value = "DELETE FROM acronym WHERE id=:id", nativeQuery = true)
	//	void deleteAcronymById(@Param("id") long id);
	//	
	//	@Modifying
	//	@Query(value = "SELECT * FROM acronym WHERE scope=:scope", nativeQuery = true)
	//	AcronymReplace findAcronymByScope(@Param("scope") String scope);
	//	
	//	
		
	}
