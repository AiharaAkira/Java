import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractAnimal> animals = new ArrayList<>();
        
        animals.add(new Cat("�ƽ�"));
        animals.add(new Dog("�ɹ�"));
        animals.add(new Pig("ǰ��"));
        
        
        //�͸� Ŭ����
        
        AbstractAnimal horse = new AbstractAnimal("��") {
			
			@Override
			public void cry() {
				System.out.println("������");
			}
		};
		
		horse.cry();
		System.out.println(horse.name);
        
        for (AbstractAnimal animal : animals) {
            System.out.print(animal.name + "�� ���� �Ҹ�: ");
            animal.cry();
        }
    }
}