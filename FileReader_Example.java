/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan11_ReaderWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Dell
 */
public class FileReader_Example {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Reader su dung char de doc file
        char[] array = new char[100];
        try {
            FileReader fr = new FileReader("fileWriterOutput.txt");
            fr.read(array);
            System.out.println("Data in fileWriter: ");
            System.out.println(array);
            fr.close();
        }
        catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
