package com.in28minutes.springboot.web.springbootfirstwebapplication.newLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class checkLogin {

	public String name;
	public String pass;
	public String ConfirmPass;

	public void insert(String name, String pass, String ConfirmPass) throws Exception {

		try {
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/pass?autoReconnect=true&useSSL=false", "root", "Patna@2022");
			if (con != null) {
				System.out.println("Connected");
			}

			String s = "INSERT INTO updatePass(nam,pass,conPass) VALUES(?,?,?)";
			PreparedStatement ptmt = con.prepareStatement(s);

			ptmt.setString(1, name);
			ptmt.setString(2, pass);
			ptmt.setString(3, ConfirmPass);

			ptmt.executeUpdate();

			System.out.println("Done the querry");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public boolean passcheck() { // System.out.println(name + " " + pass + " " +ConfirmPass);
		if (pass.length() == ConfirmPass.length()) {
			return true;
		} else
			return false;
	}

	public List<String> save() {
		List<String> li = new ArrayList<>();
		li.add(name);
		li.add(pass);
		return li;
	}

	{
		System.out.println(name + " " + pass);
	}
}
