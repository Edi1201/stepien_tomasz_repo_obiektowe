class PierwszyObiekt {
    public static void main (String [] args){
        //zdefiniowanie i stworzenie obiektu
        ObiektPudelko op = new ObiektPudelko();
        System.out.println("Domyslna wartosc: "+op.wysokosc);

        op.wysokosc = 100;
        System.out.println("Po zmodyfikowaniu: "+op.wysokosc);
        Osoba os = new Osoba();
        System.out.println(os.imie+" "+os.nazwisko);
    }
}