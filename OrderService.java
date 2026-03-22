import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private List<Double> items = new ArrayList<>();
    private double balance;
    private boolean orderPlaced = false;

    public OrderService(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Invalid balance");
        }
        this.balance = balance;
    }

    // add item
    public void addItem(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Invalid price");
        }
        items.add(price);
    }

    // get total
    public double getTotal() {
        double sum = 0;
        for (double p : items) {
            sum += p;
        }
        return sum;
    }

    // apply discount (10% if total > 500)
    public double applyDiscount() {
        double total = getTotal();

        if (total > 500) {
            return total * 0.9; // 10% discount
        }

        return total;
    }

    // place order
    public String placeOrder() {

        if (items.isEmpty()) {
            return null;  // no items
        }

        double finalAmount = applyDiscount();

        if (finalAmount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }

        balance -= finalAmount;
        orderPlaced = true;
        items.clear();

        return "ORDER_PLACED";
    }

    public boolean isOrderPlaced() {
        return orderPlaced;
    }

    public double getBalance() {
        return balance;
    }

    public int getItemCount() {
        return items.size();
    }
}