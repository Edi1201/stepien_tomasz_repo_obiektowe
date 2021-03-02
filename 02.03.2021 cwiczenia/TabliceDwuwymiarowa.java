class TabliceDwuwymiarowa{
    public static void main(String [] args){
        tablica2x2();
    }
    private static void tablica2x2(){
        int  tab[][] = new int[2][2];
        tab[0][0] = 1;
        tab[0][1] = 2;
        tab[1][0] = 3;
        tab[1][1] = 4;
        for (int i=0;i<tab.length;i++){
            for(int j=0;j<tab[i].length;j++){
                System.out.println(tab[i][j]);
            }
        }
    }
}