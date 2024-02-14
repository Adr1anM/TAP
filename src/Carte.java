class Carte extends Biblioteca {
    private String titlu;

    public Carte(String titlu) {
        this.titlu = titlu;
    }


    public String getTitlu() {
        return titlu;
    }


    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                '}';
    }

    @Override
    public void metoda() {
        System.out.println("Metoda suprascrisa din clasa derivata, fara parametri");
    }

    @Override
    public void metoda(String str) {
        System.out.println("Metoda suprascrisa din clasa derivata, cu parametru String: " + str);
    }


    @Override
    public void metoda(int x, int y) {
        System.out.println("Metoda suprascrisa din clasa derivata, cu parametri int: " + x + ", " + y);
    }
}