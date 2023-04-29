package com.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "accounts")
@Entity
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "cin")
    private String cin;

    @Column(name = "accountNumber")
    private String accountNumber;

    @Column(name = "agency")
    private String agency;

    @Column(name = "amount")
    private String amount;

    public Account() {

    }

    public Account(Long id, String firstName, String lastName, String cin, String accountNumber, String agency, String amount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cin = cin;
        this.accountNumber = accountNumber;
        this.agency = agency;
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", cin='" + getCin() + "'" +
            ", accountNumber='" + getAccountNumber() + "'" +
            ", agency='" + getAgency() + "'" +
            ", amount='" + getAmount() + "'" +
            "}";
    }
    

}
