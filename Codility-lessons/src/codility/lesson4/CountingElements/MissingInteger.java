package codility.lesson4.CountingElements;
/*
 * Write a function:

class Solution { public int solution(int[] A); }
that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
 * */
public class MissingInteger {
	public static int solution(int[] A) {
		//bucket con todos los numeros desde 0 hasta 100,000
		
		int temp[]= new int[100000];
		for (int i = 0; i < A.length; i++) {
			//System.out.println(A[i]);
			if(A[i]>0 && A[i]<temp.length) {
				temp[A[i]]=1;
			}
		}	
		for (int j = 1; j < temp.length; j++) { // no cuenta la posicion 0 pues es greater than 0
			if(temp[j]==0) {
				return j;
			}
		}
			
		
		return 100001;
	}
	public static void main(String[] args) {
		int a[] = { 1, 3, 6, 4, 1, 2 };
		System.out.println(solution(a));
	}

}
