
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
        String[] purchases = new String[] { "Apple", "Apple" };
        
	assertEquals(checkout.totalCost(purchases), POUND + "0.60");
    }

    @Test
    public void testThree() {
        String[] purchases = new String[] { "Apple", "Apple", "Apple" };
        
	assertEquals(checkout.totalCost(purchases), POUND + "1.20");
    }

    @Test
    public void testFour() {
        String[] purchases = new String[] { "Orange" };

	assertEquals(checkout.totalCost(purchases), POUND + "0.25");
    }

    @Test
    public void testFive() {
        String[] purchases = new String[] { "Orange", "Orange" };

	assertEquals(checkout.totalCost(purchases), POUND + "0.50");
    }

    @Test
    public void testSix() {
        String[] purchases = new String[] { "Orange", "Orange", "Orange" };

	assertEquals(checkout.totalCost(purchases), POUND + "0.50");
    }

    @Test
    public void testSeven() {
        String[] purchases = new String[] { "Orange", "Orange", "Orange", "Orange" };

	assertEquals(checkout.totalCost(purchases), POUND + "0.75");
    }

}
