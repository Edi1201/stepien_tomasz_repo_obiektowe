class Kola {
    private Float liczba_pi = 3.1415f;
    private int promien_kola = 0;

    public Kola(int promien_kola){
		this.promien_kola = promien_kola;
    }
    public String pole_kola(){
        return ""+liczba_pi*(promien_kola*promien_kola);
    }
    public String obwod_kola(){
        return ""+2*liczba_pi*promien_kola;
	}
}
