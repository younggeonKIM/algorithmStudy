package searching;

public class StringSearching {
	
	public static int stringSearch(String basicStr, String targetStr) {
		
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
		
		String basicStr = new String("askdjfappleajdsoifnv");
		String targetStr = new String("apple");
		
		
		int discoveredIdx = stringSearch(basicStr, targetStr);
		System.out.print(discoveredIdx);
	}
}
