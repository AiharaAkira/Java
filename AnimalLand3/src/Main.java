import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractAnimal> animals = new ArrayList<>();
        
        Scanner s = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++) {
        	System.out.println("�������� � ������ Ű����?");
        	String name = s.next();
        	System.out.println(name+"�� �����Ҹ��� �����?");
        	String sound = s.next();
        	
        	//����� �Է����� ���� ���� Ŭ������ ����� �ֱ�
        	animals.add(new AbstractAnimal(name) {
        		@Override
        		public void cry() {
        			System.out.println(sound);
        		}
        	});
        }
        

        
        
        //�͸� Ŭ����
        
        
		
		
        
        for (AbstractAnimal animal : animals) {
            System.out.print(animal.name + "�� ���� �Ҹ�: ");
            System.out.println(animal.name);
            animal.cry();
        }
    }
}