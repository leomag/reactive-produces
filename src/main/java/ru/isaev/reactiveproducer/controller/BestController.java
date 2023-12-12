package ru.isaev.reactiveproducer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.isaev.reactiveproducer.stream.WikimediaStreamConsumer;

@RestController
@RequestMapping("/api/wikimedia")
@RequiredArgsConstructor
public class BestController {

    private final WikimediaStreamConsumer streamConsumer;

    @GetMapping
    public void startPublishing() {
        streamConsumer.consumeStreamAndPublish();
    }
}
