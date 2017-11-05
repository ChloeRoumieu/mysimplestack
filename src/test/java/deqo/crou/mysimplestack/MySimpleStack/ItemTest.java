package deqo.crou.mysimplestack.MySimpleStack;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void printItem() {
        Item i = new Item(1);
        String s = "Item \n  val :" + 1;
        assertEquals("L'affiche de l'item doit être",s, i.printItem());
    }

}