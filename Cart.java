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

}
