package com.xworkz.ticket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class TicketInsertion {

	public static void main(String[] args){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class is  loaded");
			String username="root";
			String password="Sql@#meg4$";
			String url="jdbc:mysql://localhost:3306/ticket";
			
			Connection connection=DriverManager.getConnection(url, username, password);
			System.out.println("Connection is created "+connection);
			String insertQuery="insert into Movie_Ticket(TICKET_ID,ROW_NO,COLUMN_NO,PERSON_NAME,TICKET_TYPE,TICKET_FOR) \r\n"
					+ "values(10,21,24,'MeghaMandara','AGG','FAMILY_MOVIES')";
			
			Statement statement = connection.createStatement();

			int rowsAffected = statement.executeUpdate(insertQuery);
			System.out.println(" 1 row affected:" + rowsAffected);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
