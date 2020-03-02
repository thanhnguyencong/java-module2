package StackQueue;
import java.util.*;

public class ReverseElement {
    Stack st;
    int a;
    ReverseElement(){
    }

    public ReverseElement(Stack st, int a){
        this.st = st;
        this.a = a;
    }

    public Stack getSt() {
        return st;
    }

    public void setSt(Stack st) {
        this.st = st;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    static void push(Stack st, int a){
        st.push(new Integer(a));
        System.out.println("stack: " + st);
    }

     static int pop(Stack st){
        Integer a = (Integer) st.pop();
        System.out.println("stack: " + st);
        return a;
    }

    public static void main(String[] args) {
        Stack st1 = new Stack();
        Stack st2 = new Stack();

        pop(st1);

        push(st1,1);
        push(st1,2);
        push(st1,3);

        push(st2,pop(st1));
        push(st2,pop(st1));
        push(st2,pop(st1));

    }
}
