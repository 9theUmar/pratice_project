package com.practice.mapper;

import com.practice.dto.UserDto;
import com.practice.entity.User;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User dtoToEntity(UserDto dto);
    UserDto entityToDto(User entity);
}
