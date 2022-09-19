package algoPractice;

import java.util.Scanner;

public class Solution01 {
	
	 public int solution(String str, char c) {
		  int answer = 0;
		  
		  str = str.toUpperCase();
		  c = Character.toUpperCase(c);
		  
//		  System.out.println(str);
//		  System.out.println(c);
		  
		  //1. 일반적인 for문 사용
//		  for(int i = 0; i < str.length(); i++) {
//			  if(str.charAt(i) == c) {
//				  answer ++;
//			  }
//		  }
				
		  //2. 향상된 for문 사용
		  for(char x : str.toCharArray()) {
			  if(x == c)answer ++;
		  }
		  
		  return answer;
	  }
	
	  public static void main(String[] args){
		  Solution01 T = new Solution01();
		  Scanner kb = new Scanner(System.in);
		  
		  String str = kb.next();
		  char c = kb.next().charAt(0);
		  
		  System.out.println(T.solution(str, c));
	   
	   
	  }

}
