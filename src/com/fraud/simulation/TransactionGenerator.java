package com.fraud.simulation;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class TransactionGenerator {

    private static final Random random = new Random();

    private static final String[] transactionTypes =
            {"TRANSFER", "WITHDRAW", "DEPOSIT"};

    private static final String[] locations =
            {"Chennai", "Mumbai", "Delhi", "Kolkata", "Foreign"};

    private static final String[] devices =
            {"Mobile", "Laptop", "ATM"};

    public static Transaction generateTransaction() {

        String transactionId = UUID.randomUUID().toString();

        String sender = "ACC" + (10000000 + random.nextInt(90000000));
        String receiver = "ACC" + (10000000 + random.nextInt(90000000));

        String type = transactionTypes[random.nextInt(transactionTypes.length)];
        String location = locations[random.nextInt(locations.length)];
        String device = devices[random.nextInt(devices.length)];

        double amount = 100 + random.nextInt(100000);

        int riskScore = 0;
        boolean fraud = false;

        if (amount > 50000) {
            riskScore += 50;
        }

        if (location.equalsIgnoreCase("Foreign")) {
            riskScore += 40;
        }

        if (device.equalsIgnoreCase("ATM")) {
            riskScore += 10;
        }

        if (riskScore >= 70) {
            fraud = true;
        }

        return new Transaction(
                transactionId,
                sender,
                receiver,
                amount,
                type,
                location,
                device,
                riskScore,
                fraud,
                LocalDateTime.now()
        );
    }
}
