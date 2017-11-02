package codility.lesson3.TimeComplexity;

import java.util.Arrays;

/*
 * A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }
that, given a zero-indexed array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Assume that:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
 * 
 * 
 * It is possible to solve the problem without sorting the array (which is expensive). 
 * The input array is actually a simple arithmetic sequence 1, 2, 3, 4 ... N+1, 
 * the numbers are just in a jumbled up order and one of them is missing.

The sum of the sequence is easy to calculate as n/2(1+n) (here n = N + 1). 
The sum of the input array will be the same as this, minus the value of the missing element. 
So the value of the missing element is the difference between the sum of the entire sequence and the sum of the input array.
 * 
 * 
 * */
public class PermMissingElem {
	public static int solution(int[] A) {
		long n = A.length + 1;
		long sum = (n * (1 + n)) / 2; //sum of the sequence n/2(1+n) 
		return (int) (sum - Arrays.stream(A).sum());
	}

	public static void main(String[] args) {
		int a[] = { 2, 3, 1, 5 };
		System.out.println(solution(a));

	}

}
