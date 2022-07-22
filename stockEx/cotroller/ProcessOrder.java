/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stockEx.cotroller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import stockEx.Order;

/**
 *
 * @author Admin
 */
public class ProcessOrder {

   public void insert(Connection conn, Order ord) {
        String insertQuery = "INSERT INTO Order (type,  sIDStock,  sIDTrader,  amount, price) "
                + " VALUES(?,?,?,?,?);";
        if (conn != null) {
            try {
                PreparedStatement prest = conn.prepareStatement(insertQuery); 
                prest.setInt(1, ord.getType());
                prest.setString(2, ord.getsIDStock()); 
                prest.setString(3, ord.getsIDTrader());
                prest.setInt(4, ord.getAmount());
                prest.setFloat(5, ord.getPrice());
                prest.executeUpdate();

                prest.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
