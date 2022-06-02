package com.xworkz.batch.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.xworkz.batch.constants.BatchSqlProperties.*;
import com.xworkz.batch.dto.BatchDTO;

public class BatchDAOImpl implements BatchDAO {

	@Override
	public boolean save(BatchDTO dto) {
		String insert = "insert into batch_details values(?,?,?,?)";
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				PASSWORD.getValue()); PreparedStatement statement = connection.prepareStatement(insert)) {

			System.out.println("inserting sql:" + insert);
			System.out.println("save method");
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getCourseName());
			statement.setString(3, dto.getStartDate().toString());
			statement.setInt(4, dto.getFees());

			
			int rowsAffected = statement.executeUpdate();
			System.out.println("rows requested:" + rowsAffected);

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}

}
