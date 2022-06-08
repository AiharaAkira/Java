package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		//set : �ߺ��� ������, ������ ����.
		
		Set<String> dog = new HashSet<String>();
		
		dog.add("������");
		dog.add("ǳ�갳");
		dog.add("�ڽ���Ʈ");
		dog.add("�����ڱ�");
		
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
