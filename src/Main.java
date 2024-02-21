import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);


        try {
            int step = 1;
            if (numbers.size() <= 1) {
                throw new IndexOutOfBoundsException();
            }
            while (numbers.size() > 1) {
                ArrayList<Integer> sums = new ArrayList<>();
                int i = 0;
                while (i < numbers.size()) {
                    try {
                        int sum = numbers.get(i) + numbers.get(i + 1);
                        sums.add(sum);
                        i += 2;
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                        sums.add(numbers.get(i));
                        i++;
                    }
                }
                numbers = sums;
                System.out.println("Etapa " + step++ + ": " + numbers);
            }
            System.out.println("Suma perechilor: " + numbers.getFirst());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Nu există numere pentru sumare.");
        }



    }


}