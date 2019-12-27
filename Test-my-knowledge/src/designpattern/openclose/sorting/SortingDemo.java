package designpattern.openclose.sorting;

import sorting.BubbleSort;
import sorting.HeapSort;
import sorting.InsertionSort;
import sorting.Radix;
import sorting.SelectionSort;
import sorting.ShellSort;
import sorting.SortingAlgorithm;

public class SortingDemo {
	public static void main(String ar[]){
		int []arr={1,9,10,12,34,13,0,100,33};
		SortArrayManager sortManager= new Sorting();
		sortManager.sorting(arr, new BubbleSort());
		sortManager.sorting(arr, new HeapSort());
		sortManager.sorting(arr, new InsertionSort());
		sortManager.sorting(arr, new Radix());
		sortManager.sorting(arr, new SelectionSort());
		sortManager.sorting(arr, new ShellSort());
		SortingDemo.print(arr);
	}
	// A utility function to print an array 
    static void print(int arr[]) { 
        for (int i=0; i<arr.length; i++) 
            System.out.print(arr[i]+" "); 
    } 
}

interface SortArrayManager{
	public void sorting(int inputArray[], SortingAlgorithm sortingAlgorithm);
}

class Sorting implements SortArrayManager{

	@Override
	public void sorting(int[] inputArray, SortingAlgorithm sortingAlgorithm) {
		sortingAlgorithm.sort(inputArray);
	}
	
}
