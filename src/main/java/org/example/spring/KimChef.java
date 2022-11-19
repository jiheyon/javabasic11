package org.example.spring;

import org.springframework.stereotype.Component;


@Component // 스프링한테 객체의 생명주기를 맡기는 것임, 스프링한테 위힘한거
// 컴포넌트 기본값이 앞 소문자로 시작함
public class KimChef implements Chef {
    // 김쉐프는 요리하는 기능이 있음
    public void cook() {
        System.out.println("김쉐프가 요리합니다");
    }
}
