package org.example.spring;

import org.example.Main;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
    @Test
@DisplayName("스프링 없이 의존객체 주입해보기")
    void hotelTest() {

        // 이제 컨터에너에서만 new(객체생성) 했음, 나머지 클래스에서는 뉴  안함!!
        // 즉 코드수정은 컨테이너에서만 일어난다!
        // 수정이 쉬움!!
        Container con = new Container();

        Hotel hotel = con.hotel();

        hotel.service();

    }

    @Test
    @DisplayName("스프링으로 의존객체 주입해보기")
    void SpringTest(){
        // 스프링 컨테이너 불러오기
        // 스프링의 컨테이너를 쓰기

        AnnotationConfigApplicationContext con
                = new AnnotationConfigApplicationContext(Main.class); // 어디를 읽어야하는지
        // 호텔 빈 꺼내기
        Hotel hotel = con.getBean(Hotel.class);  // 빈을 꺼내오는 기준 :
        hotel.service();
    }
}