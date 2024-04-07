package com.example.test.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "user_seq", allocationSize = 1)
    private Long id;
    private String userName;
    private String email;
    private String password;
    private Boolean isBlock;
    @ElementCollection
    private List<Long> favorites;

    @OneToOne
    private Education education;
    @OneToOne
    private Profile profile;
    @OneToOne
    private Like like;
    @OneToMany
    private List<Story> stories;
    @ManyToOne
    private Story story;
    @ManyToOne
    private Friends friend;
    @OneToOne
    private Chat chat;
    @OneToMany
    private List<Comment> comments;
    @OneToOne
    private PablicProfile pablicProfile;
    @ManyToOne
    private Publication publication;
    @OneToMany
    private List<Publication>  publications;
    @OneToOne
    private Notification notification;
}
