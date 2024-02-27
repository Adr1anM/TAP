import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArythmProgression {

    private final int size;
    private double ratio;
    public ArythmProgression() {
        this.size = 0;
        this.ratio = 0;
    }

    public ArythmProgression(int size , int qprogr){
        this.size = size;
        this.ratio = qprogr;
    }

    public boolean HasProgresion(Set<Integer> set){
        if(set.size() <= 1) {
            return false;
        }
        else{
            Integer[] array = set.toArray(new Integer[0]);

            Arrays.sort(array);
            ratio = (double) array[1] / array[0];
            for (int i = 2;i < array.length;i++){
                if((double)array[i] / array[i-1] != ratio){
                    return false;
                }
            }
            return true;
        }
    }

    public Set<Integer> GenerateProgrrSet(int firstelement){

        Set<Integer> arythmProgressionSet = new HashSet<>();
        arythmProgressionSet.add(firstelement);

        int currelem = firstelement;
            for(int i = 0 ; i < size; i++){
                currelem*=ratio;
                arythmProgressionSet.add(currelem);
            }
        return arythmProgressionSet;
    }

}
