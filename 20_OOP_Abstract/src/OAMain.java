
public class OAMain {

	public static void main(String[] args) {
		
		//영웅
//		공격기능 void attack(); 은강제
//		영웅이라면 다 공격이 가능해야 한다.
		
		// 슈퍼맨
		SuperMan superMan = new SuperMan("슈퍼맨");
		superMan.attack();
		// 아이언맨
		IronMan ironMan = new IronMan("아이언맨");
		ironMan.attack();
		// 헐크
		Hulk hulk = new Hulk("헐크");
		hulk.attack();
	}

}
