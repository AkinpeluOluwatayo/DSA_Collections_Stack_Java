package main.java.org.java.model;


import java.util.Stack;

public class StackCollection {
    static Stack<String> elements = new Stack<>();

    public static Stack<String> addOneElementToStack(String element) {
        elements.push(element);
        return elements;
    }

    public static String removeElementFromStack() {
        return elements.pop();
    }

    public static String peakStack() {
        if (!elements.isEmpty()) {
            return elements.peek();
        }
        return null;
    }
}
