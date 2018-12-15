package com.company.polymorphism;

public class Circle implements Figure {
    @Override
    public void draw() {
        System.out.println("Рисуется круг со свой реализацией рисования");
    }
}
