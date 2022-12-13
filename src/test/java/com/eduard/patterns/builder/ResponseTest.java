package com.eduard.patterns.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Builder pattern
class ResponseTest {

    @Test
    void shouldBuildResponse() {
        var expectedResponse = new Response(true, 1, "main");
        var actualResponse = Response.builder()
                .enabled(true)
                .requiredApprovals(1)
                .branch("main")
                .build();

        assertEquals(expectedResponse, actualResponse);
    }
}