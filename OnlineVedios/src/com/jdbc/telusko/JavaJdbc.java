package com.jdbc.telusko;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*import java.sql.*
 * ctrl+click --used to go to insie the method
 * Load the driver by mysql connector dependencies or downloading jar file
 * add tht jar file by right click and configure build path-->add external jar files
 * Load and register Driver---class.forName(com.mysql.jdbc.driver)--for register
 * establish the  the connection
 * cretae the statement
 * execute the statement
 * process the transaction
 * close the connection
 * */
//DAO--Data Acess Object
public class JavaJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.driver");
		String url = "jdbc:mysql//localhost:3306//alieans";
		String userName = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select *from alieans");
		// rs.next();//point the nesxt column and in while loop if its there--return
		// true/for not there--false
		String queery = "select username from alienans where rolln0=1";
		// System.out.println(rs.getString("username"));

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
			// 1//colunmn number--for index--1
			// 2//index number for username--2
		}

		String insertvalue = "insert into alien(userid,firstname,lastname) values(1,'fgh','pink')";
		int count = st.executeUpdate(insertvalue);// how many rows are effected
		int userid = 1;
		String username = "";
		String lastname = "";
		String insertrecords = "insert into alien	values(" + userid + ",'" + username + "','" + lastname + "')";
		String preparedrecords = "insert into alien values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(preparedrecords);
		pst.setInt(1, userid);
		pst.setString(2, username);
		pst.setString(3, lastname);
		pst.close();
		con.close();
	}
}
