package com.issueiq.service;

import com.issueiq.dto.GitHubIssueResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.List;

@Component
public class GitHubClient {
    private final RestClient restClient;

    public GitHubClient() {
        this.restClient = RestClient.builder()
                .baseUrl("https://api.github.com")
                .build();
    }

    public List<GitHubIssueResponse> getIssues(
            String owner,
            String repository
    ) {

        return restClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/repos/{owner}/{repo}/issues")
                        .queryParam("state", "all")
                        .queryParam("per_page", 30)
                        .build(owner, repository)
                )
                .retrieve()
                .body(new ParameterizedTypeReference<List<GitHubIssueResponse>>() {}
                );
    }
}
