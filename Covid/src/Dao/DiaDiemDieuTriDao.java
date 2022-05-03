/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Connect.JDBCConnection;
import Objects.DiaDiem;
import Objects.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ranco
 */
public class DiaDiemDieuTriDao {
    public static ArrayList<DiaDiem> getAll() {
        ArrayList<DiaDiem> ddList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "SELECT * FROM DiaDiemDieuTri;";
            pre = conn.prepareStatement(sql);
            rs = pre.executeQuery();
            while (rs.next()) {
                DiaDiem dd = new DiaDiem(rs.getString("ten"), rs.getInt("soLuongHienTai"), rs.getInt("sucChua"));
                ddList.add(dd);
            }
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
        return ddList;
    }
    public static void insert(DiaDiem dd) {
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "INSERT INTO DiaDiemDieuTri VALUES (?, ?, ?)";
            pre = conn.prepareStatement(sql);
            
            pre.setString(1, dd.getTen());
            pre.setInt(2, dd.getSoLuongHienTai());
            pre.setInt(3, dd.getSucChua());
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
    
    public static void update(DiaDiem dd) {
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "update DiaDiemDieuTri set soLuongHienTai = ?, sucChua = ? where ten = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(3, dd.getTen());
            pre.setInt(1, dd.getSoLuongHienTai());
            pre.setInt(2, dd.getSucChua());

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
    
    public static void updatePlus(String ten) {
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "update DiaDiemDieuTri set soLuongHienTai = soLuongHienTai + 1 where ten = ?";
            pre = conn.prepareStatement(sql);
            pre.setNString(1, ten);
//            pre.setInt(1, dd.getSoLuongHienTai());
//            pre.setInt(2, dd.getSucChua());

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
    
    public static void updateMinus(String ten) {
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "update DiaDiemDieuTri set soLuongHienTai = soLuongHienTai - 1 where ten = ?";
            pre = conn.prepareStatement(sql);
            pre.setNString(1, ten);
//            pre.setInt(1, dd.getSoLuongHienTai());
//            pre.setInt(2, dd.getSucChua());

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
    
    public static void delete(String ten) {
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "delete from DiaDiemDieuTri where ten = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, ten);

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
    
    public static ArrayList<String> getAllTen() {
        ArrayList<String> ddList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "SELECT ten FROM DiaDiemDieuTri;";
            pre = conn.prepareStatement(sql);
            rs = pre.executeQuery();
            while (rs.next()) {
                ddList.add(rs.getString("ten"));
            }
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
        return ddList;
    }
}
