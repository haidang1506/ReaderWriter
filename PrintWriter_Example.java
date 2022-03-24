/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan11_ReaderWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Dell
 */
public class PrintWriter_Example {
    public static void main(String[] args) throws FileNotFoundException {
        String data = "This is Print Writer example.";
        try {
            PrintWriter pw = new PrintWriter("printWriter.txt");
            pw.print(data);
            pw.println();
            pw.printf("This is line number %d", 2);
            System.out.println("Error of printing: "+pw.checkError());
            System.out.println("Data is written in print writer file");
            pw.close();
        }
        catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
