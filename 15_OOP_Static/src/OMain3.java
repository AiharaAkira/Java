
public class OMain3 {

	public static void main(String[] args) {

		// 계산기
		// calc에 static 왜 붙일까 ? 객체 안만들고 쓰기 위해서
		// static 부재시, 객체 생성없이 클래스메소드 사용불가
		
		//숫자 2개 넣으면 그 합을 구해주는 기능
		Calculator.add(1, 2);
		//숫자 2개 넣으면 그 차을 구해주는 기능
		Calculator.minous(2, 1);

	}

}
