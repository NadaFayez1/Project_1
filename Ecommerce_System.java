import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ecommerce_System {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Custmoer custmoer1 = new Custmoer("Nada Fayez", "Alex", 23011585);
        Electronic_product device1=new Electronic_product(1,"smart phone",599.9,1,"samsung");
        Clothing_product clothes=new Clothing_product(2,"t-shirt",19.99,"medium","cotton");
        Book_product book1=new Book_product(3,"harry potter",39.99,"JK rowling","X Publications");

        JOptionPane.showMessageDialog(null,"welcome to E-commerce system!");

      // Integer.parseInt(  JOptionPane.showInputDialog("enter your ID"));    #to sum up I put it in the constractor
        JOptionPane.showMessageDialog(null, " ID "+(custmoer1.getCustomerID()));

        //JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null,"Name: "+ (custmoer1.getName()));

        //JOptionPane.showInputDialog("enter your address");
        JOptionPane.showMessageDialog(null,"Address is "+ (custmoer1.getAddress()));

        int nproducts =  Integer.parseInt(  JOptionPane.showInputDialog ("How many products you want to add to your cart?"));

        cart cart1=new cart( );
        cart1.setNproducts(nproducts);
        product[ ] p=new product[cart1.getNproducts()];
       cart1.setProuducts(p);
       cart1.setCustomerID(custmoer1.getCustomerID());

for(int j=0;j<nproducts;j++){
    int choice= Integer.parseInt(  JOptionPane.showInputDialog   ("which product you want to add to your cart? 1-smart phone, 2-t-shirt, 3-harry potter book"));
   //int choice=input.nextInt();
   switch (choice){
       case 1:
           cart1.getProuducts()[j]=device1;
         //cart1.Add_product(j,device1);         #another solution by add method
           break;
       case 2:
           cart1.getProuducts()[j]=clothes;
          // cart1.Add_product(j,clothes);
           break;
       case 3:
           cart1.getProuducts()[j]=book1;
         //  cart1.Add_product(j,book1);
           break;
       default:
           JOptionPane.showMessageDialog(null,"invalid");
   }}
       JOptionPane.showMessageDialog (null,"your total is"+  cart1.calculatePrice());
int num= Integer.parseInt( JOptionPane.showInputDialog("Would you like to place the order? 1- yes , 2-No"));
        cart1.place_order(num);
    }}