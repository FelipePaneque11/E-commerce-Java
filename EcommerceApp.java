/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package order;

/**
 *
 * @author paneq
 */
public class EcommerceApp {
        public static void main(String[] args){
            PaymentMethod payment = new CreditCardPayment(500.0);
            PhysicalOrder physicalOrder = new PhysicalOrder("22,Usher Quay,Dublin,Ireland",20.0 ,1, 205.0 , "31/10/2024", payment);
            
            PaymentMethod payment2 = new PaypalPayment(2000);
            DigitalOrder digitalOrder = new DigitalOrder("www.linkForThePurchase.com", 2, 500.0, "31/10/2024", payment2);
            
            // Process the payment
            System.out.println("Processing payment for Physical Order ID: " + physicalOrder.getOrderId());
            System.out.println(physicalOrder.detail());
            physicalOrder.processPayment();
            
            System.out.println("\n");
            
            System.out.println("Processing payment for Digital Order ID: " + digitalOrder.getOrderId());
            System.out.println(digitalOrder.detail());
            digitalOrder.processPayment();
            
          
    }
}
