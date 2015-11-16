/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereaderwriterutility;

/**
 *
 * @author andre_000
 */
public class CustomRecordFormatter implements FormatStrategy {
    
    
    @Override
    public String createRecord(String name, String address, String cityStateZip){
        StringBuilder record = new StringBuilder("" + "\n");
        record.append(name).append("\n");
        record.append(address).append("\n");
        record.append(cityStateZip);
        return (record.toString());
       
    }
    
    
}
