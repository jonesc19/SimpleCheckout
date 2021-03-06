
import java.text.NumberFormat;
import java.util.Locale;

public class SimpleCheckout {

    private static final int APPLE_UNIT_PRICE  = 60;
    private static final int ORANGE_UNIT_PRICE = 25;

    private static final NumberFormat format = NumberFormat.getCurrencyInstance(Locale.UK);

    private static long twoForOne(long n) {
        return (n + 1) / 2;
    }

    private static long threeForTwo(long n) {
        return (n / 3) * 2 + (n % 3);
    }

    String totalCost(String[] purchases) {

        long apple  = 0;
        long orange = 0;

        for (String item : purchases) {

            if (item.equalsIgnoreCase("apple")) {
                apple++;
                continue;
            }

            if (item.equalsIgnoreCase("orange")) {
                orange++;
                continue;
            }
        }

        long cost = twoForOne(apple) * APPLE_UNIT_PRICE + threeForTwo(orange) * ORANGE_UNIT_PRICE;

        return format.format(cost / 100.0);
    }

    public static void main(String[] args) {
        System.out.println(new SimpleCheckout().totalCost(args));
    }
}
