package test;

import main.java.org.java.model.StackCollection;
import org.junit.jupiter.api.Test;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;



public class test_stack {
    @Test
    public void addItemToStack() {
        Stack<String> actual = StackCollection.addOneElementToStack("Plates");
        assertEquals("Plates", actual);
    }


    @Test
    public void addItemTwoItemsToStack() {
        Stack<String> actual = StackCollection.addOneElementToStack("Spoon");
        Stack<String> actual1 = StackCollection.addOneElementToStack("Cups");
        assertEquals("Spoon",actual);
        assertEquals("Cups", actual1);
    }

    @Test
    public void removeItemFromStack() {
        Stack<String> actual = StackCollection.addOneElementToStack("book");
        Stack<String> actual1 = StackCollection.addOneElementToStack("pen");
        Stack<String> actual2 = StackCollection.addOneElementToStack("pencil");
        assertTrue(actual2.contains("pencil"));
        String actual3 = StackCollection.removeElementFromStack();
        assertEquals("pencil", actual3);
        assertTrue(actual.contains("book"));
        assertTrue(actual1.contains("pen"));
        assertFalse(actual3.contains("pencil"));
    }
    public void addItemTwoItemsToStackAndPeek() {
        String actual = StackCollection.addOneElementToStack("earpod");
        String actual1 = StackCollection.addOneElementToStack("wristwatch");
        String actual1 = StackCollection.peakStack();

        assertEquals("Spoon",actual);
        assertEquals("Cups", actual1);
    }



}
