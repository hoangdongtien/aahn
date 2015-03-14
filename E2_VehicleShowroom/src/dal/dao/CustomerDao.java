/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal.dao;

import common.bean.Customer;
import common.util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tien Hoang D
 */
public class CustomerDao implements BaseDao<Customer>{

    Connection conn;
    PreparedStatement pstmt;
    public CustomerDao() throws ClassNotFoundException, SQLException {
        conn = DbUtil.getConnection();
    }
    
    @Override
    public List<Customer> getAll() throws SQLException {
        pstmt = conn.prepareStatement("SELECT * FROM Customer");
        ResultSet rs = pstmt.executeQuery();
        List<Customer> clist = new ArrayList<>();
        
        while(rs.next()) {
            Customer b = new Customer(
                    rs.getInt("CustomerId"),
                    rs.getNString("Address"),
                    rs.getNString("Phone"),
                    rs.getNString("Email"),
                    rs.getNString("Fullname")
            );
            clist.add(b);
        }
        
        rs.close();
        pstmt.close();        
        return clist;
    }

    @Override
    public void insert(Customer t) throws SQLException {
        pstmt = conn.prepareStatement("INSERT INTO Customer VALUES (?,?,?,?)");
        pstmt.setNString(1, t.getAddress());
        pstmt.setNString(2, t.getPhone());
        pstmt.setNString(3, t.getEmail());
        pstmt.setNString(4, t.getFullname());
        
        pstmt.executeUpdate();
        pstmt.close();        
    }

    @Override
    public void update(Customer t) throws SQLException {
        pstmt = conn.prepareStatement("UPDATE Customer SET Address=?, Phone=?, Email=?, Fullname=? WHERE CustomerId=?");
        pstmt.setNString(1, t.getAddress());
        pstmt.setNString(2, t.getPhone());
        pstmt.setNString(3, t.getEmail());
        pstmt.setNString(4, t.getFullname());
        pstmt.setInt(5, t.getCustomerId());
        pstmt.executeUpdate();
        pstmt.close();   
    }

    @Override
    public Customer getOne(Customer t) throws SQLException {
        pstmt = conn.prepareStatement("SELECT * FROM Customer WHERE CustomerId=?");
        pstmt.setInt(1, t.getCustomerId());
        ResultSet rs = pstmt.executeQuery();
        Customer b = null;
        
        if(rs.next()) {
             b = new Customer(
                    rs.getInt("CustomerId"),
                    rs.getNString("Address"),
                    rs.getNString("Phone"),
                    rs.getNString("Email"),
                    rs.getNString("Fullname")
            );
        }
        
        rs.close();
        pstmt.close();        
        return b;
    }

    @Override
    public void delete(Customer t) throws SQLException {
        pstmt = conn.prepareStatement("DELETE FROM Customer WHERE CustomerId=?");
        pstmt.setInt(1, t.getCustomerId());
        pstmt.executeUpdate();
        pstmt.close();
    }
    
}
