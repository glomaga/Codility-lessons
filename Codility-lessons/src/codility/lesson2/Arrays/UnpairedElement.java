package codility.lesson2.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * A non-empty zero-indexed array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

For example, in array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.
Write a function:

class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

For example, given array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the function should return 7, as explained in the example above.

Assume that:

N is an odd integer within the range [1..1,000,000];
each element of array A is an integer within the range [1..1,000,000,000];
all but one of the values in A occur an even number of times.
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
 * */
public class UnpairedElement {
	public static int solution(int[] A) {
		
	       
	    int r = 0;
	    //xor each value.. odd one will be left
	    for(int i=0;i<A.length;i++) {
	    		r ^=A[i];
	    		System.out.println(r);
	    }
	    return r;
//		
//		if(A.length==1) {
//			return A[0];
//		}
//		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
//		for (int i = 0; i < A.length; i++) {
//			// temp[A[i]]=temp[A[i]]+1;
//			if (hmap.containsKey(A[i])) {
//				hmap.put(A[i], hmap.get(A[i]) + 1);
//			} else {
//				hmap.put(A[i], 1);
//			}
//		}
//		Set set = hmap.entrySet();
//		Iterator iterator = set.iterator();
//		while (iterator.hasNext()) {
//			Map.Entry mentry = (Map.Entry) iterator.next();
//			// System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
//			// System.out.println(mentry.getValue());
//			if ((int) mentry.getValue() == 1) {
//				return (int) mentry.getKey();
//			}
//
//		}
//
//		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 9, 3, 9, 3, 9, 7, 9 };
		System.out.println(solution(a));
	//	int a2[] = { 42 };
	//	System.out.println(solution(a2));
	}

}
