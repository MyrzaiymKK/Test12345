package com.example.test.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "user_seq", allocationSize = 1)
    private Long id;
    private String cityAVGEducation;
    private String school;
    private String cityHigherEducation;
    private String university;

    @OneToOne
    private User user;
}