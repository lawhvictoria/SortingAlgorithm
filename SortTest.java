/*
 * Victoria Law
 * vhlaw@calpoly.edu
 * 3/14/16
 * Project 5 
 */

import java.util.Arrays;
import java.util.Scanner;

public class SortTest {

	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the size of the list that needs to be sorted: ");
		int size = scan.nextInt(); //stores the size of the list.
		
		Integer[] arr = new Integer[size * 2]; //creates a new array that is double the size
		
		System.out.println("Please Enter " + size + " integers separated by a white space: "); //takes in the numbers that are in the list.
		for(int i = 0; i < size; i++) //puts each number into the array
		{
			if(scan.hasNextInt())
			{
				arr[i] = scan.nextInt();
			}
			else
			{
				scan.next();
			}
		}
		
		boolean cont = true;
		
		System.out.println("Menu Choice\n"
                + "a - Test ALL sorting algorithms\n"
                + "s - Sort by Selection Sort\n"
                + "b - Sort by Bubble Sort\n"
                + "i - Sort by Insertion Sort\n"
                + "m - Sort by Merge Sort\n"
                + "p - Print the list of integers you inputted\n"
                + "e - exit\n");
		
		while(cont)
		{
			System.out.println("Please enter a menu choice: ");
			String ans = scan.next();
			
			switch(ans)
			{
			case "a":
				Integer[] all = Arrays.copyOf(arr, arr.length);
                Sorts.selectionSort(all, size);
                System.out.println("Selection Sort : " + Arrays.deepToString(all));
                all = Arrays.copyOf(arr, arr.length);
                Sorts.bubbleSort(all, size);
                System.out.println("Bubble Sort :    " + Arrays.deepToString(all));
                all = Arrays.copyOf(arr, arr.length);
                Sorts.insertionSort(all, size);
                System.out.println("Insertion Sort : " + Arrays.deepToString(all));
                all = Arrays.copyOf(arr, arr.length);
                Sorts.mergeSort(all, size);
                System.out.println("Merge Sort :     " + Arrays.deepToString(all));
				break;
				
			case "s":
				Integer[] temp = Arrays.copyOf(arr, arr.length);
                Sorts.selectionSort(temp, size);
                System.out.println("Selection Sort: ");
                System.out.println("The sorted array is: " + Arrays.deepToString(temp));
                break;
				
			case "b":
				Integer[] temp1 = Arrays.copyOf(arr, arr.length);
                Sorts.bubbleSort(temp1, size);
                System.out.println("Bubble Sort: ");
                System.out.println("The sorted array is: " + Arrays.deepToString(temp1));
                break;
				
			case "i":
				Integer[] temp2 = Arrays.copyOf(arr, arr.length);
                Sorts.insertionSort(temp2, size);
                System.out.println("Insertion Sort: ");
                System.out.println("The sorted array is: " + Arrays.deepToString(temp2));
                break;
				
			case "m":
				Integer[] temp3 = Arrays.copyOf(arr, arr.length);
                Sorts.mergeSort(temp3, size);
                System.out.println("Merge Sort: ");
                System.out.println("The sorted array is: " + Arrays.deepToString(temp3));
                break;
				
			case "p":
				Integer[] temp4 = Arrays.copyOf(arr, arr.length);
                System.out.println("The unsorted array is: " + Arrays.deepToString(temp4));
                break;
                
			case "e":
				cont = false;
				break;
				
			default:
				System.out.println("Invalid Choice!");
				break;
			}
		}
	}
}
