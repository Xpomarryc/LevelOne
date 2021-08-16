package com.epam.service;

import com.epam.entity.Customer;
import com.epam.exception.NotFoundException;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

public class CustomerService {

    public static Customer[] sortByAlphabet(Customer[] customers) {
        Customer[] sortedCustomers = customers.clone();
        Arrays.sort(sortedCustomers, Comparator.comparing(Customer::getLastName));
        return sortedCustomers;
    }

    public static Customer[] findCustomersByCardNumberRange(Customer[] customers, BigInteger min, BigInteger max) throws NotFoundException {
        if (min.compareTo(max) > 0) {
            System.out.println("Error: min > max");
            return new Customer[1];
        }
        Customer[] foundArray = new Customer[customers.length];
        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            if (customer.getCreditCardNumber().compareTo(min) >= 0 && customer.getCreditCardNumber().compareTo(max) <= 0) {
                foundArray[i] = customer;
            }
        }
        boolean isFoundArrayNull = true;
        for (Customer customer : foundArray) {
            if (customer != null) {
                isFoundArrayNull = false;
                break;
            }
        }
        if (isFoundArrayNull) {
            throw new NotFoundException();
        }
        return foundArray;
    }
}
