package test.contest;

public class SKKUContest {

	
//	크기 
//	$N$의 
//	$1$차원 양의 정수 배열로 이루어진 자벌레가 있다. 자벌레는 곤충이기 때문에 머리, 가슴, 배로 부위를 구분할 수 있다.
//
//	각 부위는 배열상에서 연속하는 구간으로 나타낼 수 있으며 배열상에서 머리는 왼쪽에, 가슴은 가운데에, 배는 오른쪽에 존재한다. 
//	각 부위의 크기는 배열상에서 해당하는 구간의 값의 합으로 정의된다.
//
//	무지는 이 자벌레가 가슴이 배보다 크고 배가 머리보다 크다는 사실은 알고 있지만 어느 지점에서 머리 가슴 또한 가슴 배가 구분되는지 알지 못한다. 
//	무지를 도와 구분될 수 있는 경우의 수를 구해주자.
//
//	엄밀하게는 다음 조건에 맞는 
//	$X,Y$ 쌍의 개수를 구해주자.
//
//	배열에 
//	$i$번째 원소의 값을 
//	$A_{i}$라 할 때
//	$$ \sum_{i=1}^{X} A_{i} < \sum_{i=Y+1}^{N} A_{i} < \sum_{i=X+1}^{Y} A_{i}\,(1\leq X < Y < N)$$ 
//
//	입력
//	첫 줄에 정수 
//	$N$이 주어진다. 
//	$\left( 3 \leq N \leq 1\,000\,000\right)$ 
//
//	두 번째 줄에 배열의 값 
//	$A_1, A_2, \cdots, A_N$이 공백으로 구분되어 주어진다. 
//	$\left( 1 \leq A_{i} \leq 100\,000\right)$ 
//
//	출력
//	자벌레의 머리 가슴 배가 구분될 수 있는 경우의 수를 구해 출력하자.
	
	public static void main(String[] args) {
		//get the number of pairs(head, breast)
		//breast > stomach, stomach > head
		
		//write int 5-long array, elements are 3, 4, 12, 1, 8 
		int[] longBug = {3, 4, 12, 1, 8};
		
		//if head is composed of element 3, breast may have element 4 and 
		//element 12 or element 4, 12 and 1
		//if head is composed of element 3 and element 4, breast may have either element 12
		//or element 12 and element 1
		
		for(int i = 0; i<longBug.length ; i++) {
			if(longBug[i] >= longBug[i+1] ) {
				break;
			}
		}
	}

}
