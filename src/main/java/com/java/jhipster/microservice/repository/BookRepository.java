package com.java.jhipster.microservice.repository;

import com.java.jhipster.microservice.domain.Book;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.stereotype.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Book entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface BookRepository extends MongoRepository<Book, String> {

}
