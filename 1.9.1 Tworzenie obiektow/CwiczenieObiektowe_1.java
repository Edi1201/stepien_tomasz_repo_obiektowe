class CwiczenieObiektowe_1{
        static MojeDane md;
        static Logowanie log;
    	public static void main (String[] args){
        md = new MojeDane();
        System.out.println(md.imie);
        System.out.println(md.nazwisko);
        System.out.println(md.klasa);
        log = new Logowanie();
        System.out.println(log.toString());
	}
}