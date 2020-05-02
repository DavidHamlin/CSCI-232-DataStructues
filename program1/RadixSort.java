package program1;

import java.util.Arrays;

public class RadixSort { 
  
	//this gets the max number 
    static int max(Comparable[] arr) 
    { 
        int max = 0; 
        for (int i = 0; i < arr.length; i++) 
            if ((int)arr[i] > max) 
                max = (int)arr[i]; //goes through the array and stores the max number
        return max; 
    } 
  
   
    
    static Comparable[] countSort(Comparable arr[], int place) 
    { 
        int newArr[] = new int[arr.length]; 
        int i = 0; 
        int counter; //this is to keep track of how many of each number there are
        int occ[] = new int[10]; //this is our array that keeps track of all the occurances of each number
        Arrays.fill(occ,0); 
        //creates a blank array with 0s. keeps track
        //of the occurances of a number from 0 to 9.
  

        for (i = 0; i < 10; i++) {
        	counter = 0;
            for(int j = 0; j < arr.length; j++) {
            	if((int)arr[j]/place%10 == i) { //the place%10 is what is taking into consideration every 10^n place.
            		counter++; //counts the occurances of each digit
            	}
            }
            occ[i] = counter;
            //sets each index of occ to the number of occurances for that value
        } 
  
        for (i = 1; i < 10; i++) {
            occ[i] += occ[i - 1]; 
        }
        //this for loop goes through occ, and depending on the
        //value there, assigns it to the location of the specific
        //digit in the output file
        
        for (i = arr.length - 1; i >= 0; i--) 
        { 
        	//creating newArr[occurance of value at index i] = value at index [i]
            newArr[occ[((int)arr[i]/place)%10]-1] = (int)arr[i]; 
            //this iterates down one value
            occ[((int)arr[i]/place)%10]--;
        } 
        
        for(int j = 0; j < arr.length; j++) {
        	arr[j] = newArr[j];
        		
        }
        return arr;
        
    }
       
   
    static void sort(Comparable[] array) 
    { 
        // Find the maximum number to know number of digits 
        int max = max(array); 
  
        //calls countsort first in the ones place, then in the tens, 
        //then in the hundreds place, etc. 
        for (int place = 1; max/place > 0; place *= 10) 
            array = countSort(array, place); 
    } 
  
}