package com.arch.application.ports.input;

import com.arch.application.generic.ServiceApplication;
import com.arch.application.ports.output.PersonManagementOutputPort;
import com.arch.application.usecases.PersonManagementUseCase;
import com.arch.domain.PersonDO;

import lombok.RequiredArgsConstructor;

@ServiceApplication
@RequiredArgsConstructor
public class PersonManagementInputPort implements PersonManagementUseCase {

  private final PersonManagementOutputPort managementOutputPort;

  @Override
  public PersonDO complementData(PersonDO personDO) {
    return managementOutputPort.save(personDO);
  }
}
