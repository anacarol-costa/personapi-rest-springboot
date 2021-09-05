package com.github.anacarolcosta.personapicarol.mapper;


import com.github.anacarolcosta.personapicarol.dto.request.PersonDTO;
import com.github.anacarolcosta.personapicarol.entity.Person;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;
import org.mapstruct.Mapper;



@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "dataNascimento", source = "dataNascimento", dateFormat = "dd-MM-yyyy")
    default Person toModel(PersonDTO personDTO) {
        return null;
    }

    PersonDTO toDTO(Person person);
}
