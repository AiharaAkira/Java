import java.util.Scanner;

public class BMIMain {

	public static void main(String[] args) throws InterruptedException {
		
		// BMI (ü���� ���� ) ���α׷�
		// 1. �̸�, Ű, ü��
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� :");
		String name = sc.next();
		System.out.print("Ű :");
		double height = sc.nextDouble();
		
		
		
		System.out.print("ü�� :");
		double kg = sc.nextDouble();
		
		if( height > 10) {
			height /= 100; 
		}
		
		//2. ����
		double bmiCalculator = (kg / (height * height));
		
		System.out.printf("BMI ���� : %.2f\n", bmiCalculator);
		//3. ����
		
		System.out.print("�����.");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".\n");
		
		if(bmiCalculator >= 25) {
			System.out.println(name + "�� �����'��'�Դϴ�");
		}else if(bmiCalculator >= 23) {
			System.out.println(name + "�� �����'��ü��'�Դϴ�");
		}else if(bmiCalculator >= 18.5) {
			System.out.println(name + "�� �����'����'�Դϴ�");
		}else {
			System.out.println(name + "�� �����'��ü��'�Դϴ�");
		}
		
		

		//4. ���: BMI ���� : 10.14
		//000�� ����� '�Դϴ�' >> 5. Ȯ��
		
		//6������ CMD ����
		
		sc.next();
		

	}

}
