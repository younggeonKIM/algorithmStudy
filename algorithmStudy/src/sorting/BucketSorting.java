package sorting;

public class BucketSorting {

	public static void main(String[] args) {
		
		int [] data = {8, 2, 1, 5, 9, 7};
		int [][] bucket = new int [10][1];
		
		for(int i = 0 ; i<10 ; i++) {
			
			for( int j = 0 ; j < 1 ; j++) {
				
				bucket[i][j]=-1;
			}
		}
		for(int i = 0 ; i < data.length ; i++) {
			
			bucket[data[i]][0] = 1;
		}
		for(int i = 0; i < 10 ; i++) {
			
			if(bucket[i][0]!=-1) {
				
				System.out.print(i+" ");
			}
		}
	}

}
