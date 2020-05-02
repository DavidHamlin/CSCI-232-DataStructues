package lab4;
import java.util.Random;

import program1.StopWatch;

public class Lab4 {
	public static void main(String[]args) {
		Random rand = new Random();
		
		Comparable[]initArray = new Comparable[100000];
		Comparable[]mergeArray = new Comparable[100000];
		Comparable[]quickArray = new Comparable[100000];
		
		//creates two identical arrays
		for(int i = 0; i<100000; i++) {
			initArray[i] = rand.nextInt(1000);
			mergeArray[i] = initArray[i];
			quickArray[i] = initArray[i];
			
		}
		//times everything
		
		StopWatch timer1 = new StopWatch();
		QuickSort.sort(quickArray);
		System.out.println("Elapsed time for QuickSort= " + timer1.elapsedTime());
		
		
		StopWatch timer2 = new StopWatch();
		MergeSort.sort(mergeArray);
		System.out.println("Elapsed time for MergeSort= " + timer2.elapsedTime());
	
	}
}
