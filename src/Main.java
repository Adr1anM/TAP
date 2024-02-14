import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Carte biblioteca = new Carte("Biblioteca");

        biblioteca.adaugaCarte(new Carte("Java Programming"));
        biblioteca.adaugaCarte(new Carte("Introduction to Algorithms"));
        biblioteca.adaugaCarte(new Carte("Clean Code"));
        biblioteca.adaugaCarte(new Carte("Design Patterns"));
        biblioteca.adaugaCarte(new Carte("Meaning of Java"));

        List<Carte> cartiGasite = biblioteca.cautaCarti("Java");

        System.out.println("Cartile gasite:");
        for (Carte carte : cartiGasite) {
            System.out.println(carte);
        }
    }

}