package org.example.spring;


// 유사 스프링 컨테이너
public class Container {

    // 쉐프 빈 등록
    // <bean id="chef" class="org.example.spring.KimChef" />
    public Chef chef() {
        return new NanaChef();
    }

    // 레스토랑 빈 등록
    // <bean id="restaurant" class="org.example.spring.KoreanRestaurant">
    //     <constructor-args ref="chef" />
    //     //  <constructor-args ref="chef" />   ->>  생성자에게 쉐프를 주입하겠다
    // </bean>
    // 이거 실행하면 김쉐프나옴, 즉, 코리아레스토랑에 쉐프에 김쉐프가 들어갔음
    // 컨테이너가 김쉐프를 주입하고 있음
   /* public Restaurant restaurant() {
        return new KoreanRestaurant(chef());
    } */

    public KoreanRestaurant restaurant() {
        return new KoreanRestaurant(chef());
    }

    public FrenchRestaurant frenchRestaurant() {
        return new FrenchRestaurant(chef());
    }
    // 이제 위에서 쉐프를 바꾸면 쉐프 ㅈ참조하고 있는 모든 클래스 다 바\귐

    public Hotel hotel() {
        return new Hotel(
                new SuiteRoom(),
                restaurant()
        );    //스프링에서 다 해줌, 오토와이러드? 하면 생성자나 셋터를 통해 다 넣어줌
    }
}