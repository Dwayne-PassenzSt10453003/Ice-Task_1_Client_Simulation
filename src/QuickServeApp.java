/*/*
PR#1: QuickServeApp - Campus QuickServe Receipt
Author: Dwayne Passenz
Date: 2026/03/11

Description:
- Collects customer details (Name, StudenNumber, Order, Quantity of Orders, Price) via JOptionPane
- Order object created to store details
- Calculates subtotal, discount ( a 10% for quantity > 3, (15%), and the total
- Produces a receipt string and displays it in a JOptionPane message.
*/
import javax.swing.JOptionPane;

public class QuickServeApp {
     
    public static void main(String[] args) {
        
       //Collecting user input
       String name = JOptionPane.showInputDialog("Enter Customer Name:");
       String studentNumber = JOptionPane.showInputDialog("Enter studentNumber:");
       String item = JOptionPane.showInputDialog("Enter item orderd:");
       
       int quantity = Integer.parseInt(
              JOptionPane.showInputDialog("Enter quantity:")
       );
       double price = Double.parseDouble(
              JOptionPane.showInputDialog("Enter price per irem:")
       );
       
       //Create the order object
       Order order = new Order(name, studentNumber, item, quantity, price);
       
       //Perform calculations
       double subtotal = order.calculateSubtotal();
       double discount = order.calculateDiscount();
       double vat = order.calculateVat();
       double total = order.calculateTotal();
       
       //Producing the appropriate receipt
       String receipt = 
          "Campus QuickServe Receipt\n\n"
               + "Customer Name: " + order.getCustomerName() + "\n"
               + "Student Number:" + order.getStudentNumber() + "\n"
               + "item Orderd:" + item + "\n"
               + "Quantity:" + quantity + "\n"
               + "Price per item: R" + price + "\n\n"
               + "Subtotal: R" + subtotal + "\n"
               + "Discount Applied: R" + discount + "\n"
               + "VAT (15%): R" + vat + "\n"
               + "Total: R" + total;
       
       //Display receipt
       JOptionPane.showMessageDialog(null, receipt);
       
       System.exit(0);
                  
    }
}
