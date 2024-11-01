# Order Management System

## Project Overview

This project is an **Order Management System** built in Java. It was created as a study/practice project to strengthen understanding of **Object-Oriented Programming (OOP)** concepts, such as **inheritance**, **polymorphism**, and **method overriding**. It’s intended as a foundational learning project and not for production use.

## Features

- **Order Management**: Creates and manages different types of orders.
- **Physical and Digital Orders**: Uses inheritance to extend the base `Order` class into specialized `PhysicalOrder` and `DigitalOrder` classes.
- **Payment Processing**: Abstract `PaymentMethod` class allows different payment methods to be created and used, demonstrating polymorphism.
- **Detailed Summaries**: Displays detailed order summaries, including order ID, amount, order date, payment method, and additional fees if applicable.

## Project Structure

```plaintext
## Project Structure

src
│
├── Order.java                     # Base class representing a general order
├── PhysicalOrder.java             # Subclass representing a physical order, includes shipping information and fees
├── DigitalOrder.java              # Subclass representing a digital order, includes download link or licensing info
├── PaymentMethod.java             # Abstract class for different types of payment methods
├── CreditCardPayment.java         # Subclass of PaymentMethod to handle credit card payments
├── PaypalPayment.java             # Subclass of PaymentMethod to handle PayPal payments
├── EcommerceApp.java                      # Main class to test the app’s functionalities
```

### Class Descriptions

- **Order**: 
  - Base class representing a general order, containing properties such as:
    - `orderId`: Unique identifier for the order.
    - `totalAmount`: Total cost of the order.
    - `orderDate`: Date when the order was placed.
    - `paymentMethod`: Reference to a `PaymentMethod` object for processing payments.
  - Methods:
    - `detail()`: Returns a summary of the order details.
    - `setPaymentMethod()`: Assigns a payment method to the order.

- **PhysicalOrder**: 
  - Subclass of `Order`, representing a physical product order with additional attributes:
    - `shippingAddress`: Address where the order will be delivered.
    - `fees`: Additional fees for physical goods.
  - Overridden Methods:
    - `detail()`: Includes shipping information and additional fees in the order summary.

- **DigitalOrder**: 
  - Subclass of `Order`, representing a digital product order.
  - Potential attributes could include:
    - `licenseKey`: Key or information specific to digital licensing.
  - Demonstrates handling of digital products by using inheritance to add specific attributes.

- **PaymentMethod**: 
  - Abstract class defining a blueprint for payment methods.
  - Contains:
    - Abstract method `pay(double amount)`: To be implemented by subclasses, defining specific payment processing logic.

- **CreditCardPayment**: 
  - Concrete subclass of `PaymentMethod`, implementing credit card payment processing.
  - Attributes:
    - `credits`: The balance available on the credit card (or credit points).
  - Methods:
    - `pay(double amount)`: Deducts the required credits to complete the transaction, applying any applicable logic specific to credit card payments.
