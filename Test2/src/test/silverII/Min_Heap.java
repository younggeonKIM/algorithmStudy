package test.silverII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 1927
public class Min_Heap {

//	문제
//	널리 잘 알려진 자료구조 중 최소 힙이 있다. 최소 힙을 이용하여 다음과 같은 연산을 지원하는 프로그램을 작성하시오.
//
//	배열에 자연수 x를 넣는다.
//	배열에서 가장 작은 값을 출력하고, 그 값을 배열에서 제거한다.
//	프로그램은 처음에 비어있는 배열에서 시작하게 된다.
//
//	입력
//	첫째 줄에 연산의 개수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 N개의 줄에는 연산에 대한 정보를 나타내는 정수 x가 주어진다. 
//	만약 x가 자연수라면 배열에 x라는 값을 넣는(추가하는) 연산이고, x가 0이라면 배열에서 가장 작은 값을 출력하고 그 값을 배열에서 제거하는 경우이다. 
//	x는 2^31보다 작은 자연수 또는 0이고, 음의 정수는 입력으로 주어지지 않는다.
//
//	출력
//	입력에서 0이 주어진 횟수만큼 답을 출력한다. 만약 배열이 비어 있는 경우인데 가장 작은 값을 출력하라고 한 경우에는 0을 출력하면 된다.
	
/*public static void minHeapify(int[] arr) {
	
	int arrLeng = arr.length;
	
	for(int i = arrLeng/2 - 1 ; i >= 0 ; i-- ) {
		
		minHeapify(arr, arrLeng, i);
	}
}

public static void minHeapify(int[] arr, int arrLength, int root) {
	
	int smallest = root;
	int left = 2*root+1;
	int right = 2*root+2;
	
	if(left < arrLength && arr[left] < arr[smallest]) {
		
		int temp = arr[smallest];
		arr[smallest] = arr[left];
		arr[left]=temp;
	}
	
	if(right < arrLength && arr[right] < arr[smallest]) {
		
		int temp = arr[smallest];
		arr[smallest] = arr[right];
		arr[right]=temp;
	}
	
	
}

public static int[] heapSort(int[] arr) {
	
	minHeapify(arr);
	
	return arr;
}

public static void printArr(int[] arr) {
	
	int result = arr[0];
	if(result == (int)(Math.pow(2, 31))) {
		
		System.out.println(0);
	} else {
		
		System.out.println(result);
	}
}

public static void main(String[] args) {
	
	int N, x, arrIdx=0;
	
	
	Scanner sc = new Scanner(System.in);
	
	
	
	try {
		
		N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			
			arr[i] = (int)(Math.pow(2, 31));
		}
		
		System.out.println();
		
		for(int i = 0 ; i < N ; i++) {
			
			x=sc.nextInt();
			if(x!=0 && x < (int)(Math.pow(2, 31)) && arrIdx < N) {
				
				arr[arrIdx]= x;
				arrIdx++;
			} else {
				
				heapSort(arr);
				
				printArr(arr);
				arr[0]=(int)(Math.pow(2, 31));
				arrIdx=0;
			}
		}
		
	}
	catch(Exception e) {
		
		e.printStackTrace();
	}
	finally {
		
		sc.close();
	}
	
	
}*/

	public static void main(String[] args) throws NumberFormatException, IOException {

		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int input;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		System.out.println();
		for(int i = 0 ; i < N ; i++) {
			
			input = Integer.parseInt(br.readLine()); 
			
			if( input > 0 ) {

				pq.add(input);
			}else {
				
				if( !pq.isEmpty()) {
					
					System.out.println(pq.poll());
				}
				else {
					
					System.out.println(0);
				}
			}
		}
	}
}
