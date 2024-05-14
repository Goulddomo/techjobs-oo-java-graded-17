package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;


    public JobField() {
        id = nextId;
        nextId++;
    }

    // Constructor
    public JobField(String value) {
        this();
        this.value = value;
    }

    //    Getters
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }


    //  Setters
    public void setValue(String value) {
        this.value = value;
    }


    //    ToString
    @Override
    public String toString() {
        return value;
    }


    //    HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
