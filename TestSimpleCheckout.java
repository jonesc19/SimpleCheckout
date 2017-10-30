
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestSimpleCheckout {

    private static final String POUND = "\u00a3";

    private SimpleCheckout checkout;

    @Before
    public void setup() {
        checkout = new SimpleCheckout();
    }

    @Test
    public void testOne() {
        String[] purchases = new String[] { "Apple" };

	assertEquals(checkout.totalCost(purchases), POUND + "0.60");
    }

    @Test
    public void testTwo() {
        String[] purchases = new String[] { "Orange" };

	assertEquals(checkout.totalCost(purchases), POUND + "0.25");
    }

    @Test
    public void testThree() {
        String[] purchases = new String[] { "Apple", "Orange" };
        
	assertEquals(checkout.totalCost(purchases), POUND + "0.85");
    }
}
