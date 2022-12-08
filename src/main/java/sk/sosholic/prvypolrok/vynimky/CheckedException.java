package sk.sosholic.prvypolrok.vynimky;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.sql.SQLException;

public class CheckedException {
    public static void main(String[] args) {

    }


    public static void nacitatSubor(){
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("Text.txt"));
        }catch (FileNotFoundException ex){
            System.out.println("Súbor nenájdený, zadaj správnu cestu súboru");
        }
        try {
            bufferedReader.readLine();
        }catch (IOException ex){
            System.out.println("Nejaka chyba");
        }

    }
    public static void uloha(){
        SQLException sqlException = new SQLException("Nejaka sql chyba");
        try {
            throw sqlException;
        }catch (SQLException ex){
            System.out.println("Chyba");
        }
    }
    public static void uloha2(){
        URL url = null;
        try {
            url = new URL("http://localhost");
        }catch (MalformedURLException ex){
            System.out.println("Chyba");
        }
        try {
            URLConnection connection = url.openConnection();
            connection.connect();
        }catch (IOException ex){
            System.out.println("chyba");
        }

    }



}
