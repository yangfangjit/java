package practice;

public class QuickSort {

	public static void sort(int[] a, int start, int end) {
		if (start < end) {
			int pivotIndex = partition(a, start, end);
			sort(a, start, pivotIndex - 1);
			sort(a, pivotIndex + 1, end);
		}
	}
	
	private static int partition(int[] a,int start, int end) {
		int i = start;
		int j = end;
		int pivot = a[start]; // set first element as pivot default
		while(i < j) {
			while(i < j && a[j] >= pivot) {
				j--;
			}
			if (a[i] > a[j]) {
				swap(a, i, j);
				i++;
			}
			
			while(i < j && a[i] <= pivot) {
				i++;
			}
			if (a[i] > a[j]) {
				swap(a, i, j);
				j--;
			}
		}
		return i;
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] a = {1,3,2,9,0,4,6,5,7,8};
		System.out.println("quick sort start......");
		QuickSort.sort(a, 0, a.length - 1);
		for (int element : a) {
			System.out.print(element + " ");
		}
		System.out.println("\nquick sort end.");
	}

}
