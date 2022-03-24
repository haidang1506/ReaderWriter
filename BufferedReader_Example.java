/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan11_ReaderWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Dell
 */
public class BufferedReader_Example {
    public static void main(String[] args) throws FileNotFoundException {
        char[] array = new char[100];
        try{
            FileReader fr = new FileReader("bufferedWriter.txt");
            BufferedReader br = new BufferedReader(fr);
            
            br.read(array);
            System.out.println("Data in buffered writer file: ");
            System.out.println(array);
            br.close();
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
