package com.fraud.simulation;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("===== DIGITAL BANK FRAUD SIMULATION ENGINE =====");
        for (int i = 1; i <= 2; i++) {

            Transaction t = TransactionGenerator.generateTransaction();

            System.out.println(t);

            TransactionDAO.saveTransaction(t);

            Thread.sleep(1000);
        }

    }
}
