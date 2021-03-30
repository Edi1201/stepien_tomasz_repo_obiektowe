class Kwadrat{
    private int bok = 0;

    public Kwadrat(int bok){
		this.bok = bok;
    }
    public int pole(){
        return bok*bok;
    }
    public int obwod(){
        return bok*4;
    }
    
}
