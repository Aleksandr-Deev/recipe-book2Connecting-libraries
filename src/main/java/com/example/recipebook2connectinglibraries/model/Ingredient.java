package com.example.recipebook2connectinglibraries.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingredient {

    private long id;
    private String name;
    private int count;
    private String measureUnit;
}