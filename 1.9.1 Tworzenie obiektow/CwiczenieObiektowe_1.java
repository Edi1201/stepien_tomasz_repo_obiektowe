class CwiczenieObiektowe_1{
        static MojeDane md;
        static Logowanie log;
        static Kola k1;
        static Kola k2;
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
        System.out.println("Pole i obwod kola 1:");
        System.out.println(k1.pole_kola());
        System.out.println(k1.obwod_kola());
        k2 = new Kola(20);
        System.out.println("Pole i obwod kola 2:");
        System.out.println(k2.pole_kola());
        System.out.println(k2.obwod_kola());
	}
}