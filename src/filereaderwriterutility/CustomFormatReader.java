/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereaderwriterutility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author andre_000
 */
public class CustomFormatReader implements ReadFromFile{

    @Override
    public String readFile(File file) {
    BufferedReader in = null;
    StringBuilder data = new StringBuilder();
    try {
	   in = new BufferedReader(new FileReader(file));
	   String line = in.readLine();
           
	   while(line != null){
                  // this is also naughty to be printing here.
		  data.append(line).append("\n");
		  line = in.readLine();  
	   }
	 
        } catch(IOException ioe) {
            System.out.println("I shouldn't be printing to console that should be some other classes job but there was an issue and that class does not exist yet so.... also you should try catch higher up then here.");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            } 
    }
     return (data.toString());
}
}
