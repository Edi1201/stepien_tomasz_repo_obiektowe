class CwiczenieObiektowe_1{
        static MojeDane md;
        static Logowanie log;
        static Kola k1;
        static Kola k2;
        static Kwadrat kwadrat;
        static Prostokat prostokat;
    	public static void main (String[] args){
        md = new MojeDane();
        System.out.println(md.imie);
        System.out.println(md.nazwisko);
        System.out.println(md.klasa);
        System.out.println();
        log = new Logowanie();
        System.out.println(log.toString());
        System.out.println();
        k1 = new Kola(4);
        System.out.print("Pole i obwod kola 1: ");
        System.out.print(k1.pole_Kola()+" ");
        System.out.print(k1.obwod_Kola());
        System.out.println();
        k2 = new Kola(20);
        System.out.print("Pole i obwod kola 2: ");
        System.out.print(k2.pole_Kola()+" ");
        System.out.print(k2.obwod_Kola());
        System.out.println();
        kwadrat = new Kwadrat(5);
        System.out.print("Pole i obwod kwadratu: ");
        System.out.print(kwadrat.pole() +" ");
        System.out.print(kwadrat.obwod());
        System.out.println();
        prostokat = new Prostokat(5, 10);
        System.out.print("Pole i obwod prostokata: ");
        System.out.print(prostokat.pole() +" ");
        System.out.print(prostokat.obwod());
        System.out.println();
	}
}