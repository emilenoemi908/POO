import java.util.ArrayList;

public class ShoppingCart {

    private int customerID;
    private ArrayList<Product> productList;

    public ShoppingCart(int customerID) {
        this.customerID = customerID;
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product p) {
        productList.add(p);
    }

    public void removeProduct(Product p) {
        productList.remove(p);
    }

    public void getContents() {
        for (Product p : productList) {
            System.out.println(p.getName());
        }
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getItemCount() {
        return productList.size();
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product p : productList) {
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }
}
