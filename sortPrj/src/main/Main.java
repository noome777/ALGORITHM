package main;

import java.util.Arrays;

public class Main {
	//<알고리즘> : 문제 푸는 방법 (과정)
	

	public static void main(String[] args) {
		
		//버블 정렬 : sort(bubble)
		
		int[] arr = new int[] {10,8,3,5,1,23525,2362431,652464,11354,87,54245,65};
		
		System.out.println(Arrays.toString(arr));
//		bubbleSort(arr);
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	//선택 정렬 : 제일 작은 걸 맨앞에 두고 그것을 반복하는 것
	public static void selectionSort(int [] arr) {
		
		//한바퀴 돌면서 제일 작은 거 찾기(그 숫자의 인덱스 구하기)
		//맨 앞에다가 넣기
		//위 작업을 반복
		
		for(int n = 0; n < arr.length; n++) {
			int minIdx = n;
			for(int i = n ; i < arr.length; ++i) {
				//맨 왼쪽의 인덱스가 더 크다면 맨 앞에 넣기
				if(arr[minIdx] > arr[i] ) {
					//minIdx를 반복문을 돌면서 갱신해주기
					minIdx = i;
					
				}
			}
			
			//minIdx의 인덱스가 갱신 되었으므로, 그 인덱스를 맨 앞에 넣어주기
			int temp = arr[minIdx];
			arr[minIdx] = arr[n];
			arr[n] = temp;
		}
		
		
	}
	
	
	
	//버블 정렬 : 숫자 맨 앞부터 2개씩 비교 (인접한 2개 요소)-> 1,2/2,3/3,4 *** (i번째요소, i+1번째 요소)
	public static void bubbleSort(int [] arr) {
		System.out.println("버블정렬 ~~~");
		
		//만약에 오름차순 정렬일 때 , 왼쪽이 오른쪽보다 더 크면(i번째 요소 > i+1번 요소) 둘이 자리 바꿈
		//위 작업을 반복
		
		//int i = 0 ~ arr.length -2 -> i <= arr.length -2
		
		
		for(int n = 0; n < arr.length-1; n++) {
			for(int i = 0; i < arr.length-1-n; i++) {
				if(arr[i] > arr[i+1]) {
					//자리바꿈
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					
				}
			}
		}
		
		
		
		
	}

}
