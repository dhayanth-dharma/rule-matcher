package com.aitenders.parser.repositories;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.transaction.annotation.Transactional;



public class BaseRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID>
implements BaseRepository<T, ID> {

//private static final Logger logger = Logger.getLogger(BaseRepositoryImpl.class);

private final EntityManager entityManager;

public BaseRepositoryImpl(final JpaEntityInformation<T, ?> entityInformation, final EntityManager entityManager) {
super(entityInformation, entityManager);
this.entityManager = entityManager;
}

public BaseRepositoryImpl(final Class<T> domainClass, final EntityManager entityManager) {
super(domainClass, entityManager);
this.entityManager = entityManager;
}

@Transactional
@Override
public T finditOrThrowIt(final ID id) {
final T find = this.entityManager.find(this.getDomainClass(), id);
if (find == null) {
//	logger.error("Resource {} with id {} does not exist", this.getDomainClass().getSimpleName(), id);
//	throw new ResourceNotFoundException(this.getDomainClass(), id);
	
	System.out.println("Resource not found exception");
}
return find;
}

}
