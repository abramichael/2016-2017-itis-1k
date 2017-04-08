import java.util.*;

public class Main {

	public static boolean checkSort(Integer [] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i -1])
				return false;
		}
		return true;
	}

	public static void main(String [] args) {

		Integer [] a = new Integer[]{1,6,3,7,8,3,9,2,3,1};
		int k = 0;
		while (!checkSort(a)) {
			k += 1;
			List<Integer> lst = Arrays.asList(a);
			Collections.shuffle(lst);
			a = (Integer []) lst.toArray();
		}
		System.out.println(Arrays.toString(a) + "| times: " + k);

	}


}