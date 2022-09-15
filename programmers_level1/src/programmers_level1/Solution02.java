package programmers_level1;

public class Solution02 {

	    public int solution(int n) {
	        int answer = 0;
	        
	        String s = Integer.toString(n);
	        
	        for(int i = 0; i < s.length(); i++) {
	        	answer = answer + Integer.parseInt(s.substring(i, i+1));
	        }

	        System.out.println(answer);

	        return answer;
	    }
	}


