package com.codesoom.project.dto;

public final class ApplicationStatus {
    private final String status;

    public ApplicationStatus(final String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
