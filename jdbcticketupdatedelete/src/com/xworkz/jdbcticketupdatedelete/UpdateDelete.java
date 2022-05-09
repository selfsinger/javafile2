package com.xworkz.jdbcticketupdatedelete;

import java.sql.*;

public class UpdateDelete {

	public static void main(String[] args) {
		String username = "root";
		String password = "Sql@#meg4$";
		String url = "jdbc:mysql://localhost:3306/ticket";

		try (Connection connection = DriverManager.getConnection(url, username, password);

				Statement statement = connection.createStatement()) {
			String update = "update Movie_Ticket set ROW_NO=13  where TICKET_ID=1";
			long rows = statement.executeUpdate(update);
			System.out.println("rows affected" + rows);
			String deleteQuery = "delete from Movie_Ticket where TICKET_ID=6";
			rows = rows + statement.executeLargeUpdate(deleteQuery);
			System.out.println("query is updated and deleted");

		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
