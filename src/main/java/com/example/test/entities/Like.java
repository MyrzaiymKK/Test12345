package com.example.test.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "like")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "user_seq", allocationSize = 1)
    private Long id;
    private boolean like;

    @OneToOne
    private User user;
    @ManyToOne
    private Story story;
    @ManyToOne
    private Comment comment;
    @OneToOne
    private Notification notification;
    @ManyToOne
    private Publication publication;
    @ManyToOne
    private InnerComment innerComment;

}