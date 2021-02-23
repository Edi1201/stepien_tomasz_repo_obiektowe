import java.util.Scanner;
import java.util.Random;
import java.io.*;
public class Tablice{
	public static void main(String args[]){
        Random r = new Random();
        int tab[] = new int[10]; 
        //Wypełnianie tablicy danymi -> pętla FOR
        for (int i=0;i<tab.length;i++){
            tab[i] = r.nextInt(6)+1;
            System.out.println(tab[i]);
        }
    }
}