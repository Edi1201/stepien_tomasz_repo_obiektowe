import java.util.Scanner;
import java.io.*;
public class Pola{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String ts_pole = "";
        int ts_bok = 0;
        int ts_bok2 = 0;
        System.out.println("Wybierz figure [kwadrat, prostokat, EXIT-wyjscie z programu]: ");
        while(ts_pole != "EXIT"){
            ts_pole = sc.nextLine();
            if(ts_pole.equals("kwadrat")){
                System.out.print("Podaj bok figury:");
                ts_bok = sc.nextInt();
                if(ts_bok<=0) {
                    System.out.println("BLAD: Wprowadzono ujemna lub zerowa wartosc.");
                    return;
                }
                System.out.println("Pole figury wynosi: "+(ts_bok*ts_bok));
                System.out.println("Obwod wynosi: "+(ts_bok*4));
                kwadrat(ts_bok);
                System.out.println(kwadratPokaz(ts_bok));
            }else if(ts_pole.equals("prostokat")){
                System.out.print("Podaj szerokosc figury:");
                ts_bok = sc.nextInt();
                if(ts_bok<=0) {
                    System.out.println("BLAD: Wprowadzono ujemna lub zerowa wartosc.");
                    return;
                }
                System.out.print("Podaj wysokosc figury:");
                ts_bok2 = sc.nextInt();
                if(ts_bok2<=0) {
                    System.out.println("BLAD: Wprowadzono ujemna lub zerową wartosc.");
                    return;
                }
                System.out.println("Pole figury wynosi: "+(ts_bok*ts_bok2));
                System.out.println("Obwod wynosi: "+((ts_bok*2)+(ts_bok2*2)));
                prostokat(ts_bok, ts_bok2);
                System.out.println(prostokatPokaz(ts_bok, ts_bok2));
            }else if(ts_pole.equals("")){
                System.out.println("Wybierz figure [kwadrat, prostokat, EXIT-wyjscie z programu]: ");
            }else if(ts_pole.equals("EXIT")){
                System.exit(0);
            }else{
                System.out.println("Nie ma takiej figury.");
            }
        }
    }
    private static void kwadrat(int ts_bok){
        File f = new File("kwadrat.txt");
        int ts_pole = ts_bok*ts_bok;
        int ts_obwod = ts_bok*4;
        String ts_narysowany = kwadratPokaz(ts_bok);
        try{
            FileWriter fw = new FileWriter(f, true);
            fw.write(ts_bok+"\n"+ts_narysowany+"Pole wynosi: "+ts_pole+" Obwod wynosi: "+ts_obwod+"\n"+"\n"+"\n");
            fw.close();
        }catch(IOException e){
            System.out.println("BLAD: "+e.toString());
        }
    }
    private static void prostokat(int ts_bok, int ts_bok2){
        File f = new File("prostokat.txt");
        int ts_pole = ts_bok*ts_bok2;
        int ts_obwod = (ts_bok*2)+(ts_bok2*2);
        String ts_narysowany = prostokatPokaz(ts_bok, ts_bok2);
        try{
            FileWriter fw = new FileWriter(f, true);
            fw.write(ts_bok+";"+ts_bok2+"\n"+ts_narysowany+"Pole wynosi: "+ts_pole+" Obwod wynosi: "+ts_obwod+"\n"+"\n"+"\n");
            fw.close();
        }catch(IOException e){
            System.out.println("BLAD: "+e.toString());
        }
    }
    private static String kwadratPokaz(int ts_bok){
        String ts_kwadrat = "";
        for(int i=0;i<ts_bok;i++){
            for(int j=0;j<ts_bok;j++){
                ts_kwadrat += "*";
            }
            ts_kwadrat += "\n";
        }
        return ts_kwadrat;
        //System.out.println(ts_kwadrat);
    }
    private static String prostokatPokaz(int ts_bok, int ts_bok2){
        String ts_prostokat = "";
        for(int i=0;i<ts_bok;i++){
            for(int j=0;j<ts_bok;j++){
                ts_prostokat += "*";
            }
            ts_prostokat += "\n";
        }
        return ts_prostokat;
        //System.out.println(ts_prostokat);
    }
}