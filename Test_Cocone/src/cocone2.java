class Sol {

	boolean isNumeric(String s) {

		if (s == null || s.equals("")) {
			return true;
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c < '0' || c > '9') {
				return true;
			}
		}

		return false;

	}

	String solution(String a, String b) {

		if (isNumeric(a)) {
			return "Not Number";
		}

		if (isNumeric(b)) {
			return "Not Number";
		}
		
		Long newA = Long.parseLong(a);
		Long newB = Long.parseLong(b);

		
		
		String answer = newA+" + "+newB+" = "+String.valueOf(newA+newB)+"です。";
		return answer;
	}

}

public class cocone2 {

	public static void main(String[] args) {

		Sol s = new Sol();
		
		System.out.println(s.solution("1", "2"));
		
	}

}
