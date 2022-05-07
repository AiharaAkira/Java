import java.util.StringTokenizer;


public class UCMain {

	public static void main(String[] args) {

		String s = "안녕";

		String ss = new String("와우 곧 점심");

		// ss의 두번째 글자 출력
		System.out.println(ss.charAt(1));

		// ss의 세븐째 글자 출력
		System.out.println(ss.charAt(2));

		// ss의 전체 글자 수 출력
		System.out.println(ss.length());

		System.out.println("------------------------");
//		ss에서 곧 이라는 글자가 몇 번째에 있나? 3
		System.out.println(ss.indexOf("곧"));
//		ss가 '와'로 시작 하는 가?t
		System.out.println(ss.startsWith("와"));
//		ss가 '음'으로 끝나는가?f
		System.out.println(ss.endsWith("음"));
//		ss가 '심'으로 끝나는가?t
		System.out.println(ss.endsWith("심"));
		System.out.println("------------------------");

		// 곧 -> 이제
		System.out.println(ss.replace("곧", "이제"));
		ss = ss.replace("이제", "곧");
		// 2번째 ~ 4번째
		System.out.println(ss.substring(1, 4));
		
		System.out.println("_________________");
		
		String sss = " 사과, 딸기, 바나나";
		
		//문자열 분리
		String[] sss2 = sss.split(",");
		
		for(String sss3:sss2) {
			System.out.println(sss3);
		}
		
		StringTokenizer st = new StringTokenizer(sss, ",");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(sss, ",");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		//문자열 붙이기
		String s1 = "곧";
		s1 += " 끝";
		s1 += " 나";
		s1 += " 네";
		s1 += " 요";
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer();
		
		String s2 = "곧";
		sb.append(s2);
		sb.append("끝");
		sb.append("나");
		sb.append("네");
		sb.append("요");
		String s3 = sb.toString();
		System.out.println(sb);
		System.out.println(s3);
		
		
		
	}

}
