package sorting;

public class BubbleSort implements SortingAlgorithm {

	@Override
	public void sort(int []arr){
		System.out.println("Sorting with bubble sort algorithm.");
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
