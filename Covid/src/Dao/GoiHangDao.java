/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Connect.JDBCConnection;
import Objects.GoiHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ranco
 */
public class GoiHangDao {
    public static void insertGH(GoiHang gh) {
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "insert into GoiHang values(?,?,?,?,?)";
            pre = conn.prepareStatement(sql);
            pre.setString(1, gh.getMaGH());
            pre.setString(2, gh.getTenGH());
            pre.setInt(3, gh.getGioiHanMua());
            pre.setString(4, gh.getNgayHetHan());
            pre.setInt(5, gh.getGiaGH());

            pre.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex);
        } finally {
            if (pre != null) {
                try {
                    pre.close();
                } catch (SQLException ex) {
                    System.out.println("Lỗi: " + ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("Lỗi: " + ex);
                }
            }
        }
    }
}
