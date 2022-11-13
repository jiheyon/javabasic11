package org.example.inherit;

import org.example.encap.Dancer;
import org.example.encap.Grade;

// 댄서의 기능에서 확장하는거임
public class IdolDancer extends Dancer {

    public IdolDancer(String crewName, Grade grade, String myName) {
        super(crewName, grade, myName);
        System.out.println("zzzz");
    }
    @Override  // 이거 선언하면 혹시라도 오버라이딩 잘못 됐을 경우 알려줌
    public void dance() {  //부모 형태를 그대로 가져와야함
        // super.dance(); // 부모정보 그대로 가져오기
        System.out.println("윙크를 합니다~");
    }
}

