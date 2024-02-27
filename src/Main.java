import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        ArythmProgression progresion = new ArythmProgression();

        set.add(2);
        set.add(4);
        set.add(8);
        set.add(16);
        set.add(32);

        if (progresion.HasProgresion(set)) {
            System.out.println("It has a progression arythm");

        } else {
            System.out.println("It doesn't have progresion arythm");
        }

        ArythmProgression newprogression = new ArythmProgression(10,2);

        Set<Integer> newset = newprogression.GenerateProgrrSet(2);

        System.out.println(newset);

    }
}