package com.nace.rest;

import com.nace.dto.NaceData;
import com.nace.service.NaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Mono;

@RestController()
public class NaceRestController {
    private static final Logger logger = LoggerFactory.getLogger(NaceRestController.class);


    @Autowired
    private NaceService service;

    @GetMapping (value="/nace/api/orders/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Mono<NaceData> getById(@PathVariable("id") Long id) {
        logger.debug("Getting order by id: " + id);

        return service.getById(id);
    }

    @PostMapping(value = "/nace/api/orders/persist")
    public Mono<NaceData> persist(@RequestBody NaceData data) {
        logger.debug("Saving: " + data);
        try {
            return service.save(data);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), ex);
        }
    }
}
