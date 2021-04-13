class Triangle {
    public Triangle(int wysokosc, int podstawa){
        System.out.println(wysokosc*podstawa/2);
    }
    public Triangle(int podstawa){
        double pierw = Math.pow(podstawa, 1/3);
        double pole = (Math.pow(podstawa, 2)*pierw)/4;
        System.out.println(pole);
    }
}
