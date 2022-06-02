package com.xworkz.institute.dao;

import java.sql.*;

import static com.xworkz.institute.constants.DBConstants.*;
import com.xworkz.institute.dto.CourseDTO;

public class CourseDAOImpl implements CourseDAO {

	@Override
	public boolean save(CourseDTO dto) {
		// System.out.println("saving".concat(dto.toString()));

		String insertQuery = "insert into course_details values(?,?,?,?,?,?)";
		try (Connection con = DriverManager.getConnection(URL.value, USERNAME.value, PASSWORD.value);
				PreparedStatement statement = con.prepareStatement(insertQuery)) {
			System.out.println("inserting sql:" + insertQuery);

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getCourseName());
			statement.setString(3, dto.getDuration().toString());
			statement.setInt(4, dto.getFees());
			statement.setString(5, dto.getStartDate().toString());
			statement.setBoolean(6, dto.getFree());

			int rowsAffected = statement.executeUpdate();
			System.out.println("affected rows:"+rowsAffected);
			return rowsAffected > 0 ? true : false;
			

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
