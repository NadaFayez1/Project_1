import java.awt.geom.Arc2D;

public class product {
    protected int productID;
    protected  String name;
    protected doublesure price;

    public product() {
    }

    public product(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID =Math.abs(productID) ;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price =Math.abs(price);
    }
}
