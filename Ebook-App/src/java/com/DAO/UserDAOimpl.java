/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;

import com.entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Abdul Rafay
 */
public class UserDAOimpl implements UserDAO {

    private Connection conn;

    public UserDAOimpl(Connection conn) {
        super();
        this.conn = conn;
    }

    @Override
    public boolean userRegister(User us) {
        boolean f = false;

        try {
            String sql = "insert into user(name,Email,PhoneNumber,Password) values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, us.getName());
            ps.setString(2, us.getEmail());
            ps.setString(3, us.getPhoneNumber());
            ps.setString(4, us.getPassword());

            int i = ps.executeUpdate();
            if (i == 1) {
                f = true;
            }

        } catch (Exception e) {
            System.err.println("Error registering user: " + e.getMessage());
        }

        return f;
     
    }

    
    public User login(String email, String password){

        User us = null;

        try {
            String sql = "select * from user where Email=? and password=?";
            
	    PreparedStatement ps=conn.prepareStatement(sql);
	    ps.setString(1, email);
      	    ps.setString(2, password);

            ResultSet rs=ps.executeQuery();
   	    while(rs.next())
            {
		us=new User();
		us.setID(rs.getInt(1));
		us.setName(rs.getString(2));		
		us.setEmail(rs.getString(3));
		us.setPhoneNumber(rs.getString(4));
		us.setPassword(rs.getString(5));
		us.setAddress(rs.getString(6));
		us.setLandmark(rs.getString(7));
		us.setCity(rs.getString(8));
		us.setState(rs.getString(9));
		us.setZip(rs.getString(10));
	   }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return us;
    
}
}
