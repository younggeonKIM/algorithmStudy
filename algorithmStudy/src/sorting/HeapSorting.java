package sorting;

public class HeapSorting {

	/*public static int[] heapSort(int[] arr, int root, int leaf) {
		
		int max = arr[root], temp, T=root+1;
		if(2*(T)<=leaf) {
			
			arr= heapSort(arr, T, leaf);
		}
		
		if(2*(T)+1 > leaf && 2*(T) == leaf) {
			
			if(arr[2*(T)] > max) {
				
				max=arr[2*(T)];
				temp = arr[root];
				arr[root]=arr[2*(T)];
				arr[2*(T)]=temp;
			}
			
			
		}
		else {
			
			if(arr[2*(T)] > max && T < 30) {
				
				max=arr[2*(T)];
				temp = arr[root];
				arr[root]=arr[2*(T)];
				arr[2*(T)]=temp;
			}
			else if(arr[2*(T)+1] > max) {
				
				max=arr[2*(T)+1];
				temp = arr[root];
				arr[root]=arr[2*(T)+1];
				arr[2*(T)+1]=temp;
			}
			
		}
		
		
		
		temp = arr[leaf];
		arr[leaf]=arr[root];
		arr[root]=temp;
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		int [] arr = new int [30];
		for(int i = 0 ; i < arr.length; i ++) {
			
			arr[i] = (int)(Math.random()*100);
		}
		
		System.out.println("정렬 전 데이터 배열 : ");
		for(int i = 0 ; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		heapSort(arr, 0, arr.length-1);
		System.out.println("정렬 후 데이터 배열 : ");
		for(int i = 0 ; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
	}*/
	// Java program for implementation of Heap Sort

	
	    public void sort(int arr[])
	    {
	        int N = arr.length;

	        // Build heap (rearrange array)
	        for (int i = N / 2 - 1; i >= 0; i--)
	            heapify(arr, N, i);

	        // One by one extract an element from heap
	        for (int i = N - 1; i > 0; i--) {
	            // Move current root to end
	            int temp = arr[0];
	            arr[0] = arr[i];
	            arr[i] = temp;

	            // call max heapify on the reduced heap
	            heapify(arr, i, 0);
	        }
	    }

	    // To heapify a subtree rooted with node i which is
	    // an index in arr[]. n is size of heap
	    void heapify(int arr[], int N, int i)
	    {
	        int largest = i; // Initialize largest as root
	        int l = 2 * i + 1; // left = 2*i + 1
	        int r = 2 * i + 2; // right = 2*i + 2

	        // If left child is larger than root
	        if (l < N && arr[l] > arr[largest])
	            largest = l;

	        // If right child is larger than largest so far
	        if (r < N && arr[r] > arr[largest])
	            largest = r;

	        // If largest is not root
	        if (largest != i) {
	            int swap = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = swap;

	            // Recursively heapify the affected sub-tree
	            heapify(arr, N, largest);
	        }
	    }

	    /* A utility function to print array of size n */
	    static void printArray(int arr[])
	    {
	        int N = arr.length;

	        for (int i = 0; i < N; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }

	    // Driver's code
	    public static void main(String args[])
	    {
	    	int [] arr = new int [30];
			for(int i = 0 ; i < arr.length; i ++) {
				
				arr[i] = (int)(Math.random()*100);
			}

			System.out.println("Before sorting the array, the array is");
			printArray(arr);
	        // Function call
	        HeapSorting ob = new HeapSorting();
	        ob.sort(arr);

	        System.out.println("Sorted array is");
	        printArray(arr);
	    }
	}


