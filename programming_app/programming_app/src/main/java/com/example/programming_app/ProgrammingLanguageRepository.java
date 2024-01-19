package com.example.programming_app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
//(path = "/repo-prog-languages",collectionResourceDescription = @Description("Repository dedicata a \"ProgrammingLanguage\" entity"))
//
//org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'welcomePageHandlerMapping' defined in class path resource
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Long> {
}
