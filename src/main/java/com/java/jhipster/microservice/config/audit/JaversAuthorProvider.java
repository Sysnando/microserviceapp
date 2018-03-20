package com.java.jhipster.microservice.config.audit;

import com.java.jhipster.microservice.config.Constants;
import com.java.jhipster.microservice.security.SecurityUtils;
import org.javers.spring.auditable.AuthorProvider;
import org.springframework.stereotype.Component;

@Component
public class JaversAuthorProvider implements AuthorProvider {

   @Override
   public String provide() {
       String userName = SecurityUtils.getCurrentUserLogin().toString();
       return (userName != null ? userName : Constants.SYSTEM_ACCOUNT);
   }
}
