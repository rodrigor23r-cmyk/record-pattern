package com.example;

import lombok.Builder;

@Builder

public record Biblioteca(String nombre, Libro bestseller) {

}
