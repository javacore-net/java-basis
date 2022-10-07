package javacore.net;

import java.text.NumberFormat;
import java.util.Locale;

public class JavaVariables {
    public static void main(String[] args) {
        // customer information
        String customerName;
        String customerDob;
        String customerEmail;
        String customerPhoneNumber;
        char customerGender;
        boolean isActiveCustomer;
        int customerPoint;
        double customerBalance;

        // init values
        customerName = "Learn Enough Java";
        customerDob = "01/01/2000";
        customerEmail = "learn.enough.java@nextjsvietnam.com";
        customerPhoneNumber = "+84937590678";
        customerGender = 'M';
        customerPoint = 2530000;
        customerBalance = 5175.25;
        isActiveCustomer = true;

        String customerInformation = ""
                + "Customer Name : " + customerName + "\n"
                + String.format("Customer Dob: %s\n", customerDob)
                + String.format("Customer Email: %4s\n", customerEmail)
                + String.format("Customer PhoneNumber: %s\n", customerPhoneNumber)
                + String.format("Customer Gender: %s\n", customerGender == 'M' ? "Male" : "Female")
                + String.format("Customer Point: %s points\n", NumberFormat.getInstance().format(customerPoint))
                + String.format("Customer Balance: %s USD\n", NumberFormat.getCurrencyInstance(new Locale("en-US")).format(customerBalance))
                + String.format("Customer is active: %s\n", isActiveCustomer ? "Yes" : "No");

        System.out.println(customerInformation);
    }
}