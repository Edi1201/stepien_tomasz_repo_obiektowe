import java.util.Scanner;
import java.util.Random;
import java.io.*;
class Tablice2{
    public static void main(String args[]){
        try{
            Random r = new Random();
            File f = new File("czylosowac.txt");
            Scanner sc = new Scanner(f);
            int i=0;
            String tekst = sc.nextLine();
            System.out.println(tekst);
            String czyLosowac[] = tekst.split(" ");
            for(i=0;i<10;i++){
                System.out.println(czyLosowac[i]);
            }
        }catch(FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }  
}