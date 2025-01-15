import java.util.ArrayList;

public class Cart {
    private Customer customer;
    private ArrayList<Order> orders;
    private int quantity;
    private double total;


    public Cart(Customer customer, ArrayList<Order> orders, int quantity, double total) {
        this.customer = customer;
        this.orders = orders;
        this.quantity = quantity;
        this.total = total;

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders (ArrayList<Order> orders) {
        this.orders = orders;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
