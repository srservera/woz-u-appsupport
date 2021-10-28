package com.sierra.handson6;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader; 

public class HandsOn {

	public static void main(String[] args) {
		// this program will include 
		// comma separated values
		// string builder
		// file etiquette
		// error handling 
		String songs[] = {"Rock With You", "Smooth Criminal", "Wanna Be Startin' Something"
				, "Thriller", "Beat It"};
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < songs.length; i++)
		{
			sb.append(songs[i]);
			sb.append(", ");
		}
		System.out.println(sb);
		}
		
    BufferedReader reader;
	FileWriter writer;
	String fileContentsRead = " "; {
	
	    try 
	    {
	    	writer = new FileWriter("songs.txt");
	    	
	    	writer.close();
	    	
	    	reader = new BufferedReader(new FileReader("songs.txt"));
	    	String line;
	        while ((line = reader.readLine()) != null) {
	            fileContentsRead = fileContentsRead + line;
	        }
	    		reader.close();	
	    } 
	    
	    catch(Exception e) 
	    
	    {
	    	System.out.println("Error when writing songs.txt.");
	    	e.printStackTrace();
	    }
	    
	    finally 
	    
	    {
	    	System.out.println(fileContentsRead);
	 
	    }
}
}
	   


