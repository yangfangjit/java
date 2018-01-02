package practice;
public class SumSubarray {

	public static void sumOfSubarray(int[] arrays, int sum) {
		if (sum < 0) {
			System.out.println("-1");
		}
		
		int currentSum = 0;
		int i = 0;
		int j = 0;
		
		int loop = 0;
		
		while (currentSum != sum && j < arrays.length) {
			loop++;

			if (currentSum < sum) {
				currentSum += arrays[j];
				j++;
			}

			if (currentSum > sum && i < j) {
				currentSum -= arrays[i];
				i++;
			}
		}

		System.out.println("循环次数：" + loop);
		
		if (currentSum == sum && j != 0) {
			System.out.println((i + 1) + " " + j);
		} else {
			System.out.println("-1");
		}
	}

	public static void main(String[] args) {
		int[] cases = { 1, 2, 3, 7, 5 };
		sumOfSubarray(cases, 12);
		
		int[] cases2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		sumOfSubarray(cases2, 15);
		
		sumOfSubarray(cases2, 0);
		
		sumOfSubarray(cases2, -1);
		
		sumOfSubarray(cases2, 55);
	}

}