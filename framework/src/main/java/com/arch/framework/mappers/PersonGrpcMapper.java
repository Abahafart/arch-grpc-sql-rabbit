package com.arch.framework.mappers;

import org.mapstruct.Mapper;

import com.arch.domain.PersonDO;
import com.arch.framework.config.MappingConfig;
import com.arch.framework.output.postgresql.data.PersonEntity;
import com.arch.grpc.PersonDetailsRequest;
import com.arch.grpc.PersonDetailsResponse;

@Mapper(config = MappingConfig.class)
public interface PersonGrpcMapper extends GenericMapper<PersonDO, PersonDetailsRequest, PersonDetailsResponse, PersonEntity> {

}
