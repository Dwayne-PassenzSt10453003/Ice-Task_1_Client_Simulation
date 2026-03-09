
import javax.swing.JOptionPane;

public class Order {
    
    //Attributes 
    private String customersName;
    private String StudentNumber;
    private String itemOrder;
    private int Quantity;
    private double pricePerItem;
    
    //Constant(Vat)
    public static final double VAT_RATE = 0.15;
    
    //Constructer
    public Order(String customersName,String StudentNumber, String itemOrder, int Quantity, double pricePerItem ){
        this.customersName = customersName;
        this.StudentNumber = StudentNumber;
        this.customersName = customersName;
        this.itemOrder = itemOrder;
        this.pricePerItem = pricePerItem;
        
        //Calculating Method for subtotal
        public double calculateSubTotal(){
            return quantity * pricePerItem;
        }
    }
}