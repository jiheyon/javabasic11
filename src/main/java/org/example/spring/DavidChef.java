package org.example.spring;

import org.springframework.stereotype.Component;

@Component
public class DavidChef implements Chef{

    // 알트+엔터 > 구현체 실현 - 요리 cook() 있어야 하기 때문
    @Override
    public void cook() {
        System.out.println("데이빗쉐프가 요리합니다");
    }
}
