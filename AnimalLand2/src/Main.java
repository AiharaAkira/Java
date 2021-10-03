import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractAnimal> animals = new ArrayList<>();
        
        animals.add(new Cat("맥스"));
        animals.add(new Dog("심바"));
        animals.add(new Pig("품바"));
        
        
        //익명 클래스
        
        AbstractAnimal horse = new AbstractAnimal("말") {
			
			@Override
			public void cry() {
				System.out.println("히이잉");
			}
		};
		
		horse.cry();
		System.out.println(horse.name);
        
        for (AbstractAnimal animal : animals) {
            System.out.print(animal.name + "의 울음 소리: ");
            animal.cry();
        }
    }
}