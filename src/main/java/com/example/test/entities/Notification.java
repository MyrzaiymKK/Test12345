package com.example.test.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@Entity
@Table(name = "notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "user_seq", allocationSize = 1)
    private Long id;
    private ZonedDateTime createdAt;
    private boolean seen;
    private String notification;

    @OneToOne
    private Like like;
    @OneToOne
    private User user;
    @OneToOne
    private InnerComment innerComment;
    @OneToOne
    private Comment comment;

}