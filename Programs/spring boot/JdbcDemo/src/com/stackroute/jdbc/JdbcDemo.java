package com.stackroute.jdbc;

public class JdbcDemo {
public static void main(String[]args) {
	Circle circle=new JdbcDaoImpll().getCircle(1);
	System.out.println(circle.getName());
	
}
}
