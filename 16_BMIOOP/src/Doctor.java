
public class Doctor {
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}
	
	public void act1(Guest g)   {
		//�մ����� ���� �����
		//�˻縦 �Ϸ��� �մ� ���� �ʿ�
		g.act2();
		act3(g);
		act4(g); // ���� �� �ȳ�
		
	}
	
	public void act3(Guest g) {
		//bmi
		if(g.height > 3) {
			g.height /= 100;
		}
		g.bmi = g.weight / (g.height * g.height);
	}
	
	public void act4(Guest g)  {
		try {
			System.out.print("�����.");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".\n");
			
			if(g.bmi >= 25) {
				System.out.println(g.name + "�� �����'��'�Դϴ�");
			}else if(g.bmi >= 23) {
				System.out.println(g.name + "�� �����'��ü��'�Դϴ�");
			}else if(g.bmi >= 18.5) {
				System.out.println(g.name + "�� �����'����'�Դϴ�");
			}else {
				System.out.println(g.name + "�� �����'��ü��'�Դϴ�");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
