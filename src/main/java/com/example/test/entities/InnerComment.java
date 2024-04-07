package com.example.test.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "inner_comment")
public class InnerComment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "user_seq", allocationSize = 1)
    private Long id;
    private String message;
    private ZonedDateTime createdAt;

    @ManyToOne
    private Comment comment;
    @OneToOne
    private Notification notification;
    @OneToMany
    private List<Like> likes;

}