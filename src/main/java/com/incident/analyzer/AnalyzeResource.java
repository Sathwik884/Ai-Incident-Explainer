package com.incident.analyzer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;

@Path("/analyze")
@ApplicationScoped
public class AnalyzeResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public AnalyzeResponse analyze(AnalyzeRequest request) {
        String text = request.text != null ? request.text : "";
        
        // Simple analysis logic
        String issue = "Detected issue in: " + text.substring(0, Math.min(50, text.length()));
        String cause = "Root cause analysis of the incident";
        String fix = "Recommended fix for the issue";
        
        return new AnalyzeResponse(issue, cause, fix);
    }
}

// Made with Bob
