public class Clothing_product extends product{
    private String size;
    private String fabric;

    public Clothing_product(){}

    public Clothing_product(int productID, String name, double price, String size, String fabric) {
        super(productID, name, price);
        this.size = size;
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;}
    }
