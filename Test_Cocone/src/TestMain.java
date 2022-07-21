import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
	public String solution(String sentence) {

		String answer = "";
		String[] array = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "n", "m", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };

		
		Set<String> answers = new HashSet<String>();
		Set<String> notAnswers = new HashSet<String>();

		for (int i = 0; i < sentence.length(); i++) {

			for (int j = 0; j < array.length; j++) {

				if (sentence.toLowerCase().contains(array[j])) {
					notAnswers.add(array[j]);
					
				}

			}

		}
		
		if(notAnswers.size() == array.length) {
			answer = "perfect";
		}else {
			
			for(int i = 0; i < array.length; i++) {
				
				if(!notAnswers.contains(array[i])) {
					answers.add(array[i]);
				}
				
			}
			List<String> sortLists = new ArrayList<String>(answers);
			Collections.sort(sortLists);
			//answer = String.valueOf(sortLists);
			
			
			for (String string : sortLists) {
				
				answer +=string;
				
			}
		}
		

		return answer;
	}
}

public class TestMain {

	public static void main(String[] args) {

		Solution s = new Solution();

		
		System.out.println(s.solution("Let us step into the night and pursue that flighty temptress, adventure"));
		

	}

}
