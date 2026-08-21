package com.issueiq.service;

import com.issueiq.dto.GitHubIssueResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueService {

    private final GitHubClient gitHubClient;

    public IssueService(GitHubClient gitHubClient) {
        this.gitHubClient = gitHubClient;
    }

    public List<GitHubIssueResponse> getIssues(
            String owner,
            String repository
    ) {

        return gitHubClient.getIssues(
                owner,
                repository
        );
    }
}