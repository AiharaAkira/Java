import java.util.Random;

import com.cmw.product.Computer;
import com.cmw.product.Printer;
import com.cmw.product.Scanner;

public class OPMain {

	public static void main(String[] args) {
		// ��ǻ�� : �̸�, ����
		Computer c = new Computer("������", 1000000);
		c.cpu = "i7";
//		c.ram; ��Ű���� �ٸ��� ram�� ���������ڰ� default�� �ȵ�
//		c.hdd; protected ������ ���� ��� ����ϴ��� �� ���ߵ� ����Ŭ������ �ƴ� 
		c.info();
		

		// ������
		Printer p = new Printer("������", 1000000);
		//��ĳ��
		Scanner s = new Scanner("��ĳ��", 1);
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Random r = new Random();
		
		//java.lang�� import�� �ʿ����
		java.lang.String str = new String("ddd");
		
		
	}

}
