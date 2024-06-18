/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;
import com.entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author Abdul Rafay
 */
public class UserDAOimpl implements UserDAO{
    
    private Connection conn;
    
    public UserDAOimpl(Connection conn) {
	super();
	this.conn = conn;
    }
    
    @Override
    public boolean userRegister(User us) {
     boolean f=false;

     try {
         String sql="insert into user(name,Email,PhoneNumber,Password) values(?,?,?,?)";
	 PreparedStatement ps=conn.prepareStatement(sql);
	 ps.setString(1, us.getName());
	 ps.setString(2, us.getEmail());
	 ps.setString(3, us.getPhoneNumber());
 	 ps.setString(4, us.getPassword());

	 int i=ps.executeUpdate();
	 if(i==1)
	 {
	    f = true;
	 }
         
         
     } catch (Exception e) {
  	  System.err.println("Error registering user: " + e.getMessage());
     }

     return f;
}
}
