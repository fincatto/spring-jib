package com.fincatto.springjib.rest;

import com.fincatto.springjib.Loggable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonRestController implements Loggable {
    
    @GetMapping
    public ResponseEntity<String> status() {
        this.getLogger().debug("Reading status...");
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Person>> listAll() {
        this.getLogger().debug("Listing persons...");
        return new ResponseEntity<>(Arrays.asList(
                new Person().setId(1L).setName("John Doe"),
                new Person().setId(2L).setName("Jane Doe")
        ), HttpStatus.OK);
    }
}
