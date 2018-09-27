package com.stackroute.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDaoImpll {

public Circle getCircle(int id){
	Connection conn=null;
	try {
	String driver="com.mysql.jdbc.Driver";
	Class.forName(driver).newInstance();
	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/<database_name>");
	//String query="SELECT * FROM Circle where id=?";
	PreparedStatement ps=conn.prepareStatement("SELECT * FROM Circle where id=?");
	//Statement ps=conn.createStatement();
	ps.setInt(1, id);
	Circle circle=null;
	ResultSet rs=ps.executeQuery();
	if(rs.next()) {
		circle=new Circle(id,rs.getString("name"));
	}
	rs.close();
	ps.close();
	return circle;
}
	catch(Exception e) {
		throw new RuntimeException(e);
	}
	finally {
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

}
