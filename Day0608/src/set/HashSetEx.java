package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		//set : 중복을 허용안함, 순서가 없음.
		
		Set<String> dog = new HashSet<String>();
		
		dog.add("진돗개");
		dog.add("풍산개");
		dog.add("닥스훈트");
		dog.add("웰시코기");
		
		for (String string : dog) {
			System.out.println(string);
		}
		
		Iterator<String> it = dog.iterator();
		
		
		while(it.hasNext()) {
			
			String str = it.next();
			System.out.println(str);
			
		}
		
		
		
	}
	
}
