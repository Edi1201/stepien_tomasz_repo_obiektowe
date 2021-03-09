class Rekurencja2{
    public static void main(String[] args){
        int liczba = sumaKolejnychLiczb(3);
        System.out.println("Wynik: "+liczba);
        //liczba = obliczanieSilni(943333);
        //System.out.println("Silnia: "+liczba);
        String tekst = wyswietlanieWyrazu("Anna");
        System.out.println(tekst);

    }

    private static int sumaKolejnychLiczb(int liczba){
        if(liczba>0){
            return liczba+sumaKolejnychLiczb(liczba-1);
        }
        return 0;
    }

    private static int obliczanieSilni(int liczba){
        if(liczba>1){
            return liczba*obliczanieSilni(liczba-1);
        }
        return 1;
    }
    private static String wyswietlanieWyrazu(String wyraz){
        if(wyraz.length()>0){
            return wyraz + "\n" + wyraz.substring(0, wyraz.length()-1);
        }
        return "";
    }



}