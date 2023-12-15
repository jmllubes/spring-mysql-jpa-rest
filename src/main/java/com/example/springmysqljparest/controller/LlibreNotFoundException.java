package com.example.springmysqljparest.controller;

public class LlibreNotFoundException extends RuntimeException {
    public LlibreNotFoundException(String isbn) {
        super("No s'ha trobat el llibre amb ISBN: " + isbn);
    }
}
