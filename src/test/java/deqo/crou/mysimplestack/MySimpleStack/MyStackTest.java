package deqo.crou.mysimplestack.MySimpleStack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class MyStackTest {
    private SimpleStack pile;
    private Item a;
    private Item b;

    @Before
    public void initialize() {
        pile = new MyStack();
        a = new Item(1);
        b = new Item(2);
    }

    @Test
    public void createEmptyStackTest() {
        assertTrue("Une nouvelle pile est vide", pile.isEmpty());
        assertEquals("Une nouvelle pile contient 0 élément",0,pile.getSize());
    }

    @Test
    public void pushTest(){
        pile.push(a);
        pile.push(b);

        assertFalse("La vide ne doit pas être vide", pile.isEmpty());
        assertEquals("La pile contient 1 élément", 2, pile.getSize());
        assertSame("L'élément push doit être en tête de pile", b, pile.peek());
    }

    @Test(expected = EmptyStackException.class)
    public void popEmptyStackTest() throws Exception {
        pile.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void peekEmptyStackTest() throws Exception {
        pile.peek();
    }

    @Test
    public void popTest() {
        pile.push(a);

        Item j = pile.peek();
        Item i = pile.pop();

        assertTrue("Si on retire tous les éléments la pile est vide", pile.isEmpty());
        assertEquals("Si on retire tous les éléments la pile contient 0 élément",0,pile.getSize());
        assertSame("Element push-pop est le même",a,i);
        assertSame("Element peek-pop est le même", j, i);
        assertSame("Element push-peek est le même",a,i);
    }

}