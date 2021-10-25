package com.codesoom.project.controllers;

import com.codesoom.project.dto.ApplicationStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * 서버의 정상 작동 여부를 리턴한다.
 */
@RestController
public final class HealthCheckController {
    @RequestMapping("/health")
    @ResponseStatus(HttpStatus.OK)
    public ApplicationStatus healthCheck() {
        return new ApplicationStatus("UP");
    }
}
