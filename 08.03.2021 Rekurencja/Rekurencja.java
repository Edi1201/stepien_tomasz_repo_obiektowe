class Rekurencja {
    public static void main(String [] args){
        rekurencja(5);
    }

    private static int rekurencja(int i){
        if(i>0){
            System.out.println("rekurencja "+i);
            i--;
        } else{
            return 0;
        }        
        rekurencja(i);
        return -1;
    }
}