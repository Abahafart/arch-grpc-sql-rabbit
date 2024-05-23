package com.arch.framework.output.postgresql.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arch.framework.output.postgresql.data.PersonEntity;

public interface PersonManagementRepository extends JpaRepository<PersonEntity, Long> {

}
