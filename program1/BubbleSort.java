package program1;

public class BubbleSort {
	 public static void sort(Comparable[] bubble)
	   {
	      int temp;
	      int end = bubble.length;
	      boolean isSorted = false;
	      
	      while(isSorted == false) {//this while loop checks to see if the array is sorted
	    	 isSorted = true; //we reduce the end of the array because each time through
	         for (int i = 0; i < end-1 ; i ++ ) //the last number is biggest, so we can lower the bounds
	         {
	        	 //this compares the number and the next number, and
	        	 //switches them if the lower one is greater
	            if ((int)bubble[i] > (int)bubble[i+1] )
	            {	                    
	               temp = (int)bubble[i];
	               bubble[i] = bubble[i+1];
	               bubble[i+1] = temp;
	               isSorted = false; //if a switch happens, then it gets sets back to false so
	               						//it goes through again.
	               
	               
                       }
	         }
	         end--; //this reduces the amount of places it
	         //iterates through every time, because by the end, the
	         //biggest number will now be at the end and we dont need
	         //to iterate through it.
	         }
	      }
	   }