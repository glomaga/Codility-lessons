package codility.lesson3.TimeComplexity;
/*A non-empty zero-indexed array A consisting of N integers is given. Array A represents numbers on a tape.

Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].

The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|

In other words, it is the absolute difference between the sum of the first part and the sum of the second part.

For example, consider array A such that:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
We can split this tape in four places:

P = 1, difference = |3 − 10| = 7 
P = 2, difference = |4 − 9| = 5 
P = 3, difference = |6 − 7| = 1 
P = 4, difference = |10 − 3| = 7 
Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.

For example, given:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
the function should return 1, as explained above.

Assume that:

N is an integer within the range [2..100,000];
each element of array A is an integer within the range [−1,000..1,000].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
 * 
 * */
public class TapeEquilibrium {
	public static int solution(int[] A) {
		
		 // P1= A[0]-Sumtotal desde 1:
		//P2= parte1 +A[1] - parte2-A[1]
		//p3= parte1 +A[2] - parte2-A[2]
	    int N = A.length;

	    int sum1 = A[0];
	    int sum2 = 0;
	    int P = 1;
	    for (int i = P; i < N; i++) {
	        sum2 += A[i];
	    }
	    int diff = Math.abs(sum1 - sum2);

	    for (; P < N-1; P++) {
	        sum1 += A[P];
	        sum2 -= A[P];

	        int newDiff = Math.abs(sum1 - sum2);
	        if (newDiff < diff) {
	            diff = newDiff;
	        }
	    }
	    return diff;
		
		//50% performance malo
	/*	int n=A.length;
		int minabs=-1;

		for (int p = 1; p < n; p++) {
			int min=0;
			int part1=0;
			int part2=0;
			for (int j = 0; j <= p-1; j++) {
				part1=part1+ A[j];
			}
			for (int j = p; j < n; j++) {
				part2=part2+ A[j];
			}
			System.out.println(part1 + "-" + part2);
			min=Math.abs(part1-part2);
			if(minabs==-1) {
				minabs=min;
			}
			if(min<minabs) {
				minabs=min;
			}
			
		}
		return minabs;*/
	}
	public static void main(String[] args) {
		int a[] = { 3,1,2,4,3};
		System.out.println(solution(a));

	}

}
