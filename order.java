import javax.swing.JOptionPane;
public class order {
    private int customerID;
    private int orderID;
    private double totalPrice;
    private  product [] prouducts;

    public order() {}

    public order(int customerID, int orderID, double totalPrice, product[] prouducts) {
        this.customerID = customerID;
        this.orderID = orderID;
        this.totalPrice = totalPrice;
        this.prouducts = prouducts;}

    public void printOrderInfo() {
        JOptionPane.showMessageDialog(null,  ("customer ID is:  " + customerID));
        JOptionPane.showMessageDialog(null, ("order ID is:  " + orderID));
     for(product i:prouducts){
         JOptionPane.showMessageDialog(null,     (i.getName() + " is  " + i.getPrice() + " $"));
     }
        JOptionPane.showMessageDialog(null, ("total price is:  " + totalPrice));
}}