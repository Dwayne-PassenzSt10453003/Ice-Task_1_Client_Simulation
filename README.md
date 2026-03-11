<img width="326" height="378" alt="Screenshot 2026-03-11 195115" src="https://github.com/user-attachments/assets/84ce3496-a016-48e7-8bae-76477c917d0c" /># Campus QuickServe Project  

# Problem  
They want a small Java prototype application that: 
- Takes the details of the customer  
- Takes an order  
- Calculates a total  
- Calculates the VAT 
- Calculates the SubTotal  
- Displays a formatted receipt(GUI output)  
- Demonstrates basic OOP principles  
- The client does NOT want a console-only program. They want a GUI-based interaction using JOptionPane. They also want the system be structured properly using classes and methods (not everything inside main) 
# Program structure
QuickServeApp Contains:
- Main Method

 Order contains:
 - Order (Constructor)

 How I went on to solve the problem 
 - I first created the Order class to sort and store all my order data and perform the calculations such as, subtotal, discount, VAT and total price
 - Then I created the QuickServeApp class to handle the interaction of the user "JOptionPane"
 - The program then collects input from the user then creates an order object, performs calculations through the methods in the order class, and finally displays a formatted receipt.

 # OOP Concepts used
 - The order class represents the blue print of an order while an object of the class is created in the  QuickServeApp class to showcase a customers specific order.
 # Encaspulation
 - Order class attributes are declared private
 - Getter methods are used to access the data

# Constants
 A constant Vat rate was created to store the VAT(15%) value

# Methods used
- Subtotal calculation
- Discount calculation
- VAT calculation
- Total calculation

  # Result
  
  - <img width="326" height="378" alt="Screenshot 2026-03-11 195115" src="https://github.com/user-attachments/assets/ce56af9c-70dc-496b-8ab9-36412e7b6c81" />
  <img width="849" height="283" alt="Screenshot 2026-03-11 195156" src="https://github.com/user-attachments/assets/2ac2c9d7-d003-4149-828b-d24445193943" />

