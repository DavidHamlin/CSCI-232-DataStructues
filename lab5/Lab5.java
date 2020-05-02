package lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import CocktailSort.CocktailSort;
import StopWatch.StopWatch; //put these in the folder, but I impomrted them from other
							//packages for the sake of the lab.


public class Lab5 {
	public static void main(String[] args) {
		
		//This will be for manifesto. I created an array list for the data.
		ArrayList<String> wordAL = new ArrayList<>();
		Scanner s;
		
		//if there is no file called manifesto, it returns an error
		try {
			s = new Scanner(new File("manifesto.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found. Please try again.");
			return;
		}
		
		
		//this puts all words into the arraylist wordL
		while (s.hasNext()){
		    wordAL.add(s.next());
		}
		s.close();
		
	//creates a string array, and fills it with array list wordAL.
		String[] manifesto = new String[wordAL.size()];
		manifesto = wordAL.toArray(manifesto);
		
		Comparator<String> comp = Comparator.naturalOrder(); //this creates the comparator
		StopWatch timer1 = new StopWatch(); //creates stopwatch
		CocktailSort.sort(manifesto, comp); //sorts the array
		System.out.println("manifesto.txt: " + manifesto.length + " words. Runtime: " + timer1.elapsedTime());

		
//__________________________________________________________________
		
		//this is now for the reals.txt. Its the same code but with float instead of string.
		ArrayList<Float> numAL = new ArrayList<>();
		Scanner sc;
		
		try {
			sc = new Scanner(new File("reals.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found. Please try again.");
			return;
		}
		while (sc.hasNext()){
		    numAL.add(sc.nextFloat());
		}
		sc.close();
		
	
		Float[] reals = new Float[numAL.size()];
		reals = numAL.toArray(reals);
		Comparator<Float> compar = Comparator.naturalOrder();
		
		StopWatch timer2 = new StopWatch();
		CocktailSort.sort(reals, compar);
		System.out.println("reals.txt: " + reals.length + " words. Elapsed time: " + timer2.elapsedTime());

	}
}
