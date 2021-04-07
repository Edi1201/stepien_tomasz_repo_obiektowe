class StepienTomasz{
    public static void main(String[] args){
        Sprawdzian sp = new Sprawdzian();
        System.out.println(sp.data);
        System.out.println(sp.ocena);
        System.out.println(sp.nazwa_przedmiotu);
        Dane dane = new Dane();
        System.out.println(dane.toString());
        Tablica tab1= new Tablica();
        Tablica tab2= new Tablica();
        for(int i=0;i<10;i++){
            if(tab1.tab[i] > tab2.tab[i]){
                System.out.println(tab1.tab[i] + " > " + tab2.tab[i]);
            }else if(tab1.tab[i] < tab2.tab[i]){
                System.out.println(tab1.tab[i] + " < " + tab2.tab[i]);
            }else{
                System.out.println(tab1.tab[i] + " = " + tab2.tab[i]);
            }
        }
    }
}