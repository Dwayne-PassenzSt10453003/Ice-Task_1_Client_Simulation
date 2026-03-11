
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
       
       //Producing the receipt
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
