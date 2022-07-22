/*
 * GumBox Inc
 * (c) 2022 GumBox Inc. All rights reserved.
 * address: Viet Nam
 * This software is the confidential and proprietary
 * information of GumBox, Inc
 * ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it
 * only in
 * accordance with the terms of the license agreement you
 * entered into
 * with GumBox
 */
package stockEx;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author falcon
 */
public class JDBC {

	public void insert(Connection conn) {
		String sql = "INSERT INTO Orders (type_stock, sIDStock, sIDTrader, amount, price)" + " VALUES (?, ?, ?, ?, ?)";

		int count = 0;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);

			ResultSet result = statement.executeQuery(sql);

			statement.setInt(1, 1);
			statement.setString(2, "VIC");
			statement.setString(3, "Trader1");
			statement.setInt(4, 100);
			statement.setFloat(5, 20.04f);

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new user was inserted successfully!");
			}

			statement.setInt(1, 2);
			statement.setString(2, "VND");
			statement.setString(3, "Trader12");
			statement.setInt(4, 2000);
			statement.setFloat(5, 15.04f);
			rowsInserted = statement.executeUpdate();

			if (rowsInserted > 0) {
				System.out.println("A new user was inserted successfully!");
			}

		} catch (

		SQLException e) {

			e.printStackTrace();
		}

	}
}
