import java.util.Date;
import java.util.ArrayList;

public class Order {
    private int orderID;
    private int customerID;
    private ArrayList<Product> productsID;
    private int quantity;
    private double price;
    private Date orderDate;


    public Order(int orderID, int customerID, ArrayList<Product> productsID, int quantity, double price) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.productsID = productsID;
        this.quantity = quantity;
        this.price = price;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductsID() {
        return productsID;
    }

    public void setProductsID( ArrayList<Product> productsID) {
        this.productsID = productID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}