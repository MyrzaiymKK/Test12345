package com.example.test.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import peakspace.enums.Tematica;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pablic_profile")
public class PablicProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "user_seq", allocationSize = 1)
    private Long id;
    private String cover;
    private String avatar;
    private String pablicName;
    private Tematica tematica;

    @OneToOne
    private User user;
    @OneToMany
    private List<Publication> publications;

}