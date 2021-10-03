import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractAnimal> animals = new ArrayList<>();
        
        Scanner s = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++) {
        	System.out.println("동물원에 어떤 동물을 키울까요?");
        	String name = s.next();
        	System.out.println(name+"의 울음소리는 어떤가요?");
        	String sound = s.next();
        	
        	//사용자 입력으로 받은 동물 클래스를 만들어 넣기
        	animals.add(new AbstractAnimal(name) {
        		@Override
        		public void cry() {
        			System.out.println(sound);
        		}
        	});
        }
        

        
        
        //익명 클래스
        
        
		
		
        
        for (AbstractAnimal animal : animals) {
            System.out.print(animal.name + "의 울음 소리: ");
            System.out.println(animal.name);
            animal.cry();
        }
    }
}