/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order;

/**
 *
 * @author paneq
 */
public class PhysicalOrder extends Order{
    private String shippingAddress;
    private final double fees;


    public PhysicalOrder(String shippingAddress, double fees, int orderId, double totalAmount, String orderDate, PaymentMethod paymentMethod) {
        super(orderId, totalAmount, orderDate, paymentMethod); // Pass paymentMethod to super
        this.shippingAddress = shippingAddress;
        this.fees = fees;
    }

    //getter
    public String getShippingAddress() {
        return shippingAddress;
    }
    public double getFees() {
        return fees;
    }
    
    //setter
    public void setShippingAdress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    
    @Override
    public String detail(){
        return super.detail() + "\n" +
                "Shipping Address: " + shippingAddress + "\n" +
                "Fess: " + fees;
    }
}
