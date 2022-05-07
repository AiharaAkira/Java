
public class Doctor {
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}
	
	public void act1(Guest g)   {
		//손님한테 정보 물어보기
		//검사를 하려면 손님 정보 필요
		g.act2();
		act3(g);
		act4(g); // 판정 및 안내
		
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
			System.out.print("계산중.");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".\n");
			
			if(g.bmi >= 25) {
				System.out.println(g.name + "님 당신은'비만'입니다");
			}else if(g.bmi >= 23) {
				System.out.println(g.name + "님 당신은'과체중'입니다");
			}else if(g.bmi >= 18.5) {
				System.out.println(g.name + "님 당신은'정상'입니다");
			}else {
				System.out.println(g.name + "님 당신은'저체중'입니다");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
