public class Custmoer {
    private String name;
    private String address;
    private int customerID;

    public Custmoer() {}

    public Custmoer(String name, String address, int customerID) {
        this.name = name;
        this.address = address;
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;}

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
           this.customerID =Math.abs(customerID);
    }
}
