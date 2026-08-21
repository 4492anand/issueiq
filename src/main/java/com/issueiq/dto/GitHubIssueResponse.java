package com.issueiq.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

public record GitHubIssueResponse(

        Long id,

        Integer number,

        String title,

        String body,

        String state,

        GitHubUser user,

        @JsonProperty("html_url")
        String htmlUrl,

        @JsonProperty("pull_request")
        Object pullRequest
) {

    public record GitHubUser(
            String login
    ) {
    }
}