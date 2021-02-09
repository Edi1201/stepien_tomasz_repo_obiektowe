import java.util.Scanner;
public class Pola{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String pole = "";
        int bok = 0;
        int bok2 = 0;
        while(pole != "EXIT"){
            System.out.println("Wybierz figure [kwadrat, prostokat, EXIT-wyjscie z programu]: ");
            pole = sc.nextLine();
            if(pole.equals("kwadrat")){
                System.out.print("Podaj bok figury:");
                bok = sc.nextInt();
                for(int i=0;i<bok;i++){
                    for(int j=0;j<bok;j++){
                        System.out.print('*');
                    }
                    System.out.println();
                }
                System.out.println("Pole figury wynosi: "+(bok*bok));
                System.out.println("Obwod wynosi: "+(bok*4));
            }else if(pole.equals("prostokat")){
                System.out.print("Podaj szerokosc figury:");
                bok = sc.nextInt();
                System.out.print("Podaj wysokosc figury:");
                bok2 = sc.nextInt();
                for(int i=0;i<bok2;i++){
                    for(int j=0;j<bok;j++){
                        System.out.print('*');
                    }
                    System.out.println();
                }
                System.out.println("Pole figury wynosi: "+(bok*bok2));
                System.out.println("Obwod wynosi: "+((bok*2)+(bok2*2)));
            }else{
                System.out.println("Nie ma takiej figury, podaj prawidlowa.");
                System.out.println(pole);
            }
        }
    }
}
