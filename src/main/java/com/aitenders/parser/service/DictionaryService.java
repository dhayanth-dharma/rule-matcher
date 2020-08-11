package com.aitenders.parser.service;

import java.util.List;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitenders.parser.model.dictionary.DictionaryGroup;
import com.aitenders.parser.model.dictionary.DictionaryObject;
import com.aitenders.parser.model.dictionary.DictionarySection;
import com.aitenders.parser.model.dictionary.DictionarySubGroup;
import com.aitenders.parser.repositories.DictionaryGroupRepository;
import com.aitenders.parser.repositories.DictionaryObjectRepository;
import com.aitenders.parser.repositories.DictionarySectionRepository;
import com.aitenders.parser.repositories.DictionarySubGroupRepository;
import java.util.Optional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DictionaryService {
	private static final Logger logger = Logger.getLogger(SchemaService.class);
	private final DictionaryGroupRepository groupRepository;
	private final DictionarySubGroupRepository subGroupRepository;

	private final DictionarySectionRepository sectionRepository;

	private final DictionaryObjectRepository objectRepository;
	@PersistenceContext // or even @Autowired
    private EntityManager entityManager;
	public List<DictionaryGroup> getAllGroup()
	{
		Iterable<DictionaryGroup> operatorList=groupRepository.findAll();
		List<DictionaryGroup> result = 
				  StreamSupport.stream(operatorList.spliterator(), false)
				    .collect(Collectors.toList());
		return result;
	
	}
	public List<DictionaryGroup> getAllGroupByType(String type)
	{
		Iterable<DictionaryGroup> operatorList=groupRepository
				.findAllByType(type);
		List<DictionaryGroup> result = 
				  StreamSupport.stream(operatorList.spliterator(), false)
				    .collect(Collectors.toList());
		return result;
	
	}
	
	
	public DictionaryGroup saveGroup(DictionaryGroup group)
	{
		group=	this.groupRepository.save(group);
		return group;
	}
	public DictionarySubGroup saveSubGroup(DictionarySubGroup group)
	{
		group=	this.subGroupRepository.save(group);
		return group;
	}
	
	public List<DictionaryGroup> getAll()
	{
		 TypedQuery<DictionaryGroup> query
	      = entityManager.
	      createQuery("SELECT d.dictionaryGroup FROM DictionarySubGroup d",
	    		  DictionaryGroup.class);
	    List<DictionaryGroup> resultList = query.getResultList();
	    System.out.println(resultList );
	    return resultList;
	}
	
//	public DictionaryGroup getGroup(Long groupId)
//	{
////		postRepository.findById(postId).map(post -> {
////            comment.setPost(post);
////            return commentRepository.save(comment);
////        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + postId + " not found"));
////  
//		DictionaryGroup groupp =this.groupRepository.findById(groupId).map( group -> {
//			List<DictionarySubGroup> subGroupList=
//					this.subGroupRepository.findAllByGrouId(group.getId());
//			group.setDictionarySubGroup(subGroupList);
//			return group;
//		}).orElseThrow();
//		
//		return groupp;
//	}
	
	public DictionaryGroup saveGroup()
	{

		DictionaryGroup group=new DictionaryGroup();
		group.setCode("Ro_10");
		group.setName("10");
		group.setType("roles");
		group.setNbsCode("Management roles");
		
		group=this.groupRepository.save(group);
		
		DictionaryGroup group2=new DictionaryGroup();
		group2.setCode("Ro_30");
		group2.setName("30");
		group2.setType("roles");
		group2.setNbsCode("Delivery roles");
		group2=this.groupRepository.save(group2);
		
		DictionarySubGroup subGroup4=new DictionarySubGroup();
		subGroup4.setCode("Ro_30_10");
		subGroup4.setName("10");
		subGroup4.setType("roles");
		subGroup4.setNbsCode("Delivery team roles");
		subGroup4.setDictionaryGroup(group2);
		subGroup4 =this.subGroupRepository.save(subGroup4);
			
		DictionarySubGroup subGroup=new DictionarySubGroup();
		subGroup.setCode("Ro_10_10");
		subGroup.setName("10");
		subGroup.setType("roles");
		subGroup.setNbsCode("Organization roles");
		subGroup.setDictionaryGroup(group);
		subGroup =this.subGroupRepository.save(subGroup);
		DictionarySubGroup subGroup2=new DictionarySubGroup();
		subGroup2.setCode("Ro_10_20");
		subGroup2.setName("20");
		subGroup2.setType("roles");
		subGroup2.setNbsCode("Client roles");
		subGroup2.setDictionaryGroup(group);
		subGroup2=this.subGroupRepository.save(subGroup2);
		
		DictionarySubGroup subGroup3=new DictionarySubGroup();
		subGroup3.setCode("Ro_10_30");
		subGroup3.setName("20");
		subGroup3.setType("roles");
		subGroup3.setNbsCode("Asset management roles");
		subGroup3.setDictionaryGroup(group);
		subGroup3=this.subGroupRepository.save(subGroup3);

		
		

		DictionarySection section=new DictionarySection ();
		section.setCode("Ro_10_10");
		section.setName("10");
		section.setType("roles");
		section.setNbsCode("Organization roles");
		section.setDictionarySubGroup(subGroup);
		section=this.sectionRepository.save(section);
		
		DictionarySection section2=new DictionarySection ();
		section.setCode("Ro_10_20");
		section.setName("20");
		section.setType("roles");
		section.setNbsCode("Organization roles");
		section.setDictionarySubGroup(subGroup2);
		section=this.sectionRepository.save(section2);
		
		
		DictionaryObject object=new DictionaryObject ();
		object.setCode("Ro_10_10_05");
		object.setName("05");
		object.setType("roles");
		object.setNbsCode("Associate");
		object.setDictionarySection(section);
		object=this.objectRepository.save(object);
		
		DictionaryObject object2=new DictionaryObject ();
		object2.setCode("Ro_10_10_12");
		object2.setName("12");
		object2.setType("roles");
		object2.setNbsCode("Chairman");
		object2.setDictionarySection(section);
		object2=this.objectRepository.save(object2);
		
		DictionaryObject object3=new DictionaryObject ();
		object3.setCode("Ro_10_10_14");
		object3.setName("14");
		object3.setType("roles");
		object3.setNbsCode("Chief executive officer");
		object3.setDictionarySection(section);
		object3=this.objectRepository.save(object3);
		
		DictionaryObject object4=new DictionaryObject ();
		object4.setCode("Ro_10_10_16");
		object4.setName("1-");
		object4.setType("roles");
		object4.setNbsCode("Chief financial officer");
		object4.setDictionarySection(section);
		object4=this.objectRepository.save(object4);
		DictionaryObject object5=new DictionaryObject ();
		object5.setCode("Ro_10_10_18");
		object5.setName("18");
		object5.setType("roles");
		object5.setNbsCode("Chief operating officer");
		object5.setDictionarySection(section);
		object5=this.objectRepository.save(object5);
		
		DictionaryObject object6=new DictionaryObject ();
		object6.setCode("Ro_10_20_14");
		object6.setName("14");
		object6.setType("roles");
		object6.setNbsCode("Client (K)");
		object6.setNrm("00-05-20/120 Client");
		object6.setDictionarySection(section2);
		object6=this.objectRepository.save(object6);
		
		DictionaryObject object7=new DictionaryObject ();
		object7.setCode("Ro_10_20_15");
		object7.setName("15");
		object7.setType("roles");
		object7.setNbsCode("Client advisor");
		object7.setDictionarySection(section2);
		object7=this.objectRepository.save(object7);

		DictionaryObject object8=new DictionaryObject ();
		object8.setCode("Ro_10_20_16");
		object8.setName("16");
		object8.setType("roles");
		object8.setNbsCode("Client representative");
		object8.setDictionarySection(section2);
		object8=this.objectRepository.save(object8);
		
		

		return group;
	}
	
	public DictionaryObject saveSection()
	{

		long i = 2L;
		Optional<DictionarySection>section
		=this.sectionRepository.findById(i);
		
		
		
		DictionaryObject object=new DictionaryObject ();
		object.setCode("Ro_10_10_05");
		object.setName("05");
		object.setType("roles");
		object.setNbsCode("Associate");
		object.setDictionarySection(section.get());
		object=this.objectRepository.save(object);
		
		DictionaryObject object2=new DictionaryObject ();
		object2.setCode("Ro_10_10_12");
		object2.setName("12");
		object2.setType("roles");
		object2.setNbsCode("Chairman");
		object2.setDictionarySection(section.get());
		object2=this.objectRepository.save(object2);
		
		DictionaryObject object3=new DictionaryObject ();
		object3.setCode("Ro_10_10_14");
		object3.setName("14");
		object3.setType("roles");
		object3.setNbsCode("Chief executive officer");
		object3.setDictionarySection(section.get());
		object3=this.objectRepository.save(object3);
		
		DictionaryObject object4=new DictionaryObject ();
		object4.setCode("Ro_10_10_16");
		object4.setName("1-");
		object4.setType("roles");
		object4.setNbsCode("Chief financial officer");
		object4.setDictionarySection(section.get());
		object4=this.objectRepository.save(object4);
		DictionaryObject object5=new DictionaryObject ();
		object5.setCode("Ro_10_10_18");
		object5.setName("18");
		object5.setType("roles");
		object5.setNbsCode("Chief operating officer");
		object5.setDictionarySection(section.get());
		object5=this.objectRepository.save(object5);
		
		DictionaryObject object6=new DictionaryObject ();
		object6.setCode("Ro_10_20_14");
		object6.setName("14");
		object6.setType("roles");
		object6.setNbsCode("Client (K)");
		object6.setNrm("00-05-20/120 Client");
		object6.setDictionarySection(section.get());
		object6=this.objectRepository.save(object6);
		
		DictionaryObject object7=new DictionaryObject ();
		object7.setCode("Ro_10_20_15");
		object7.setName("15");
		object7.setType("roles");
		object7.setNbsCode("Client advisor");
		object7.setDictionarySection(section.get());
		object7=this.objectRepository.save(object7);

		DictionaryObject object8=new DictionaryObject ();
		object8.setCode("Ro_10_20_16");
		object8.setName("16");
		object8.setType("roles");
		object8.setNbsCode("Client representative");
		object8.setDictionarySection(section.get());
		object8=this.objectRepository.save(object8);
		
		

		return object8;
	}
	
}
