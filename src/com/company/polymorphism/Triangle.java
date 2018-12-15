package com.company.polymorphism;

public class Triangle implements Figure {
    @Override
    public void draw() {
        System.out.println("Рисуется триугольник со свой реализацией рисования");
    }
}
