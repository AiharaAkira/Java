package com.javalec.calex;

import java.util.ArrayList;

public class ArrayListName {
    public static int getSurvivingIndex(int n, int k) {
        // ���� �迭����Ʈ ����
        ArrayList<Integer> soldiers = new ArrayList<>();
        // ��ü �迭����Ʈ ����
        ArrayList<Integer> corpse = new ArrayList<>();
        for(int people = 1; people<=n; people++){
            soldiers.add(people);
        }
        
        //5��° ��� ���̱� �ݺ�
        
        while(soldiers.size()>1){
            //�ڰ��Ű��
            for(int soldiersIndex=1;soldiersIndex<=k-1;soldiersIndex++){
                soldiers.add(soldiers.get(0));
                soldiers.remove(0);
                
            }
            
            //��ü �߰��ϱ�
            corpse.add(soldiers.get(0));
            soldiers.remove(0);
            n--;
        }
        
        //��ü ����
        for(Integer corpseIndex : corpse){
            System.out.println(corpseIndex + "�� ���簡 �׽��ϴ�. ");
        }
        
        //����屺�� �� �� �ִ� �ڸ� ����
        return soldiers.get(0);
    }

    public static void main(String[] args) {
        System.out.println("����� " + getSurvivingIndex(20, 5) + "�� �ڸ��� �������� �˴ϴ�.");
    }
}