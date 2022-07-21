import java.util.Arrays;
import java.util.Comparator;

class Solution3 {
    
    String t;
    String[] strs;
    int dp[];
    

    Comparator<String> c = new Comparator<String>() { 
        public int compare(String s1, String s2) { 
            return Integer.compare(s2.length(), s1.length()); 
        } 
    };
    
    public int solve(int idx){
        
     
        if(idx == t.length())
            return 0;
        if(dp[idx] != -1)
            return dp[idx];
        
     
        dp[idx] = 20001;
        for(int i=0;i<strs.length;i++){
            
          
            if(idx + strs[i].length() <= t.length()){
                boolean flag = true;
               
                for(int j = 0; j < strs[i].length(); j++) {
                    if(t.charAt(idx + j) != strs[i].charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if(flag) 
                    dp[idx] = Math.min(dp[idx], solve(idx + strs[i].length()) + 1);
            }
        }
        return dp[idx];
    }
    
    public int solution(String[] strs, String t) {
        
        dp = new int[t.length()];
        Arrays.fill(dp, -1);
        Arrays.sort(strs, c);
        this.strs = strs; this.t = t;
        
        int answer = solve(0);
        return answer = (answer <= 20000) ? answer : -1;
    }
}

public class Cocone3 {

	public static void main(String[] args) {

		Solution3 s3 = new Solution3();
		String sary[] = { "a","ba", "na", "n" };

		s3.solution(sary, "banana");

	}

}
