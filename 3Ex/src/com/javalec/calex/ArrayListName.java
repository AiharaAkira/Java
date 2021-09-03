package com.javalec.calex;

import java.util.ArrayList;

public class ArrayListName {
    public static int getSurvivingIndex(int n, int k) {
        // 군사 배열리스트 생성
        ArrayList<Integer> soldiers = new ArrayList<>();
        // 시체 배열리스트 생성
        ArrayList<Integer> corpse = new ArrayList<>();
        for(int people = 1; people<=n; people++){
            soldiers.add(people);
        }
        
        //5번째 사람 죽이기 반복
        
        while(soldiers.size()>1){
            //자결시키기
            for(int soldiersIndex=1;soldiersIndex<=k-1;soldiersIndex++){
                soldiers.add(soldiers.get(0));
                soldiers.remove(0);
                
            }
            
            //시체 추가하기
            corpse.add(soldiers.get(0));
            soldiers.remove(0);
            n--;
        }
        
        //시체 나열
        for(Integer corpseIndex : corpse){
            System.out.println(corpseIndex + "번 군사가 죽습니다. ");
        }
        
        //김신장군의 살 수 있는 자리 리턴
        return soldiers.get(0);
    }

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}