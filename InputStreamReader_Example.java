/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan11_ReaderWriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Dell
 */
public class InputStreamReader_Example {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        char[] arr = new char[100];
        try{
            FileInputStream fis = new FileInputStream("outputStreamWriter.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            
            isr.read(arr);
            System.out.println("Data in file: ");
            System.out.println(arr);
            isr.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
