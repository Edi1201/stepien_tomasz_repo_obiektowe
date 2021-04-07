class Tablica {
    public int[] tab = new int[10];
   
    public Tablica(){
		for(int i=0;i<10;i++){
            tab[i] = (int)(Math.random()*21-10);
        }
        
    }
}