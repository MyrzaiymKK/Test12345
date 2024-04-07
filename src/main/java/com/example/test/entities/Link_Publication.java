package com.example.test.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "link_publication")
public class Link_Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "user_seq", allocationSize = 1)
    private Long id;
    private String link;
    private ZonedDateTime createdAt;

    @OneToOne
    private Profile profile;
    @OneToMany
    private List<Story> stories;
    @ManyToOne
    private Chat chat;
    @ManyToOne
    private Publication publication;

}