package com.mvc.model;

public class HelloModel {
    public String getMessage(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Hello, Guest!";
        } else {
            return "Hello, " + name + "! Welcome to MVC Example.";
        }
    }
}
