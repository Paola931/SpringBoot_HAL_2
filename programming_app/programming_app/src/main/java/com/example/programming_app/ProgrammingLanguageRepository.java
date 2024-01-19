package com.example.programming_app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Long> {
}
