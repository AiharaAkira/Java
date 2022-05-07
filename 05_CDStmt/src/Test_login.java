import java.util.Scanner;

public class Test_login {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//id, pw
		
		System.out.println("id를 입력해주세요:");
		String id = sc.next();
		System.out.println("pw를 입력해주세요:");
		String pw = sc.next();
		
		
		
		//id 실제 존재하는 id pw 임의 생성 -가 데이터
		
		//id- cmw
		//pw- dlajalfdkjfljfa23212
		
//		if(id.equals("cmw") && pw.equals("dlajalfdkjfljfa23212")) {
//			System.out.println("로그인 성공");
//		}else if(id.equals("cmw")) {
//			System.out.println("패스워드 에러");
//		}else if(pw.equals("dlajalfdkjfljfa23212")) {
//			System.out.println("아이디 에러");
//		} 아이디가 틀리면 굳이 패스워드를 판단할 필요가 없음.
		
		if(id.equals("cmw")) {
			
			if(pw.equals("dlajalfdkjfljfa23212")) {
				System.out.println("로그인 성공");
			
			}else {
				System.out.println("패스워드 에러");
			}
		}else {
			System.out.println("아이디 에러");
		}
	}

}
