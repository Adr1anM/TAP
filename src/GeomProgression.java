import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeomProgression {

    private final int size;
    private double ratio;

    public GeomProgression() {
        this.size = 0;
        this.ratio = 0;
    }

    public GeomProgression(int size, double ratio) {
        this.size = size;
        this.ratio = ratio;
    }

    public boolean hasProgression(Set<Integer> set) {
        if (set.size() <= 1) {
            return false;
        } else {
            Integer[] array = set.toArray(new Integer[0]);
            Arrays.sort(array);
            ratio = (double) array[1] / array[0];
            return Arrays.stream(array, 1, array.length)
                    .allMatch(i -> (double) i / array[Arrays.binarySearch(array, i) - 1] == ratio);
        }
    }

        public Set<Integer> generateProgressionSet(int firstElement) {
            return Stream.iterate(firstElement, n -> (int) (n * ratio))
                    .limit(size)
                    .collect(Collectors.toCollection(HashSet::new));
    }
}
