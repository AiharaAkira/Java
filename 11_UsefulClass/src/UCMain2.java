import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UCMain2 {

	public static void main(String[] args) {
		
		//�ð� / ��¥
		//java.util�� �ִ� ��
		
		Date d = new Date();
		//���� ����
		System.out.println(d);
		
		// Date - > String
		//y M d a h m s
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM�� / dd�� hh : mm");
		System.out.println(sdf.format(d));
		
		String s = sdf.format(d);
		System.out.println(s);
		
		System.out.println("-------------------------");
		
		//test
		
		//sdf2 > �� : �� : ��
		//�ֿܼ� 02 : 10 : 15
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("hh�� : mm�� : ss��");
		String ss = sdf2.format(d);
		System.out.println(ss);
			
		// String -> Date
		String s2 = "01/11-21";
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM-yy");
		
		try {
			Date d2 = sdf3.parse(s2);
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
