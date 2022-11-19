package org.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 코리아레스토랑은 레스토랑의 구현체다!

public class KoreanRestaurant implements Restaurant{

   // private Chef chef = new KimChef();
    private Chef chef;  // 이렇게 씀, 쉐프의 초기화을 쓰지 말아아 여기서 입력하지 마라


    public KoreanRestaurant(Chef chef){
        this.chef = chef;
    }

    public void order () {
        System.out.println("한식을 주문합니다");
        chef.cook(); // 요리는 주문이 들어오면 진행하기 때문에 오더에 캡슐화가 된거임,
    }
}
