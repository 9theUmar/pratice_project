package com.practice.service.impl;

import com.practice.dto.UserDto;
import com.practice.entity.User;
import com.practice.mapper.UserMapper;
import com.practice.repository.UserRepository;
import com.practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto createOrUpdate(UserDto dto) {

        User entity=null;
        // Update
        if (dto.getUuid() != null) {
            entity = userMapper.dtoToEntity(dto);
        }
        // Create
        else {
            entity = userMapper.dtoToEntity(dto);
        }

        User saved = userRepository.save(entity);
        return userMapper.entityToDto(saved);
    }
}