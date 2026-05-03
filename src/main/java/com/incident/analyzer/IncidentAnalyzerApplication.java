package com.incident.analyzer;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class IncidentAnalyzerApplication implements QuarkusApplication {

    public static void main(String... args) {
        Quarkus.run(IncidentAnalyzerApplication.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("Incident Analyzer Application started successfully!");
        System.out.println("REST API available at: http://localhost:8080/analyze");
        Quarkus.waitForExit();
        return 0;
    }
}

// Made with Bob