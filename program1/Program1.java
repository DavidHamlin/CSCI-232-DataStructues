package program1;

import StopWatch.StopWatch;
import java.util.Arrays;
import java.util.Random;
import CocktailSort.CocktailSort;
public class Program1 {

public static void main(String[] args) {
		
		Random rand = new Random();
		
		Comparable[]initArray = new Integer[100000];
		Comparable[]bubbleArray = new Comparable[100000];
		Comparable[]cocktailArray = new Comparable[100000];
		Comparable[]radixArray = new Comparable[100000];
	
		for(int i = 0; i<100000; i++ ) { //creates array and copies it to 3 different ones
			initArray[i] = rand.nextInt(500000);
			bubbleArray[i] = initArray[i];
			cocktailArray[i] = initArray[i];
			radixArray[i] = initArray[i];
		}
		
		//this sorts it by BubbleSort
		StopWatch timer2 = new StopWatch();
		BubbleSort.sort(bubbleArray);
		System.out.println("Elapsed time for BubbleSort= " + timer2.elapsedTime());
		
		System.out.println();
	
		//this sorts it by CocktailSort
//		StopWatch timer1 = new StopWatch();
//		CocktailSort.sort( cocktailArray);
//		System.out.println("Elapsed time for CocktailSort = " + timer1.elapsedTime());
		
		System.out.println();
	
		//this sorts it by RadixSort
		StopWatch timer3 = new StopWatch();
		RadixSort.sort(radixArray);
		System.out.println("Elapsed time for RadixSort = " + timer3.elapsedTime());
		
		
		
		//The output is the same for all 3.
		System.out.println(Arrays.toString(bubbleArray));
		System.out.println(Arrays.toString(cocktailArray));
		System.out.println(Arrays.toString(radixArray));
		
	}
}
