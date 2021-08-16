package com.epam;

import com.epam.entity.Customer;
import com.epam.exception.NotFoundException;
import com.epam.service.CustomerService;

import java.math.BigInteger;

public class Runner {

    public static void main(String[] args) {
        Customer[] customers = generateCustomers();
        Customer[] sortedCustomers = CustomerService.sortByAlphabet(customers);
        System.out.println("Sorted by alphabet:");
        for (Customer customer : sortedCustomers) {
            System.out.println(customer.toString());
        }
        try {
            Customer[] foundArray = CustomerService.findCustomersByCardNumberRange(customers, new BigInteger("300000"), new BigInteger("59999999999"));
            System.out.println("Found by range:");
            for (Customer customer : foundArray) {
                if (customer != null) {
                    System.out.println(customer);
                }
            }
        } catch (NotFoundException e) {
            System.err.println("Credit card not found by range!");
        }
    }

    public static Customer[] generateCustomers() {
        Customer[] customers = new Customer[5];
        customers[0] = new Customer(1, "Gorbachev", "Dmitry", "Alexandrovich", "Minsk, Lomonosova str., 32", new BigInteger("200963567817"), new BigInteger("590492837461482"));
        customers[1] = new Customer(2, "Mihajlov", "Stas", "Germanovich", "Minsk, Lomonosova str., 37", new BigInteger("987654395"), new BigInteger("5473650265739285"));
        customers[2] = new Customer(3, "Zotov", "Alexey", "Georgievich", "Minsk, Lomonosova str., 7", new BigInteger("7719476924"), new BigInteger("4823957692019456"));
        customers[3] = new Customer(4, "Kebich", "Ludmila", "Ashotovna", "Pinsk, Zlatova str., 39", new BigInteger("9956128347"), new BigInteger("3627385007947361"));
        customers[4] = new Customer(5, "Putina", "Marina", "Olegovna", "Gomel, Sovetskaya str., 86", new BigInteger("9112365734215"), new BigInteger("7599172648300572"));
        return customers;
    }
}
