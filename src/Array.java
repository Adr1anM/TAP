import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Array<T>  {
    protected T[]  elements;

    public Array(){
        this.elements = (T[]) new Array[0];
    }
    public Array(T[] newelements){
        this.elements = newelements;
    }

    public void Print(){
        for(T element : elements){
            System.out.print(element + " ");
        }
    }

    public T GetByIndex(int index){

        if (index >= 0 && index < elements.length) {
            return elements[index];
        }
        return null;
    }

    public T GetByIndex(String value){
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(value);

        if(matcher.find()){
            int index = Integer.parseInt(matcher.group());
            if (index >= 0 && index < elements.length) {
                return elements[index];
            }
        }

        return null;
    }



}
