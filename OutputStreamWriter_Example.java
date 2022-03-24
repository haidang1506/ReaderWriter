/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan11_ReaderWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author Dell
 */
public class OutputStreamWriter_Example {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String data = "Output Stream Writer ";
        try {
            FileOutputStream fos = new FileOutputStream("outputStreamWriter.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            
            osw.write(data);
            osw.close();
        }
        catch (Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
