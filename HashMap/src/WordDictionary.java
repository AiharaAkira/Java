import java.util.HashMap;

public class WordDictionary {

	HashMap<String, String> word = new HashMap<String, String>();

	public void addWord(String english, String korean) {
		word.put(english, korean);
	}

	public String find(String english) {
		for(String key : word.keySet()) {
			if(key.toLowerCase().equals(english.toLowerCase())) {
				return word.get(key);
			}
			
			
		}
		return null;
		
		
	}

}
