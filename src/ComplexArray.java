import java.util.Arrays;
import java.util.Comparator;

public class ComplexArray<T> extends Array<T> {

    public ComplexArray(T[] elements) {
        super(elements);
    }

    @Override
    public void Print(){
        for(T element : elements){
            System.out.println(element + " ");
        }
        System.out.println("Elements from derived class");
    }

    public void sortElements() {
        Arrays.sort(elements, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return ((Comparable<T>) o1).compareTo(o2);
            }
        });
    }

    public void AddElement(T element){
        T[] newArr = Arrays.copyOf(elements,elements.length+1);

        newArr[elements.length -1] = element;
        elements = newArr;
    }

    public void RemoveElement(int index){
        if(index>=0 && index<= elements.length){
            T[] newArray = Arrays.copyOf(elements, elements.length - 1);
            System.arraycopy(elements, 0, newArray, 0, index);
            System.arraycopy(elements, index + 1, newArray, index, elements.length - index - 1);
            elements = newArray;
        } else {
            System.out.println("Indexul specificat este invalid.");
        }
    }




}
