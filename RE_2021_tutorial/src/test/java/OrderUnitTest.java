import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.List;

public class OrderUnitTest {
    @Test
    public void empty_order_by_default(){
        Order o = new Order();
        o.setOwner("Romeo");
        o.setRecipient("Juliet");
        List<Order.Drink> drinks = o.getDrinks();
        assertEquals(0, drinks.size());
    }
}
