package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.MySQLConnection;
import dto.LoginDto;

public class LoginDao {
	public int checkLogin(LoginDto loginDto) {
		Connection connection = MySQLConnection.getConnection();
		String sql = "select * from users where email = ? and password = ?";
		int count = 0;
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, loginDto.getEmail());
			statement.setString(2, loginDto.getPassword());
			ResultSet result = statement.executeQuery();
			while (result.next())
				count = result.getRow();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
}
