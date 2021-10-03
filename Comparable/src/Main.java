import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Person> personList = new ArrayList<>();
		personList.add(new Person("akira", 25));
		personList.add(new Person("aihara", 17));
		personList.add(new Person("yukinoshita", 18));
		personList.add(new Person("yuigahama", 19));
		
		Collections.sort(personList);
		System.out.println(personList);
	}

}
