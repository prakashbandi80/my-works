import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingCartTests {

    private Inventory inventory;
    private ShoppingCart cart;
    @Before
    public void setup(){
        Item item1 = new Item("item1", "A",ItemType.A, 10.0,ItemType.A.getPromotionType());
        Item item2 = new Item("item2", "B", ItemType.B, 9.0,ItemType.B.getPromotionType());
        Item item3 = new Item("item3", "X",ItemType.X, 10.0,ItemType.X.getPromotionType());
        Item item4 = new Item("item4", "Y",ItemType.Y, 5.0,ItemType.Y.getPromotionType());
        Item item5 = new Item("item5", "Z",ItemType.Z, 4.0,ItemType.Z.getPromotionType());
        Item item6 = new Item("item6", "P",ItemType.P, 3.0,ItemType.P.getPromotionType());
        Item item7 = new Item("item7", "Q",ItemType.Q, 8.0,ItemType.Q.getPromotionType());
        Item item8 = new Item("item8", "R",ItemType.R, 2.0,ItemType.R.getPromotionType());

        inventory = new Inventory();
        inventory.add(item1);
        inventory.add(item2);
        inventory.add(item3);
        inventory.add(item4);
        inventory.add(item5);
        inventory.add(item6);
        inventory.add(item7);
        inventory.add(item8);
        cart = new ShoppingCart(inventory);
    }

    @Test
    public void totalPriceOfItemsInCart(){
         cart.addItem(new LineItem("item1",1));
        cart.addItem(new LineItem("item2",2));
         double price = cart.getTotalPrice();
        assertEquals(28.0, price,0);
    }

    @Test
    public void totalPriceOfItemsInCartWithPromotion1(){
        cart.addItem(new LineItem("item1",1));
        cart.addItem(new LineItem("item2",2));
        double price = cart.getTotalPriceWithPromotion1();
        assertEquals(23.5, price,0);
    }

    @Test
    public void totalPriceOfItemsInCartWithPromotion2With10(){
        cart.addItem(new LineItem("item3",10));
        cart.addItem(new LineItem("item4",10));
        cart.addItem(new LineItem("item5",10));
        cart.addItem(new LineItem("item6",10));
        cart.addItem(new LineItem("item7",10));
        cart.addItem(new LineItem("item8",10));

        double price = cart.getTotalPriceWithPromotion2();
        assertEquals(295.0, price,0);
    }

    @Test
    public void totalPriceOfItemsInCartWithPromotion2(){
        cart.addItem(new LineItem("item3",1));
        cart.addItem(new LineItem("item4",2));
        cart.addItem(new LineItem("item8",1));
        double price = cart.getTotalPriceWithPromotion2();
        assertEquals(17.0, price,0);
    }
}
