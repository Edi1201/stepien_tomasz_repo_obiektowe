class PierwszyKonstruktor {
    public static void main(String args[]){
        /*MojeBMI mb = new MojeBMI(190, 86);
        mb.wzrost = 160;
        mb.waga = 80;*/
        MojeBMI mb = new MojeBMI(190,86);
        ImieNazwisko im = new ImieNazwisko("A", "B");
        double wynik = mb.mojeBMI();
        System.out.println("BMI = "+wynik);
        System.out.println(im.powitanie());
    }
}
