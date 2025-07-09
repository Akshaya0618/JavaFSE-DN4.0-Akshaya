package com.library.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {
    public List<String> getAllBooks() {
        return Arrays.asList("The Alchemist", "Clean Code", "Spring in Action");
    }
}
