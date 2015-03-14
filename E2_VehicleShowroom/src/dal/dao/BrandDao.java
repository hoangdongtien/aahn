/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal.dao;

import common.bean.Brand;
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
public class BrandDao implements BaseDao<Brand>{

    Connection conn;
    PreparedStatement pstmt;
    public BrandDao() throws ClassNotFoundException, SQLException {
        conn = DbUtil.getConnection();
    }
    
    @Override
    public List<Brand> getAll() throws SQLException {
        pstmt = conn.prepareStatement("SELECT * FROM Brand");
        ResultSet rs = pstmt.executeQuery();
        List<Brand> blist = new ArrayList<>();
        
        while(rs.next()) {
            Brand b = new Brand(rs.getInt("BrandId"), rs.getNString("BrandName"), null);
            blist.add(b);
        }
        
        rs.close();
        pstmt.close();        
        return blist;
    }

    @Override
    public void insert(Brand t) throws SQLException {
        pstmt = conn.prepareStatement("INSERT INTO Brand VALUES (?)");
        pstmt.setNString(1, t.getBrandName());
        pstmt.executeUpdate();
        pstmt.close();        
    }

    @Override
    public void update(Brand t) throws SQLException {
        pstmt = conn.prepareStatement("UPDATE Brand SET BrandName=? WHERE BrandId=?");
        pstmt.setNString(1, t.getBrandName());
        pstmt.setInt(2, t.getBrandId());
        pstmt.executeUpdate();
        pstmt.close();   
    }

    @Override
    public Brand getOne(Brand t) throws SQLException {
        pstmt = conn.prepareStatement("SELECT * FROM Brand WHERE BrandId=?");
        pstmt.setInt(1, t.getBrandId());
        ResultSet rs = pstmt.executeQuery();
        Brand b = null;
        
        if(rs.next()) {
            b = new Brand(rs.getInt("BrandId"), rs.getNString("BrandName"), null);
        }
        
        rs.close();
        pstmt.close();        
        return b;
    }

    @Override
    public void delete(Brand t) throws SQLException {
        pstmt = conn.prepareStatement("DELETE FROM Brand WHERE BrandId=?");
        pstmt.setInt(1, t.getBrandId());
        pstmt.executeUpdate();
        pstmt.close();
    }
    
}
