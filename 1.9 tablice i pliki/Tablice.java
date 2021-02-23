import java.util.Scanner;
import java.util.Random;
import java.io.*;
class Tablice{
	public static void main(String args[]){
        Random r = new Random();
        int grades[] = new int[10];
        for (int i=0;i<grades.length;i++){
            grades[i] = r.nextInt(6)+1;
            System.out.println(grades[i]);
        }
        String students[] = new String[10];

        File f = new File("uczniowie.txt");
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                int i=0;

                students[i] = sc.nextLine()+"\n";
                System.out.println(students[i]);
                i++;
            }
        }catch(FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }  
}