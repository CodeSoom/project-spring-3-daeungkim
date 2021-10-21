package com.codesoom.project.controllers;

import com.codesoom.project.dto.ApplicationStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class HealthCheckController {
    @RequestMapping("/health")
    @ResponseStatus(HttpStatus.OK)
    public ApplicationStatus healthCheck() {
        return new ApplicationStatus("UP");
    }
}
