package com.incident.analyzer;

public class AnalyzeResponse {
    public String issue;
    public String cause;
    public String fix;

    public AnalyzeResponse(String issue, String cause, String fix) {
        this.issue = issue;
        this.cause = cause;
        this.fix = fix;
    }
}

// Made with Bob
