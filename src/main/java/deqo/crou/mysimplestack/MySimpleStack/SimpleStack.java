package deqo.crou.mysimplestack.MySimpleStack;

import java.lang.RuntimeException;

public interface SimpleStack {
    boolean isEmpty();
    int getSize();
    void push(Item item);
    Item peek() throws RuntimeException;
    Item pop() throws RuntimeException;
}