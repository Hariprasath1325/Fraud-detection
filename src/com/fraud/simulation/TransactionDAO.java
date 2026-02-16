
package com.fraud.simulation;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TransactionDAO {

    public static void saveTransaction(Transaction t) {

        String sql = "INSERT INTO transactions " +
                "(transaction_id, sender_account, receiver_account, amount, " +
                "transaction_type, location, device, risk_score, fraud, timestamp) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, t.getTransactionId());
            ps.setString(2, t.getSenderAccount());
            ps.setString(3, t.getReceiverAccount());
            ps.setDouble(4, t.getAmount());
            ps.setString(5, t.getTransactionType());
            ps.setString(6, t.getLocation());
            ps.setString(7, t.getDevice());
            ps.setInt(8, t.getRiskScore());
            ps.setBoolean(9, t.isFraud());
            ps.setObject(10, t.getTimestamp());

            ps.executeUpdate();

            System.out.println("Transaction Saved to Database");

        } catch (Exception e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}
