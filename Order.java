import java.util.Date;
import java.util.ArrayList;

public class Order {
    private int orderID;
    private int customerID;
    private ArrayList<Product> products;
    private int quantity;
    private double price;
    private Date orderDate;


    public Order(int orderID, int customerID, ArrayList<Product> products, int quantity, double price, Date orderDate) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.products = products;
        this.quantity = quantity;
        this.price = price;
        this.orderDate = orderDate;
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

    public ArrayList<Product> getProductsID() {
        return products;
    }

    public void setProductsID( ArrayList<Product> productsID) {
        this.products = products;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}