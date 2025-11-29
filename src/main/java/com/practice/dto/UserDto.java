package com.practice.dto;


import lombok.*;

@Builder
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
    private String createdBy;
    private String createdDate;
    private String updatedBy;
    private String updatedDate;

    @Builder.Default
    private Boolean isDelete=false;
}
