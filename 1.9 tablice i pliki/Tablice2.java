import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.io.*;
class Tablice2{
    public static void main(String args[]){
        try{
            Random r = new Random();
            File f = new File("czylosowac.txt");
            File f2 = new File("ileliczb.txt");
            Scanner sc = new Scanner(f);
            Scanner sc2 = new Scanner(f2);
            String tekst = sc.nextLine();
            String czyLosowac[] = tekst.split(" ");
            String ile[] = new String[czyLosowac.length];
            int i=0;
            int j=0;
            while(sc2.hasNext()){
                ile[i] = sc2.nextLine();
                i++;
            }
            for(i=0;i<czyLosowac.length;i++){
                if(czyLosowac[i].equals("0")){
                    System.out.println("Wczytalem 0 nie losuje");
                }else{
                    for(j=0;j<Integer.parseInt(ile[i]);j++){
                        System.out.print(r.nextInt(79)+1+" ");
                    }
                    System.out.print("\n");
                }
            }
        }catch(FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }  
}