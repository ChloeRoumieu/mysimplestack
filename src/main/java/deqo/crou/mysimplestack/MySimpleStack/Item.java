package deqo.crou.mysimplestack.MySimpleStack;

public class Item {

    private int val;

    public Item(int val) {
        this.val = val;
    }

    /* Un commentaire repondant a l'exigence #1
    * @return
    * */
    public String printItem() {
        return "Item \n  val :" + val;
    }
}