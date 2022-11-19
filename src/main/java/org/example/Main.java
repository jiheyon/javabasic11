package org.example;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.example")
public class Main {
    public static void main(String[] args) {
        System.out.println("안녕하세요!");
    }
}