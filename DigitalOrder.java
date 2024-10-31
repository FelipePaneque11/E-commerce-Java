/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order;

/**
 *
 * @author paneq
 */
public class DigitalOrder extends Order {
    private String downloadLink;
    
    //constructor
    public DigitalOrder(String downloadLink, int orderId, double totalAmount, String orderDate, PaymentMethod paymentMethod) {
        super(orderId, totalAmount, orderDate, paymentMethod);
        this.downloadLink = downloadLink;
    }
    
    //getter
    public String getDownloadLink() {
        return downloadLink;
    }
    
    //setter
    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }
    
    @Override
    public String detail(){
        return super.detail() + "\n" +
                "Download Link: " + downloadLink;
    }

}
