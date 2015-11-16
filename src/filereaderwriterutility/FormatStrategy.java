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
public interface FormatStrategy {

    String createRecord(String name, String address, String cityStateZip);
    
}
