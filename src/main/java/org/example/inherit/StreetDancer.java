package org.example.inherit;

import org.example.encap.Dancer;
import org.example.encap.Grade;

public class StreetDancer extends Dancer {
    //알트+엔터
    public StreetDancer(String crewName, Grade grade, String myName) {
        super(crewName, grade, myName);
    }

    @Override
    public void dance() {
        //여기에 상세내용 적기
        System.out.println("빙글빙글 돈다"); // 기능을 명시할 수 밖에 없게 만든다
    }
}
