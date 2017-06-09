/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikacjabazodanowazawansowane;

import java.sql.*;


/**
 *
 * @author Lukasz
 */
public class Connector {
    public Connection polacz(){
        	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Nie znaleziono Drivera ");
		e.printStackTrace();
		
	}

	System.out.println("MySQL JDBC Driver Registered!");
	Connection connection = null;

	try {
		connection = DriverManager
		.getConnection("jdbc:mysql://localhost:3306/test","admin", "");
                System.out.println("Connected to DB");

	} catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		
	}
        return connection;
    }
    
}
