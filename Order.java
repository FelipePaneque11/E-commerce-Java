/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order;

/**
 *
 * @author paneq
 */
public class Order {
    private int orderId;
    private double totalAmount;
    private String orderDate;
    private PaymentMethod paymentMethod;
    
    //constructor
    public Order(int orderId, double totalAmount, String orderDate, PaymentMethod paymentMethod) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.paymentMethod = paymentMethod;
    }
   
    public Order(){
        orderId = 0;
        totalAmount = 0.0;
        orderDate = "";
    }
    
    //getter
    public int getOrderId() {
        return orderId;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public String getOrderDate() {
        return orderDate;
    }
    
    //setter
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    
    public void processPayment() {
        if (paymentMethod != null) {
            paymentMethod.pay(totalAmount);
        } else {
            System.out.println("No payment method assigned.");
        }
    }

    public String detail() {
        String paymentInfo = paymentMethod != null ? paymentMethod.getClass().getSimpleName() : "No Payment Method";
        return "Order ID: " + orderId + "\n" +
               "Total Amount: $" + totalAmount + "\n" +
               "Order Date: " + orderDate + "\n" +
               "Payment Method: " + paymentInfo;
    }
}
