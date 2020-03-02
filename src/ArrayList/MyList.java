package ArrayList;

import java.util.ArrayList;

public class MyList<E> {
    int size=0;
    static final int DEFAULT_CAPACITY=10;
    private Integer elements[];

    MyList() {
    }
    public MyList(int capacity){
        elements = new Integer[DEFAULT_CAPACITY];
    }
    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = (int) e;
    }
    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public E get(int i){
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index" + i + ", size" + i);
        }
        return (E) elements[i];
    }
    public E remove(){

    }
}
