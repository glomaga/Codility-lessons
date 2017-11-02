package codility.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

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

public class smallestNotOccur {
	
	public  static int solution(int[] A) {
		//revisar algoritmos para saber cual es O(N) y poder saber cual no esta dentro de el rango que necesitamos
		int max = 0;

		// Return 1 when array size is zero
		if (A.length == 0) {
			return 1;
		}

		// Use the HashSet to store existence of number in given array 
		HashSet<Integer> positive = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {//take O(n) time on average
			if (A[i] > 0) {
				positive.add(A[i]);
			}
			
			if (A[i] > max) {
				max = A[i];
			}
		}
		

		// Return the minimal positive integer that does not occur in A
		for (int i = 1; i <= max; i++) {//it requires O(n) extra space
			if (positive.contains(i) == false) {
				return i;
			}
		}
		
		return max + 1;
	
	}

	public static void main(String[] args) {
		int A[]= {1, 3, 6, 4, 1, 2};//5
		int B[]= {1,2,3};//4
		int C[]= {-1,-3};//1
		System.out.println(solution(A));
		System.out.println(solution(B));
		System.out.println(solution(C));			
	}

}
