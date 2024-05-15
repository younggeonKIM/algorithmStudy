package searching;

import java.util.Scanner;

public class StringSearching {
	
	public int stringSearch(String basicStr, String targetStr) {
		
		int discoveredIdx = 0;
		while(discoveredIdx + targetStr.length() < basicStr.length()) {
			
			// 3 step
			int targetStrIdx =0;
			
			while(targetStrIdx < targetStr.length()) { // 4 step
				
				// 5 step
				if(basicStr.charAt(discoveredIdx) != targetStr.charAt(targetStrIdx)) {
					
					break;						
				} else {
					
					discoveredIdx++;
					targetStrIdx++;
				}
			}
			// 6 step
			if(targetStrIdx == targetStr.length()) {
				
				discoveredIdx= discoveredIdx - targetStrIdx;
				break;
			} else if (targetStrIdx > targetStr.length()) {
				
				discoveredIdx = discoveredIdx - targetStrIdx +1;
			}
		}
		
		// 7 step
		discoveredIdx = -1;
		return discoveredIdx;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String basicStr = sc.nextLine();
		String targetStr = sc.nextLine();
		
		StringSearching ss = new StringSearching();
		int discoveredIdx = ss.stringSearch(basicStr, targetStr);
		
		System.out.print("검색 대상 문자열 검색된 위치 : ");
		if(discoveredIdx == -1) {
			
			System.out.print("검색되지 않았습니다. ");
		} else {
			
			System.out.print(discoveredIdx);
		}
	}
}
