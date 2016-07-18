/*
 * Victoria Law
 * vhlaw@calpoly.edu
 * 3/14/16
 * Project 5 
 */

public class SortTimes1 {

	public static void main(String[] args)
	{
		Integer[] list1 = new Integer[80000];
        Integer[] list2 = new Integer[80000];
        Integer[] list3 = new Integer[80000];
        Integer[] list4 = new Integer[80000];
        
        System.out.println("TEST1: presorted list");
        System.out.println();
        
        long start;
        long end;
        long time1;
        long time2;
        long time3;
        long time4;
        
        int N = 5000;
        
        while(N <= 80000)
        {
        	for(int i = 0; i < N; i++)
        	{
        		list1[i] = i;
        	}
        	
        	for(int i = 0; i < N; i++)
        	{
        		list2[i] = list1[i];
                list3[i] = list1[i];
                list4[i] = list1[i];
        	}
        	
        	//measures the time for selection sort in nanoseconds
        	start = System.nanoTime();
            Sorts.selectionSort(list1, N);
            end = System.nanoTime();
            time1 = (end - start) / 1000000;
            
            //measures the time for bubble sort in nanoseconds
            start = System.nanoTime();
            Sorts.bubbleSort(list2, N);
            end = System.nanoTime();
            time2 = (end - start) / 1000000;

            //measures the time for insertion sort in nanoseconds
            start = System.nanoTime();
            Sorts.insertionSort(list3, N);
            end = System.nanoTime();
            time3 = (end - start) / 1000000;

            //measures the time for merge sort in nanoseconds
            start = System.nanoTime();
            Sorts.mergeSort(list4, N);
            end = System.nanoTime();
            time4 = (end - start) / 1000000;
            
            System.out.println("N = " + N + ": "
            		+ "T_ss = " + time1 + ", "
                    + "T_bs = " + time2 + ", "
                    + "T_is = " + time3 + ", "
                    + "T_ms = " + time4);
            
            N *= 2;
        }
        
        System.out.println();
        System.out.println("END TEST 1");
	}
}
