package com.example.test.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "publication")
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "user_seq", allocationSize = 1)
    private Long id;
    private String description;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
    private String location;

    @ManyToOne
    private User user;
    @OneToMany
    private List<User> users;
    @OneToMany
    private List<Link_Publication> linkPublications;
    @OneToMany
    private List<Comment> comments;
    @ManyToOne
    private PablicProfile pablicProfile;
    @OneToMany
    private List<Like> likes;
}
