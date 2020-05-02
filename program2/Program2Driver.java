package program2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/* David Hamlin CSCI 232 Program 2
 * 
 * Code updated in given Binary Search Tree class:
 * Line 42: update values
 * Line 143: checks to see if class ids are the same if the keys dont match up. used for labs
 * Line 443: Breadth First implementation
 * Line 463: Depth First implementation
 */


public class Program2Driver {

    public static void main(String[] args) throws IOException { 
        BinarySearchTree<String, MSUClass> st = new BinarySearchTree<String, MSUClass>();
        //creates a new BST with string as key and MSUClass object as value
        
        BufferedReader csvReader = new BufferedReader(new FileReader("classes_mod.csv"));
        String row;
 
		while ((row = csvReader.readLine()) != null) {
	         
            String[] data = row.split(",");
           //uses FileReader to read in .csv and split into cells. Each row is a string [] called data
            
    //creates the key and value for each row. Key = Time + Place
            						      //Value = Name, ID, Seats, Class Type
            String key = data[14] + "-" + data[15];
            MSUClass val = new MSUClass(data[1], data[0].substring(0, data[0].length() - 4), Integer.parseInt(data[3]), data[13]);
   
           
            if ((st.size() > 1) && (st.floor(key) != st.floor2(key))) throw new RuntimeException("floor() function inconsistent");
                st.put(key, val); //Placing the key value pair into the tree

            }
            
		//Whenever we have a class with multiple sections, the sections are often denoted by the labs.
		//So if there is one lecture and one lab, theres technically only one section. So any classes with
		//more than one section we are removing the lecture as a section
		for (String s : st.keys()) {
        	if(st.get(s).getSections() > 1) {
        		st.get(s).setSections(-1);
        	}
		}
		
		
		//Print Statements :: the String.format methods are used to get the table formatted.
				
//	//Prints out the tree as its placed in by key		
//		System.out.println("Original");
//		System.out.println("----------------------------------------------------------------------------------------------------");
//		System.out.println(String.format("%-11s %-10s %s %15s %35s", "ID", "Sections", "Seats", "Title", "When"));
//		System.out.println("----------------------------------------------------------------------------------------------------");
//        for (String s : st.keys())
//            System.out.println(String.format("%-27s %s",st.get(s).toString(),s));
//        System.out.println("----------------------------------------------------------------------------------------------------");
        
		
	//Prints out the tree by traversing using Breadth First
        System.out.println("Breadth First");
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println(String.format("%-11s %-10s %s %15s %35s", "ID", "Sections", "Seats", "Title", "When"));
		System.out.println("----------------------------------------------------------------------------------------------------");
        for (String s : st.breadthFirst())
            System.out.println(String.format("%-27s %s",st.get(s).toString(),s));
        System.out.println("----------------------------------------------------------------------------------------------------");
     
    //Prints out the tree by traversing using Depth First
        System.out.println("Depth First");
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println(String.format("%-11s %-10s %s %15s %35s", "ID", "Sections", "Seats", "Title", "When"));
		System.out.println("----------------------------------------------------------------------------------------------------");
        for (String s : st.depthFirst())
            System.out.println(String.format("%-27s %s",st.get(s).toString(),s));
        System.out.println("----------------------------------------------------------------------------------------------------");
        
        
    }
}
