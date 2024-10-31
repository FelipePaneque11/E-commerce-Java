/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order;

/**
 *
 * @author paneq
 */
public class CreditCardPayment extends PaymentMethod{
    private double credits;
    
    public CreditCardPayment(double credits){
        this.credits = credits;
    }
    @Override
    public void pay(double amount){
        if(credits >= amount){
            credits -= amount;
             System.out.println("Payment of $" + amount + " processed. Remaining credits: $" + credits);
        } else {
            System.out.println("Insufficient credits. Payment of $" + amount + " could not be processed.");
        }
    }
    
    public double getCredits(){
        return credits;
    }
}
