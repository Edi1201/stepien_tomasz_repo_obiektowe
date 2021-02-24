import java.util.Scanner;
import java.util.Random;
import java.io.*;
class Tablice2{
    public static void main(String args[]){
        Random r = new Random();
        File f = new File("czylosowac.txt");
        String czyLosowac[] = new String[10];
        try{
            Scanner sc = new Scanner(f);
            int i=0;
            for(i=0;i<10;i++){
                String podzielone[] = sc.next().split(" ");
                czyLosowac[i] = podzielone[i];
                System.out.println(czyLosowac[i]);
            }
            /*String studentsGrades[] = new String[10];
            for (i=0;i<studentsGrades.length;i++){
                studentsGrades[i] = students[i]+" "+grades[i];
                System.out.println(studentsGrades[i]);
            }*/
        }catch(FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }  
}