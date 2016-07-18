/*
 * Victoria Law
 * vhlaw@calpoly.edu
 * 3/14/16
 * Project 5 
 */

public class Sorts {

	// sort the list of 'size' elements contained in the array arr[0...size-1] using selection sort
	public static<T extends Comparable<? super T>> void selectionSort(T[] arr, int size)
	{
		int min;
		for(int i = 0; i < size; i++)
		{
			min = i;
			for(int j = i + 1; j < size; j++)
			{
				if(arr[j].compareTo(arr[min]) < 0)
				{
					min = j;
				}
			}
			T temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	
	// sort the list of 'size' elements contained in the array arr[0...size-1] using bubble sort
	public static<T extends Comparable<? super T>> void bubbleSort(T[] arr, int size)
	{
		boolean sorted = false;
		while(!sorted)
		{
			sorted = true;
			for(int i = 0; i < (size - 1); i++)
			{
				if(arr[i].compareTo(arr[i + 1]) > 0)
				{
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sorted = false;
				}
			}
		}
	}
	
	// sort the list of 'size' elements contained in the array arr[0...size-1] using insertion sort
	public static<T extends Comparable<? super T>> void insertionSort(T[] arr, int size)
	{
		for(int i = 1; i < size; i++)
		{
			T temp = arr[i];
			int j = i;
			while(j != 0 && arr[j - 1].compareTo(temp) > 0)
			{
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}
	
	// sort the list of 'size' elements contained in the array arr[0...size-1] using merge sort
	public static<T extends Comparable<? super T>> void mergeSort(T[] arr, int size)
	{
		mergeSort(arr, 0, size - 1);
	}
	
	//Recursively merge sorts the list.
	private static<T extends Comparable<? super T>> void mergeSort(T[] arr, int leftIndex, int rightIndex)
	{
		if(leftIndex < rightIndex)
		{
			int middleIndex = (leftIndex + rightIndex)/2;
			mergeSort(arr, leftIndex, middleIndex);
			mergeSort(arr, middleIndex + 1, rightIndex);
			merge(arr, leftIndex, middleIndex, rightIndex);
		}
	}
	
	// merge two sorted list into one list.
	private static <T extends Comparable<? super T>> void merge(T[] arr, int leftIndex, int middleIndex, int rightIndex)
	{
		T[] temp = (T[]) new Comparable[rightIndex - leftIndex + 1];
		int i = leftIndex;
		int j = middleIndex + 1;
		int k = 0;
		while(i <= middleIndex && j <= rightIndex)
		{
			if(arr[i].compareTo(arr[j]) < 0)
			{
				temp[k] = arr[i++];
			}
			else
			{
				temp[k] = arr[j++];
			}
			k++;
		}
		if(i <= middleIndex)
		{
			for(; i <= middleIndex; i++)
			{
				temp[k++] = arr[i];
			}
		}
		else
		{
			for(; j <= rightIndex; j++)
			{
				temp[k++] = arr[j];
			}
		}
		for(int x = 0; x < temp.length; x++)
		{
			arr[leftIndex + x] = temp[x];
		}
	}
	
}
