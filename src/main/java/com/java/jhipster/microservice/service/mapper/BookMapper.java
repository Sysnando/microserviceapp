package com.java.jhipster.microservice.service.mapper;

import com.java.jhipster.microservice.domain.*;
import com.java.jhipster.microservice.service.dto.BookDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Book and its DTO BookDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface BookMapper extends EntityMapper<BookDTO, Book> {

    

    
}
