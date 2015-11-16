/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereaderwriterutility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author andre_000
 */
public class CustomFormatWriter implements WriteToFile{

    @Override
    public void OverWriteFile(File file, String record) throws IOException {
         boolean append = false;
         PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, append)));
         out.println(record);
         out.close();
    }

    @Override
    public void AppendToFile(File file, String record) throws IOException {
        boolean append = true;
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, append)));
        out.println(record);
        out.close();
    }

    
    
}
