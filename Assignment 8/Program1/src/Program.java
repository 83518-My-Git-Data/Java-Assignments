package sortingAlgorithm;

import java.util.Comparator;

public class Program {

	public static void main(String[] args) {
	

		Integer arr[] = {5,3,8,9,6};
		System.out.println("Before Sorting: ");
		
		for (Integer ele : arr) {
			System.out.println("Element: " + ele);
		}
		
		Comparator<Integer> c = new SelectionSort<>();
		SelectionSort.selectionSort(arr, c);

		System.out.println("After Sorting: ");
		for (Integer ele : arr) {
			System.out.println("Element: " + ele);
		}
//		Double arr1[] = {5.3,3.5,8.2,9.5,6.2};
//		SelectionSort.selectionSort(arr1,c);

	}

}
