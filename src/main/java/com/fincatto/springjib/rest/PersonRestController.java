package com.fincatto.springjib.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/person")
public class PersonRestController {
    
    @GetMapping
    public ResponseEntity<String> status() {
        log.debug("Reading status...");
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Person>> listAll() {
        log.debug("Listing persons...");
        //https://www.thecuriousdev.org/lombok-builder-with-jackson/
        return new ResponseEntity<>(Arrays.asList(
                new Person(1L, "John Doe"),
                new Person(2L, "Jane Doe")
        ), HttpStatus.OK);
    }
}
