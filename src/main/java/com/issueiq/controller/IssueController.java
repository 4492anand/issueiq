package com.issueiq.controller;

import com.issueiq.dto.GitHubIssueResponse;
import com.issueiq.service.IssueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/issues")
public class IssueController {

    private final IssueService issueService;

    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }
    @GetMapping("/github/{owner}/{repository}")
    public List<GitHubIssueResponse> getGitHubIssues(
            @PathVariable String owner,
            @PathVariable String repository
    ) {
        return issueService.getIssues(owner,repository);
    }
}