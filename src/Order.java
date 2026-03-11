

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
        this.itemOrder = itemOrder;
        this.Quantity = Quantity;
        this.pricePerItem = pricePerItem;
    }
        //Calculating Method for subtotal
        public double calculateSubtotal(){
            return Quantity * pricePerItem;
        }
        //Method to calculate discount
        public double calculateDiscount () {
            if (Quantity > 3){
                return calculateSubtotal() * 0.10;
            }
            return 0;
        }
        //Calculating Method for VAT
        public double calculateVat(){
            double amountAfterDiscount = calculateSubtotal() - calculateDiscount();
                 return amountAfterDiscount * VAT_RATE;                            
            }
                
          //Method to calculate final Total
           public double calculateTotal (){
               double amountAfterDiscount = calculateSubtotal() - calculateDiscount();
               return amountAfterDiscount + calculateVat();
           }
           //Getters (Encapsulation requirement)
                   public String getCustomerName(){
                       return customersName;
                      
           }
                   public String getStudentNumber() {
                       return StudentNumber;
           }
                   public int getQuantity(){
                       return Quantity;
           }
                   public double getPricePerItem(){
                       return pricePerItem;
                   }
    }
