package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException{

        //FileWriter fw = new FileWriter("lorem2.txt");
        //BufferedWriter bw = new BufferedWriter(fw);

        BufferedWriter bw = new BufferedWriter(new FileWriter("Lorem2.txt"));

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        //fw.write(System.lineSeparator());
        bw.newLine();
        bw.newLine();
        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

        bw.close();
        
    }
    
}
