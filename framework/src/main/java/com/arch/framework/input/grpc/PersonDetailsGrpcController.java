package com.arch.framework.input.grpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.arch.application.usecases.PersonManagementUseCase;
import com.arch.domain.PersonDO;
import com.arch.framework.mappers.PersonGrpcMapper;
import com.arch.grpc.PersonDetailsRequest;
import com.arch.grpc.PersonDetailsResponse;
import com.arch.grpc.PersonServiceGrpc.PersonServiceImplBase;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class PersonDetailsGrpcController extends PersonServiceImplBase {

  private static final Logger log = LoggerFactory.getLogger(PersonDetailsGrpcController.class);
  private final PersonManagementUseCase useCase;

  public PersonDetailsGrpcController(PersonManagementUseCase useCase, PersonGrpcMapper mapper) {
    this.useCase = useCase;
    this.mapper = mapper;
  }

  private final PersonGrpcMapper mapper;

  @Override
  public void calculateAge(PersonDetailsRequest request,
      StreamObserver<PersonDetailsResponse> responseObserver) {
    log.info("Request received : {}", request);
    PersonDO personDO = mapper.fromRequestToModel(request);
    PersonDetailsResponse response = mapper.fromModelToResponse(useCase.complementData(personDO));
    log.info("Response created : {}", response);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}
