/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereaderwriterutility;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author andre_000
 */
public class FileReaderWriterUtility {

    
    public static void main(String[] args) {
        

        // could I creat a factory that looked at the file I'm using and then
        // determined the correct readers and writers to use?
        
        
        // can plug in different writers to handle differences in writing depending on the file type.
        WriteToFile writer = new CustomFormatWriter();
        // can plug in different readers to handle different file types.
        ReadFromFile reader = new CustomFormatReader();
        // can plug in different formaters to handle the way records need to be entered
        FormatStrategy format = new CustomRecordFormatter();
        // can plug in different outputs.
        OutputStrategy out = new ConsoleOutput();
        
        
        
        File fileData = new File(File.separatorChar + "Users" + File.separatorChar + "andre_000" + File.separatorChar 
                + "Desktop" + File.separatorChar + "JavaLab111115" + File.separatorChar + "LabData.txt");
        
        reader.readFile(fileData);
        
        
        try{
        writer.AppendToFile(fileData, (format.createRecord("Jack Torrance", "27500 E Timberline Road" ,"Timberline Lodge, OR 97028" )));
        } catch(IOException e){
            System.out.println(e);
        }
        
        
        out.output(reader.readFile(fileData));
       
        
        
        
    }
    
}
