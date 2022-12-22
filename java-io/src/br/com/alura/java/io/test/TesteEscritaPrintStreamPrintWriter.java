package br.com.alura.java.io.test;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {

        //PrintStream ps = new PrintStream("lorem2.txt");

        PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

        ps.close();

        System.out.println();
    }
}