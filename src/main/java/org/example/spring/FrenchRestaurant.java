package org.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FrenchRestaurant implements Restaurant{
    //private Chef chef = new KimChef();
    private Chef chef;
    // 1. 셋터(생성자) 주입으로 진행하는 방법

    @Autowired
    public FrenchRestaurant(@Qualifier("kimChef") Chef chef) {
        this.chef = chef; // 생성자임, 뭐든 들어옴
    }

    public void order() {
        System.out.println("프랑스 요리를 주문합니다");
        chef.cook();
    }
}
