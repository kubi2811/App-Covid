/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Connect.JDBCConnection;
import Objects.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ho Nam
 */
public class NhanVienDao {

    public static List<NhanVien> getAll() {
        List<NhanVien> nvList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "SELECT * FROM NhanVien INNER JOIN TaiKhoan ON NhanVien.maNV=TaiKhoan.maNV where TaiKhoan.quyenTruyCap = 'user';";
            pre = conn.prepareStatement(sql);
            rs = pre.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString("maNV"), rs.getString("tenNV"), rs.getString("namSinh"), rs.getString("diaChi"), rs.getString("thanhPho"), rs.getString("quan"), rs.getString("phuong"), rs.getString("trangThai"), rs.getString("noiDieuTri"), rs.getString("lienQuan"), rs.getString("lichSuCovid"));
                nvList.add(nv);
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
        return nvList;
    }

    public static void insert(NhanVien nv) {
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = JDBCConnection.getConnection();
            String passDefault = "password";
//            String sql = "insert into NhanVien values(?,?,?,?,?)";
            String sql = "INSERT INTO NhanVien VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?); insert into TaiKhoan values(?,?,?,'user')";
//            INSERT INTO NhanVien VALUES (?, ?, null, null, null); insert into TaiKhoan values(?,?,?,?)
            pre = conn.prepareStatement(sql);
            pre.setString(1, nv.getMaNV());
            pre.setString(2, nv.getTenNV());
            pre.setString(3, nv.getNamSinh());
            pre.setString(4, nv.getDiaChi());
            pre.setString(5, nv.getThanhPho());
            pre.setString(6, nv.getQuan());
            pre.setString(7, nv.getPhuong());
            pre.setString(8, nv.getTrangThai());
            pre.setString(9, nv.getNoiDieuTri());
            pre.setString(10, nv.getLienQuan());
            pre.setString(11, nv.getLichSuCovid());
            
            pre.setString(12, nv.getMaNV());
            pre.setString(13, nv.getMaNV());
            pre.setString(14, passDefault);
//            pre.setString(9, nv.getMaNV());

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

    public static void update(NhanVien nv) {
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "update NhanVien set tenNV = ?, namSinh = ?, diaChi = ?, thanhPho = ?, quan = ?, phuong = ?, trangThai = ?, noiDieuTri = ?, lienQuan = ?, lichSuCovid = ? where maNV = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, nv.getTenNV());
            pre.setString(2, nv.getNamSinh());
            pre.setString(3, nv.getDiaChi());
            pre.setString(4, nv.getThanhPho());
            pre.setString(5, nv.getQuan());
            pre.setString(6, nv.getPhuong());
            pre.setString(7, nv.getTrangThai());
            pre.setString(8, nv.getNoiDieuTri());
            pre.setString(9, nv.getLienQuan());
            pre.setString(10, nv.getLichSuCovid());
            
            pre.setString(11, nv.getMaNV());

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

    public static void delete(String maNV) {
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "delete from NhanVien where maNV = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, maNV);

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

    public static List<NhanVien> findByTenNV(String tenNV) {
        List<NhanVien> nvList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        try {
            conn = JDBCConnection.getConnection();
            String sql = "select * from NhanVien where tenNV like ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, "%"+tenNV+"%");
            rs = pre.executeQuery();
            while (rs.next()) {
                NhanVien sp = new NhanVien(rs.getString("maNV"), rs.getString("tenNV"), rs.getString("namSinh"), rs.getString("diaChi"), rs.getString("thanhPho"), rs.getString("quan"), rs.getString("phuong"), rs.getString("trangThai"), rs.getString("noiDieuTri"), rs.getString("lienQuan"), rs.getString("lichSuCovid"));
                nvList.add(sp);
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
        return nvList;
    }

}
