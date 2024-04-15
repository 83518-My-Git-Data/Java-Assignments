package sortingAlgorithm;

import java.util.Comparator;

public class SelectionSort<T> implements Comparator<T> {

	 public static<T>  void selectionSort(T[] arr, Comparator<T> comparator) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (comparator.compare(arr[i], arr[j])>0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	@Override
	public int compare(T o1, T o2) {
		if (o1 instanceof Integer && o2 instanceof Integer) {
			Integer i1 = (Integer) o1;
			Integer i2 = (Integer) o2;
			return i1 - i2;
			
			
			// return 0;
		}
		return 0;

	}

}
