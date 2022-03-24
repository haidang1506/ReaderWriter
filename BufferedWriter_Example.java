/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan11_ReaderWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Dell
 */
public class BufferedWriter_Example {
    public static void main(String[] args) throws IOException {
        String data = "Buffered Writer output";
        try {
            FileWriter fw = new FileWriter("bufferedWriter.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(data);
            System.out.println("Data is written in buffered writer file.");
            bw.close();
        }
        catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
