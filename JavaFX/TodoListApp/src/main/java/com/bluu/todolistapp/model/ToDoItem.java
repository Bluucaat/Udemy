package com.bluu.todolistapp.model;

import lombok.Data;

import java.time.LocalDate;

public @Data class ToDoItem {
    private String shortDescription;
    private String details;
    private LocalDate dueDate;

    public ToDoItem(String shortDescription, String details, LocalDate dueDate) {
        this.shortDescription = shortDescription;
        this.details = details;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return shortDescription;
    }
}
