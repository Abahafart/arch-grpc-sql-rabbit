package com.arch.framework.input.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arch.application.usecases.PersonManagementUseCase;
import com.arch.domain.PersonDO;
import com.arch.domain.request.PersonRequest;
import com.arch.domain.response.PersonResponse;
import com.arch.framework.mappers.PersonRestMapper;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/persons")
public class PersonController {

  private final Logger log = LoggerFactory.getLogger(PersonController.class);
  private final PersonRestMapper mapper;
  private final PersonManagementUseCase useCase;

  @PostMapping
  public PersonResponse complementInformation(@RequestBody PersonRequest request) {
    log.info("Information received {}", request);
    PersonDO personDO = mapper.fromRequestToModel(request);
    return mapper.fromModelToResponse(useCase.complementData(personDO));
  }

}
