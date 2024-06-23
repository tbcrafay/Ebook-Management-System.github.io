/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;

import java.sql.Connection;
import com.entity.BookDtls;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl implements BookDAO {

    private Connection conn;

    public BookDAOImpl(Connection conn) {
        super();
        this.conn = conn;
    }

    public boolean addBooks(BookDtls b) {
        boolean f = false;
        try {
            String sql = "insert into book_dtls(bookname,author,price,bookCategory,status,photo,user_email) values(?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, b.getBookName());
            ps.setString(2, b.getAuthor());
            ps.setString(3, b.getPrice());
            ps.setString(4, b.getBookCategory());
            ps.setString(5, b.getStatus());
            ps.setString(6, b.getPhoto());
            ps.setString(7, b.getEmail());

            int i = ps.executeUpdate();

            if (i == 1) {
                f = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f;
    }

    public List<BookDtls> getAllBooks() {

        List<BookDtls> list = new ArrayList<BookDtls>();
//        int counter = 1;
//        BookDtls b = null;

        try {
            String sql = "select * from book_dtls";
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BookDtls b = new BookDtls(rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
//                b = new BookDtls();
//                b.setBookId(rs.getInt(1));
//                b.setBookName(rs.getString(2));
//                b.setAuthor(rs.getString(3));
//                b.setPrice(rs.getString(4));
//                b.setBookCategory(rs.getString(5));
//                b.setStatus(rs.getString(6));
//                b.setPhoto(rs.getString(7));
//                b.setEmail(rs.getString(8));
                list.add(b);
//                counter++;
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        return list;
    }
}
