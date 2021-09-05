package com.github.anacarolcosta.personapicarol.repository;

import com.github.anacarolcosta.personapicarol.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Long> {
}
