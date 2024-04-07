package com.example.test.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "story")
public class Story {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "user_seq", allocationSize = 1)
    private Long id;
    private ZonedDateTime createdAd;
    private ZonedDateTime expDate;
    @ManyToOne
    private User user;
    @OneToMany
    private List<User> users;
    @OneToMany
    private List<Like> likes;
    @OneToMany
    private List<Link_Publication> linkPublications;


}