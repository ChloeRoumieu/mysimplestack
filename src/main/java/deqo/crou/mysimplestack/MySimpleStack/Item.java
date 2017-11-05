package deqo.crou.mysimplestack.MySimpleStack;

public class Item {

    private int val;

    public Item(int val) {
        this.val = val;
    }

    public String printItem() {
        return "Item \n  val :" + val;
    }
}