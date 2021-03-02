package com.Ecommerce.Model;

import javax.persistence.Entity;

@Entity
public class CreditCard {
    private int cardNumber;
    private int cvv;
    private int expMont;
    private int expYear;
    private int transactionId;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getExpMont() {
        return expMont;
    }

    public void setExpMont(int expMont) {
        this.expMont = expMont;
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
}
