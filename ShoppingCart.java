import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Double> items = new ArrayList<>();
    private double balance;

    public ShoppingCart(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    // add item price
    public void addItem(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        items.add(price);
    }

    // calculate total price
    public double getTotal() {
        double sum = 0;
        for (double price : items) {
            sum += price;
        }
        return sum;
    }

    // checkout
    public void checkout() {

        double total = getTotal();

        // ❗ INTENTIONAL BUG:
        // allows checkout even if balance == total
        if (total > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }

        balance -= total;
        items.clear();
    }

    public double getBalance() {
        return balance;
    }

    public int getItemCount() {
        return items.size();
    }
}