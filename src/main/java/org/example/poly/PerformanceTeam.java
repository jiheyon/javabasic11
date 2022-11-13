package org.example.poly;

import org.example.encap.Dancer;

import java.util.ArrayList;
import java.util.List;

// 공연팀
public class PerformanceTeam {


    private List<Dancer> dancers = new ArrayList<>();


    // 팀원 추가하기
    public void addDancer(Dancer dancer) {
        dancers.add(dancer);
        System.out.println(dancer + "가 추가됨!");
    }
}