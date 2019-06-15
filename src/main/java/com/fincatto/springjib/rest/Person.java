package com.fincatto.springjib.rest;

import java.io.Serializable;
import java.util.Objects;

class Person implements Serializable {
    
    private Long id;
    private String name;
    
    public Long getId() {
        return id;
    }
    
    public Person setId(Long id) {
        this.id = id;
        return this;
    }
    
    public String getName() {
        return name;
    }
    
    public Person setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Person person = (Person) o;
        return Objects.equals(id, person.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
