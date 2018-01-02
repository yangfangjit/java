package collection;

import java.util.List;
import java.util.ArrayList;

public class ListRemove {

	public static void main(String[] args) {
		List<Integer> digits = new ArrayList<>();
		digits.add(0);
		digits.add(1);
		digits.add(2);
		
		for (int i = 0; i < digits.size(); i++) {
			System.out.println("Size of list : " + digits.size());
			digits.remove(i);
		}
		
		for (Integer integer : digits) {
			digits.remove(integer);
		}
	}

}
