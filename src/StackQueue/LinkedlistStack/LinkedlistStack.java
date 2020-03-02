package StackQueue.LinkedlistStack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class LinkedlistStack<T> {
    private LinkedList<T> stack;

    public LinkedlistStack(){
        stack = new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if (stack.size()==0){
            return true;
        }
        return false;
    }

    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

}
