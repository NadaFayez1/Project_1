import javax.swing.JOptionPane;
public class cart {
    private int CustomerID;
    private int nproducts;
    private product [ ] products;

    public cart() {
    }
    public void setProuducts(product[ ] prouducts) {
        this.products=new product[nproducts];
    }

    public product[] getProuducts() {
        return products;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
            this.CustomerID =Math.abs(CustomerID);
    }

    public int getNproducts() {
        return nproducts;
    }

    public void setNproducts(int nproducts) {

        this.nproducts = Math.abs(nproducts);
    }

    public double calculatePrice() {
       double total_price=0;
         for(product i:products){
          if(i !=null){
            total_price+= i.getPrice();
        }}
        return total_price; }

   public void Add_product(int i,product product){
        products[i]=product;
    }

    public void Remove_product(int i,product product){
        products[i]=null;
    }

    public void place_order(int num){
      order o1=new order(23011585,1,calculatePrice(),products);
     switch (num){
       case 1:
           JOptionPane.showMessageDialog(null, ("Here's your order summary:"));
      o1.printOrderInfo();
     break;
     case 2:
         JOptionPane.showMessageDialog(null, ("ok thank you"));
    break;
 }}
   }


