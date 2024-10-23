package com.example.sse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.awt.*;

@RestController
public class SseController {

    @GetMapping(path = "/see", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public SseEmitter suscribe() {
        SseEmitter emitter = new SseEmitter(Long.MAX_VALUE);

        return emitter;
    }
}
