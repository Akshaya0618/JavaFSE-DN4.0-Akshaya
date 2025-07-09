package com.library.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {
    public List<String> getAllBooks() {
        return Arrays.asList("The Alchemist", "Harry Potter", "Clean Code", "Atomic Habits");
    }
}
