package com.arch.framework.output.postgresql.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.arch.application.ports.output.PersonManagementOutputPort;
import com.arch.domain.PersonDO;
import com.arch.framework.mappers.PersonGrpcMapper;
import com.arch.framework.output.postgresql.repository.jpa.PersonManagementRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class PersonManagementPostgresqlAdapter implements PersonManagementOutputPort {

  private static final Logger log = LoggerFactory.getLogger(PersonManagementPostgresqlAdapter.class);
  private final PersonManagementRepository repository;
  private final PersonGrpcMapper mapper;

  @Override
  public PersonDO save(PersonDO model) {
    return null;
  }

  @Override
  public PersonDO getById(String id) {
    return null;
  }

  @Override
  public void delete(String id) {

  }
}
