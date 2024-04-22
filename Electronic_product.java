public class Electronic_product extends product{
    private String brand;
    private int warrantyPeriod;

    public Electronic_product() {}
    public Electronic_product(int productID, String name, double price, int warrantyPeriod, String brand) {
        super(productID, name, price);
        this.warrantyPeriod = warrantyPeriod;
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;}

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
