package deqo.crou.mysimplestack.MySimpleStack;


import java.util.EmptyStackException;
import java.util.Stack;

/* Commentaire repondant a l'exigence #3 */

public class MyStack implements SimpleStack {
    private Stack <Item> stack = new Stack <Item>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int getSize() {
        return stack.size();
    }

    public void push(Item item) {
        stack.push(item);
    }

    public Item peek() throws EmptyStackException {
        Item i = null;
        try {
            i = stack.peek();
        }
        catch (EmptyStackException e) {
            System.out.println("Empty Stack");
            throw new EmptyStackException();
        }
        return i;
    }

    public Item pop() throws EmptyStackException {
        Item i = null;
        try {
            i = stack.pop();
        }
        catch (EmptyStackException e) {
            System.out.println("Empty Stack");
            throw new EmptyStackException();
        }
        return i;
    }
}
