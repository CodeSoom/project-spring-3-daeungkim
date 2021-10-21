package com.codesoom.project.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HealthCheckController.class)
@DisplayName("HealthCheckController 클래스")
public final class HealthCheckControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Nested
    @DisplayName("헬스체크 엔드포인트는")
    public final class Describe_healthCheck {
        private static final String HEALTH_CHECK_END_POINT = "/health";
        private static final String APPLICATION_STATUS = "{\"status\":\"UP\"}";

        @Test
        @DisplayName("스프링 어플리케이션의 정상작동여부를 확인시켜준다.")
        public void it_returns_application_status() throws Exception {
            mockMvc.perform(get(HEALTH_CHECK_END_POINT))
                .andExpect(status().isOk())
                .andExpect(content().string(APPLICATION_STATUS));
        }
    }
}
