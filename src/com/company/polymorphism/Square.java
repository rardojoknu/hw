package com.company.polymorphism;

public class Square implements Figure {
    @Override
    public void draw() {
        System.out.println("Рисуется квадрат со свой реализацией рисования");
    }
}
