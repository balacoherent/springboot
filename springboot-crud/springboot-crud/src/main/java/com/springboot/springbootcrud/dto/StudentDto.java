package com.springboot.springbootcrud.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class StudentDto {
    private int id;
    private String name;
    private String address;
}
