
public class Main {
    public static void main(String[] args) {


        Integer[] vector = {9,8,2,3,4,5,6,7};

        Array<Integer> array = new ComplexArray<Integer>(vector);

        array.Print();
        int value = array.GetByIndex(3);
        System.out.println("The value is "+value);

        ComplexArray<Integer> complexArray = (ComplexArray<Integer>) array;
        complexArray.AddElement(55);
        complexArray.Print();

        complexArray.sortElements();
        complexArray.Print();

        complexArray.RemoveElement(4);
        complexArray.Print();

        int newValue = complexArray.GetByIndex(5);
        System.out.println("The value searched by string is "+newValue);

    }
}