package sorting;

import java.util.LinkedList;
import java.util.Queue;

public class RadixSorting {

	//10진수 기준으로 구현
	private static int BUCKET_NUM = 10;
	
	public static void sort(int[] arr) {
		
		// 10진수 버킷 생성
		Queue<Integer>[] bucket = new LinkedList[BUCKET_NUM];
		for(int i = 0 ; i < BUCKET_NUM ; i++) {
			
			bucket[i]=new LinkedList<>();
		}
		
		int maxLength=maxDigitCount(arr);
		// 각 자리수의 숫자 저장
		int digitNum=0;
		// 배열에 다시 저장할 때 필요한 변수
		int arrIdx=0;
		
		// 자리수만큼 반복
		for(int i = 0 ; i < maxLength ; i++) {
			
			// 데이터의 개수만큼 반복
			for(int j = 0 ; j < arr.length ; j++) {
				
				digitNum = getDigit(arr[j], i);
				
				bucket[digitNum].add(arr[j]);
			}
			
			// 버킷에 들어간 데이터를 순서대로 꺼내 배열에 덮어씌움
			for(int j = 0 ; j <BUCKET_NUM ; j++) {
				
				while(!bucket[j].isEmpty()) {
					
					arr[arrIdx++] = bucket[j].remove();
				}
			}
			arrIdx=0;
			
		}
		
	}
	
	// 숫자 자리수 반환
	// getDigit(123, 0) => 3
	// getDigit(123, 1) => 2
	// getDigit(123, 2) => 1
	private static int getDigit(int num, int index) {
		
		return (int)Math.floor(Math.abs(num) / Math.pow(10, index)) % 10;
	}
	
	// 숫자 자리수 구하기
	// digitCount(10) => 2
	// digitCount(1) => 1
	// digitCount(1000) => 4
	private static int digitCount(int num) {
		
		if(num==0) {
			
			return 1;
		}
		
		// log10을 하면 자리수가 나옴
		// log10(10) => 1
		// log10(100) -> log10(10^2) => 2
		return (int) Math.floor(Math.log10(Math.abs(num)))+1;
	}
	
	// 데이터들 중 가장 큰 자리수 반환
	private static int maxDigitCount(int[] arr) {
		
		int max =0;
		
		for(int i = 0; i <arr.length ; i++) {
			
			max = Math.max(max, digitCount(arr[i]));
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		final int MAX_COUNT = 30;
		int[] arr= new int[MAX_COUNT];
		for(int i = 0 ; i<MAX_COUNT; i++) {
			
			// 0~MAX_COUNT 범위 내의 난수를 생성
			arr[i] = (int)(Math.random()*MAX_COUNT);
		}
		
		System.out.println("정렬 전 데이터");
		for(int i : arr) {
			
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("정렬 후 데이터 (오름차순)");
		int [] radixSortTestArr = arr.clone();
		RadixSorting.sort(radixSortTestArr);
		for(int i : radixSortTestArr) {
			
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
