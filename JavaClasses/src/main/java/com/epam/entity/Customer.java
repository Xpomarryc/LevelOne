package com.epam.entity;

import java.math.BigInteger;
import java.util.Objects;

public class Customer {
    private int id;
    private String surname;
    private String firstName;
    private String lastName;
    private String address;
    private BigInteger creditCardNumber;
    private BigInteger bankAccountNumber;

    public Customer(int id, String lastName, String firstName, String surname, String address, BigInteger creditCardNumber, BigInteger bankAccountNumber) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.lastName = lastName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public BigInteger getCreditCardNumber() {
        return creditCardNumber;
    }

    public BigInteger getBankAccountNumber() {
        return bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return getId() == customer.getId() && Objects.equals(getSurname(), customer.getSurname()) && Objects.equals(getFirstName(), customer.getFirstName()) && Objects.equals(getLastName(), customer.getLastName()) && Objects.equals(getAddress(), customer.getAddress()) && Objects.equals(getCreditCardNumber(), customer.getCreditCardNumber()) && Objects.equals(getBankAccountNumber(), customer.getBankAccountNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSurname(), getFirstName(), getLastName(), getAddress(), getCreditCardNumber(), getBankAccountNumber());
    }
}
