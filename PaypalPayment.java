/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order;

/**
 *
 * @author paneq
 */
public class PaypalPayment extends PaymentMethod{
    private double balance;
    
    //constructor
    public PaypalPayment(double balance) {
        this.balance = balance;
    }
    
    //setter
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    @Override
    public void pay(double amount) {
        if(balance >= amount){
            balance -= amount;
            System.out.println("Payment of $" + amount + " processed. Remaining balance: $" + balance);
        } else{
            System.out.println("Insufficient credits. Payment of $" + amount + " could not be processed.");
        }
    }


    
}
