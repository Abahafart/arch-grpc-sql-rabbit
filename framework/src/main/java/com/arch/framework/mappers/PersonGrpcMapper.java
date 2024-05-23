package com.arch.framework.mappers;

import org.mapstruct.Mapper;

import com.arch.domain.PersonDO;
import com.arch.framework.config.MappingConfig;
import com.arch.framework.output.postgresql.data.PersonEntity;

@Mapper(config = MappingConfig.class)
public interface PersonGrpcMapper extends GenericMapper<PersonDO, com.arch.grpc.PersonDetailsRequest, com.arch.grpc.PersonDetailsResponse, PersonEntity> {

}
