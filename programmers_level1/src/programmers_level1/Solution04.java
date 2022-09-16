package programmers_level1;

import java.lang.reflect.Array;
import java.util.Arrays;

/*문제 설명
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

제한사항
arr은 길이 1 이상, 100 이하인 배열입니다.
arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
입출력 예
arr	return
[1,2,3,4]	2.5
[5,5]	5*/

public class Solution04 {
	public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	sum += arr[i];
        }
        
        answer = (double)sum / arr.length;
        
        return answer;
    }

}



	//효율적인 풀이방법
//public class Solution04 {
//	
//	public int getMean(int[] array) {
//		return (int)Arrays.stream(array).average().orElse(0);
//	}
//	
//	  public static void main(String[] args) {
//	        int x[] = {5, 4, 3};
//	        Solution04 getMean = new Solution04();
//	        // 아래는 테스트로 출력해 보기 위한 코드입니다.
//	        System.out.println("평균값 : " + getMean.getMean(x));
//	    }
//}
