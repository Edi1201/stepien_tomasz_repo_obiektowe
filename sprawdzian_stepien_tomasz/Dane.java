public class Dane {
    private String imie = "Tomasz";
    private  String nazwisko = "Stepien";
    private String data_urodzenia = "09.05.2004";

    public Dane(){
		this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_urodzenia = data_urodzenia;
    }
    @Override
    public String toString()
    {
        return imie + " " + nazwisko + " urodzony " + data_urodzenia;
    }
}
