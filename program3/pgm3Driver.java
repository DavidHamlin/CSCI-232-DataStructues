package program3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

/* README**** 
 * I used the graph implementation in our book that used a Set and a String table
 * to pass through our data.
 * 
 * Code modified in Graph:
 * 
 * Lines 131-139- 
 * used polymorphism to create a new addVertex method
 * so I could pass a hash table with the profs name through
 * 
 * Lines 197-201
 * modified toString to account for profs who only teach one class
 * 
 */


public class pgm3Driver {
	 public static void main(String[] args) throws IOException { 

		 	Graph classes = new Graph();
	        BufferedReader csvReader = new BufferedReader(new FileReader("classes_mod.csv"));
	        String row;
	        String key;
	    	Map<String, MSUclass> hash = new Hashtable<>(); 
	    	//This hash table will hold the class id as the key. 
	    	//we will use this to determine if we need to add an edge between
	    	//vertices by comparing the prof names
	    	
			while ((row = csvReader.readLine()) != null) {
		         
	            String[] data = row.split(",");
	            
	            //differentiates the seminars, because CSCI 494 is 3 separate classes
	            if(!data[13].equals("Seminar")) {
	            	key = data[0].substring(0, data[0].length() - 4);
	            }
	            else {
	            	key = data[0];
	            }
	           
	            //creates the object MSUclass with all the important class info
	            MSUclass val = new MSUclass(data[1], key, data[6].substring(1, data[6].length()));
	             
	            hash.put(key, val); //puts the class ID and the object in the hash table so we can 
	            					//compare it to other class IDs later
	            classes.addVertex(val.getID(), hash);
	            					//adds the class ID as a vertex in the graph.
	            					//sends the hash table through so we can compare
	            					//if we need to add an edge
			}
	           
			System.out.println(classes.toString(hash));
			
			
			
	 }
}
