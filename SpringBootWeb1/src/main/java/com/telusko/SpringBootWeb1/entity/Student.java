package com.telusko.SpringBootWeb1.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {

    private Long id;
    private String name;
    private String address;
    private Long contact;
}
