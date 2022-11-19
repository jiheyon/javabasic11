package org.example.spring;

public class NanaChef implements Chef{

    @Override
    public void cook() {
        System.out.println("나나 쉐프가 요리합니다.");
    }
}
