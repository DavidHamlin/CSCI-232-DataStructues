package CocktailSort;

import java.util.Comparator;

public class CocktailSort { //see comments on bubble sort for more in depth
	 public static <K> void sort(K[] cocktail, Comparator<K> comp)
	   {
		 //this is basically bubble sort, until we get to the backwards part
	      K temp;
	      int first = 0;
	      int last = cocktail.length;
	      boolean isSorted = false;
	      
	      while(isSorted == false) {
	    	 isSorted = true;
	         for (int i = 0; i < cocktail.length-1; i++ )
	         {
	            if (comp.compare(cocktail[i],  cocktail[i+1]) < 0)
	            {	                    
	               temp = cocktail[i];
	               cocktail[i] = cocktail[i+1];
	               cocktail[i+1] = temp;
	               isSorted = false;
	               
	           
	            }
	         }
	
	         
	         
	         //this part is a backwards version of bubblesort, so it iterates
	         //from the other side so it goes twice as fast
	         for (int i = cocktail.length-1; i > 1; i-- )
	         {
	            if (comp.compare(cocktail[i],  cocktail[i-1]) > 0)
	            {	                    
	               temp = cocktail[i];
	               cocktail[i] = cocktail[i-1];
	               cocktail[i-1] = temp;
	               isSorted = false;
	               
	               
	               
	            }
	         }
	      
	      }
	   }
}