class Prostokat{
    private int bok = 0;
    private int bok2 = 0;

    public Prostokat(int bok, int bok2){
		this.bok = bok;
        this.bok2 = bok2;
    }
    public int Pole(){
        return bok*bok2;
    }
    public int Obwod(){
        return (bok*2)+(bok2*2);
    }
    
}
