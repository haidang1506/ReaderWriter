/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan11_ReaderWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author Dell
 */
public class FileWriter_Example {
    public static void main(String[] args) throws IOException {
        String data = "File Writer example";
        try{
            Writer fw = new FileWriter("fileWriterOutput.txt");
            fw.write(data);
            System.out.println("Data is written in file writer output.");
            fw.close();
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
