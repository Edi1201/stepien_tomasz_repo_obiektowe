class Prostokat{
    private int bok = 0;
    private int bok2 = 0;

    public Prostokat(int bok, int bok2){
		this.bok = bok;
        this.bok2 = bok2;
    }
    public int pole(){
        return bok*bok2;
    }
    public int obwod(){
        return (bok*2)+(bok2*2);
    }
    
}
