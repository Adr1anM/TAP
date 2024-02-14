import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Biblioteca {
    protected List<Carte> listaCarti = new ArrayList<>();

    public void metoda() {
        System.out.println("Metoda din clasa de baza, fara parametri");
    }

    public void metoda(String str) {
        System.out.println("Metoda din clasa de baza, cu parametru String: " + str);
    }

    public void metoda(int x, int y) {
        System.out.println("Metoda din clasa de baza, cu parametri int: " + x + ", " + y);
    }

    public void adaugaCarte(Carte carte) {
        listaCarti.add(carte);
    }

    public void stergeCarte(Carte carte) {
        listaCarti.remove(carte);
    }

    public List<Carte> cautaCarti(String sablon) {
        List<Carte> cartiGasite = new ArrayList<>();
        Pattern pattern = Pattern.compile(sablon);
        for (Carte carte : listaCarti) {
            Matcher matcher = pattern.matcher(carte.getTitlu());
            if (matcher.find()) {
                cartiGasite.add(carte);
            }
        }
        return cartiGasite;
    }
}
