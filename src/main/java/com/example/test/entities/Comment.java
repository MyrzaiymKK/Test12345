package com.example.test.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "user_seq", allocationSize = 1)
    private Long id;
    private String message;
    private ZonedDateTime createdAt;

    @ManyToOne
    private User user;
    @OneToMany
    private List<Comment> comments;
    @OneToOne
    private Notification notification;
    @ManyToOne
    private Publication publication;
    @OneToMany
    private List<InnerComment> innerComments;

}