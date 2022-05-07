
public class Practice02 {

	public static void main(String[] args) {
		Animal dog = new Animal();
		
		//필드에 직접 접근하지 못하게 막기
		
		//강아지 100 살 이하

		dog.setType("강아지");
		dog.setAge(8);
		
		dog.move();

		Animal cat = new Animal();

		cat.setType("고양이");
		cat.setAge(13);
		
		cat.move();
		
		System.out.println(dog.getType()+"는 "+dog.getAge() + "개월");
		System.out.println(cat.getType()+"는 "+cat.getAge() + "개월");

		
	}

}
