import java.util.Arrays;

public class MyList<I extends Number> {
    private int size=0;
    private static final int DEAFSULT_CAPACITY=10;
    private Object element[];
    public MyList(){
        element=new Object[DEAFSULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize=element.length*2;
        element= Arrays.copyOf(element,newSize);
    }
    public void add(Object e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }
    public Object get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (Object) element[i];
    }
}
