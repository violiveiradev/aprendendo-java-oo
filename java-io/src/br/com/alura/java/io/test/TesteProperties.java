package br.com.alura.java.io.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TesteProperties {

    public static void main(String[] args) throws IOException {
        
        Properties props = new Properties();
        props.setProperty("login", "alura");
        props.setProperty("senha", "alurapass");
        props.setProperty("endereco", "www.alura.com.br");

        props.store(new FileWriter("conf.properties"), "criando property");



        Properties props1 = new Properties();
        props1.load(new FileReader("conf.properties"));

        String login = props1.getProperty("login");
        String senha = props1.getProperty("senha");
        String endereco = props1.getProperty("endereco");

        System.out.println(login + ", " + senha + ", " + endereco);
    }
    
}
