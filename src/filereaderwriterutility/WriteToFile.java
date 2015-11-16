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
public interface WriteToFile {
   
    
    public abstract void OverWriteFile(File file, String record) throws IOException;
    
    public abstract void AppendToFile(File file, String record)throws IOException;
    
    
}
