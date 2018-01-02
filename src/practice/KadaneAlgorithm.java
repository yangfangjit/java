package practice;

public class KadaneAlgorithm {

	public static void kadaneAlgorithm(int[] array) {
		if (array.length <= 0) {
			System.out.println("Invalid array");
			return;
		}

		int sum = array[0];
		int i = 0;
		int j = 0;

		int iTemp = 0;
		int jTemp = 0;
		int sumTemp = 0;
		
		while (iTemp < array.length) {
			while (jTemp < array.length && (sumTemp + array[jTemp]) >= 0) {
				sumTemp += array[jTemp];
				if (sum < sumTemp) {
					sum = sumTemp;
					i = iTemp;
					j = jTemp;
				}
				jTemp++;
			}

			iTemp = ++jTemp;
			if (iTemp >= array.length) {
				break;
			}
			
			// 全为负值时，数组中和最大的最长子序列将是数值最大的那个元素
			if (sum < array[iTemp]) {
				sum = array[iTemp];
				i = iTemp;
				j = jTemp;
			}
			
			sumTemp = 0;
		}

		System.out.println((i + 1) + " - " + (j + 1) + " and sum is " + sum);
	}

	public static void main(String[] args) {
		int[] cases = {1, 2, 3};
		kadaneAlgorithm(cases);

		int[] cases2 = {-1, -2, -3, -4};
		kadaneAlgorithm(cases2);

		int[] cases3 = {-4, -3, -2, -1, -2, -3, -4};
		kadaneAlgorithm(cases3);

		int[] cases4 = {-1, 2, -3, 4, 5, 6, 7, -8, -9};
		kadaneAlgorithm(cases4);

		int[] cases5 = {-1, 2, -3, 4, -5, 6, -7, 8, 9};
		kadaneAlgorithm(cases5);
		
		int[] cases6 = {};
		kadaneAlgorithm(cases6);
	}

}
