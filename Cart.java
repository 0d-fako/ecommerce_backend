import java.util.ArrayList;

public class Cart {
    private Customer customer;
    private ArrayList<Product> products;
    private int quantity;
    private double total;


    public Cart(Customer customer, ArrayList<Product> products, int quantity, double total) {
        this.customer = customer;
        this.products = products;
        this.quantity = quantity;
        this.total = total;

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
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
