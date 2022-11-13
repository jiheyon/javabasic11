package org.example.inter;

public class BullDog extends Dog implements Pet, Violent{
    @Override
    public void attack(String target) {

    }
    // 강아지의 한 종류이고 애완동물의 기능을 가지고 있음
    // + 공격기능이 있음
    // 새로운 인터페이스를 추가한다
}
