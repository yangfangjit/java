package practice;

public class MaximumIndex {

	public static void MaxIndex(int[] arrays) {
		int i = 0;
		int j = 0;
		
		int index = arrays.length - 1;
		while (index > 0) {
			j = i + index;
			while (j < arrays.length) {
				if (arrays[i] <= arrays[j]) {
					System.out.println("maximum indes is " + index + "\nfor the pair(" + arrays[i] + ", " + arrays[j] + ")");
					return;
				}
				i++;
				j = i + index;
			}
			
			i = 0;
			index--;
		}
	}
	
	public static void main(String[] args) {
		int[] cases = {3,5,4,2};
		MaxIndex(cases);
		
		int[] cases2 = {1,10};
		MaxIndex(cases2);
	}

}
