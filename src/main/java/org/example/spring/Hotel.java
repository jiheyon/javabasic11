package org.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hotel {
    // 호텔이 운영되기 위해 필요한 것들

    // private SuiteRoom room; 이건 호텔에는 룸이 있어야된다는 선언만 한거임! new로 만들어주기
    // private KoreanRestaurant restaurant 위랑 마칸가지임
    private SuiteRoom room;
    private Restaurant restaurant;

    @Autowired // 아까 @Component 붙인거 찾아서 맞는거 찾아서 주입해주심
    // 타입에 맟게 자동으로 주입, 생성자니까 생성자주입임
    public Hotel(SuiteRoom room, Restaurant restaurant) {   // 생성자
        this.room = room;
        this.restaurant = restaurant;
    }

    public void service() {
    room.reserve();
    restaurant.order();
    }
}
