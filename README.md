# Electricity Bill Calculator

This project contains a simple Java program to calculate electricity bills based on the number of units consumed by a customer.

## Usage

1. **Clone the Repository:**
    ```bash
    git clone https://github.com/veenanikhar/CoreJava_electricity-bill-calculator.git
    ```

2. **Navigate to the Directory:**
    ```bash
    cd electricity-bill-calculator
    ```

3. **Compile the Java File:**
    ```bash
    javac ElectricityBill.java
    ```

4. **Run the Program:**
    ```bash
    java ElectricityBill
    ```

## Program Overview

The program consists of a class named `ElectricityBill` with the following functionalities:

1. `readData()`: Reads the customer details such as customer number, customer name, and units consumed.
2. `showData()`: Displays the customer details.
3. `computeBill()`: Calculates and returns the electricity charges based on the number of units consumed, according to the following rate structure:
    - For the first 100 units: Rs. 1.20 per unit
    - For the next 200 units: Rs. 2.00 per unit
    - For the next 300 units: Rs. 3.00 per unit
    - For any additional units beyond 600: Rs. 5.00 per unit

## Example

For example, if a customer consumes 320 units, the program would calculate the bill as follows:
