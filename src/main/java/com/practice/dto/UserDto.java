package com.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String uuid;
    private String name;
    private String mobile;
    private String email;
    private String city;

    private String createdBy;
    private String createdDate;
    private String updatedBy;
    private String updatedDate;
}
