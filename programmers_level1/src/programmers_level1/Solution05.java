package programmers_level1;

/*문제 설명
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

제한 사항
n은 1이상, 50000000000000 이하인 양의 정수입니다.
입출력 예
n	return
121	144
3	-1
입출력 예 설명
입출력 예#1
121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.

입출력 예#2
3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.*/

public class Solution05 {

	//테스트 모두 통과 못 함 
	/*
	 * public long solution(long n) { long answer = 0;
	 * 
	 * double x = Math.sqrt(n);
	 * 
	 * if(n == Math.pow(x, 2)) { return (int)Math.pow((x+1), 2); }else { return -1;
	 * }
	 * 
	 * }
	 */
	
	
	
	//두 번째 코드 작성 -> if 문의 조건식을 아래와 같이 변경. x는 double형이므로 제곱근 sqrt로 판별할 수 있도록 함(sqrt는 무조건 양의 정수이므로)
	  public long solution(long n) {
	      Double sqrt = Math.sqrt(n);
	      
	      if(sqrt == sqrt.intValue()){
	          return (long)Math.pow(sqrt + 1, 2);
	      } else return -1;
	  }
		
}
