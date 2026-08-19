package com.issueiq.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "issues")

@Getter @Setter
public class issue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "githubIssueId")
    private Long githubIssueId;

    @Column(name = "issueNumber")
    private Integer issueNumber;

    @Column(name = "repository")
    private String repository;

    @Column(name = "title")
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String state;

}

