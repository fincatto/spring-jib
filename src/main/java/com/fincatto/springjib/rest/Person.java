package com.fincatto.springjib.rest;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;

import java.io.Serializable;

@Builder
@JsonDeserialize(builder = Person.PersonBuilder.class)
class Person implements Serializable {
    private Long id;
    private String name;
}
