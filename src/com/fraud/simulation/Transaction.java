package com.fraud.simulation;

import java.time.LocalDateTime;

public class Transaction {

    private String transactionId;
    private String senderAccount;
    private String receiverAccount;
    private double amount;
    private String transactionType;
    private String location;
    private String device;
    private int riskScore;
    private boolean fraud;
    private LocalDateTime timestamp;
    public String getTransactionId() { return transactionId; }
    public String getSenderAccount() { return senderAccount; }
    public String getReceiverAccount() { return receiverAccount; }
    public double getAmount() { return amount; }
    public String getTransactionType() { return transactionType; }
    public String getLocation() { return location; }
    public String getDevice() { return device; }
    public int getRiskScore() { return riskScore; }
    public boolean isFraud() { return fraud; }
    public LocalDateTime getTimestamp() { return timestamp; }

    public Transaction(String transactionId,
                       String senderAccount,
                       String receiverAccount,
                       double amount,
                       String transactionType,
                       String location,
                       String device,
                       int riskScore,
                       boolean fraud,
                       LocalDateTime timestamp) {

        this.transactionId = transactionId;
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.amount = amount;
        this.transactionType = transactionType;
        this.location = location;
        this.device = device;
        this.riskScore = riskScore;
        this.fraud = fraud;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "\nTransaction ID: " + transactionId +
                "\nType: " + transactionType +
                "\nSender: " + senderAccount +
                "\nReceiver: " + receiverAccount +
                "\nAmount: " + amount +
                "\nLocation: " + location +
                "\nDevice: " + device +
                "\nRisk Score: " + riskScore +
                "\nFraud: " + fraud +
                "\nTime: " + timestamp +
                "\n-----------------------------";
    }
}
