package lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayStackDriver {

	public static void main(String[]args ) throws FileNotFoundException {
		 
		//The variables count and tick are used to keep track of the size of the stack
		//so it knows how many iterations to make the for loop
		 Object item;
		 int count = 0;
		 int tick = 0;
		 
		 //Start of file 1
		 File file = new File("C:\\Users\\David\\eclipse-workspace\\csci232\\src\\lab1\\numbers.txt");
		 Scanner inpFile = new Scanner(file);
		 
		 //creates the ArrayStack and RArrayStack
	     ArrayStack as1 = new ArrayStack((int) file.length());
	     RArrayStack ras1 = new RArrayStack(8);
	     
	     //this while loop says that while there are still
	     //more strings in the .txt file, then
	     //it will push them into a stack and raise the counter by 1.
	     while(inpFile.hasNext()){
	        item = inpFile.next();
	        as1.push(item);
	        ras1.push(item);
	        count++;
	     }
	     
	     //the next two for loops go through the same amount of times
	     //as items there are in the stack and pop the item out.
	     //These get printed, from top of stack to the bottom.
	     for(int i = 0; i < count; i++) {
	    	 System.out.print(as1.pop()+" ");
	     }
	     System.out.println();
	     System.out.println();
	     
	     for(int i = 0; i < count; i++) {
	    	 System.out.print(ras1.pop() + " ");
	     }
	     
	     //start of file 2. same code is used as file 1
		 file = new File("C:\\Users\\David\\eclipse-workspace\\csci232\\src\\lab1\\tinyTale.txt");
		 inpFile = new Scanner(file);
		 
	     ArrayStack as2 = new ArrayStack((int) file.length());
	     RArrayStack ras2 = new RArrayStack(8);
	     
	     while(inpFile.hasNext()){
	        item = inpFile.next();
	        as2.push(item);
	        ras2.push(item);
	        
			tick++;
	     }
	     System.out.println();
	     System.out.println();
	     
	     //here, I make it so that if there are many items in the stack, then it
	     //prints out on several lines so it is easier to read.
	     for(int i = 0; i < tick; i++) {
	    	 System.out.print(as2.pop() + " ");
	    	 if((tick > 20) && (i%(tick/3)) == 1) {
	    		 System.out.println();
	    	 }
	     }
	     System.out.println();
	     System.out.println();
	     
	     for(int i = 0; i < tick; i++) {
	    	 System.out.print(ras2.pop() + " ");
	    	 if((tick > 20) && (i%(tick/3)) == 1) {
	    		 System.out.println();
	    	 }
	     }
	 } 

}
