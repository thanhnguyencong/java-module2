package StackQueue.LinkedlistStack;

public class LinkedlistStackClient {
    private static void stackOfIStrings() {
        LinkedlistStack<String> stack = new LinkedlistStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
