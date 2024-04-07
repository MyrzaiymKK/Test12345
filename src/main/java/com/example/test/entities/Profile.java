package com.example.test.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "user_seq", allocationSize = 1)
    private Long id;
    private String avatar;
    private String cover;
    private String aboutYourSelf;
    private String fullName;
    private String phoneNumber;
    private String profession;

    @OneToOne
    private User user;
    @OneToOne
    private Link_Publication linkPublication;
}
