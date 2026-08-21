package com.issueiq.entity;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "issues",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"repository", "githubIssueId"}
                )
        }
)
public class issue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long githubIssueId;

    private Integer issueNumber;

    private String repository;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String state;

    private String author;

    private String githubUrl;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}