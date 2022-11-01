package br.com.alura.java.io.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TesteLeitura {
    
    public static void main(String[] args) throws IOException{
        InputStream fis = new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null) {System.out.println(linha); linha = br.readLine();}

        br.close();

    }
}
