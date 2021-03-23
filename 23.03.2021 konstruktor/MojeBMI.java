class MojeBMI {
    private  int wzrost = 0;
    private int waga = 0;
    
    public MojeBMI(int wzrost, int waga){
        System.out.println(wzrost+" "+waga);
        this.wzrost = wzrost;
        this.waga = waga;
    }
    public double mojeBMI(){
        return waga/((double)wzrost/100*(double)wzrost/100);
    }
}
