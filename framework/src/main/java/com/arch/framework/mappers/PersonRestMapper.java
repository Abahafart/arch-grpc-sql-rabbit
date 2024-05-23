package com.arch.framework.mappers;

import org.mapstruct.Mapper;

import com.arch.domain.PersonDO;
import com.arch.domain.request.PersonRequest;
import com.arch.domain.response.PersonResponse;
import com.arch.framework.config.MappingConfig;
import com.arch.framework.output.postgresql.data.PersonEntity;

@Mapper(config = MappingConfig.class)
public interface PersonRestMapper extends GenericMapper<PersonDO, PersonRequest, PersonResponse, PersonEntity> {

}
