package com.practice.dto;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"createdBy","createdDate","updatedBy","updatedDate"})
public class UserDto {

    private String uuid;
    private String name;
    private String mobile;
    private String email;
    private String city;
    private Boolean isDelete=false;
}
