/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author ranco
 */
public class MuaGoiHang {
    private String maNV;
    private String tenGH;
    private int soLuong;
    private int giaGH;
    private String thoiGian;
    
    
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenGH() {
        return tenGH;
    }

    public void setTenGH(String tenGH) {
        this.tenGH = tenGH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaGH() {
        return giaGH;
    }

    public void setGiaGH(int giaGH) {
        this.giaGH = giaGH;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public MuaGoiHang(String maNV, String tenGH, int soLuong, int giaGH, String thoiGian) {
        this.maNV = maNV;
        this.tenGH = tenGH;
        this.soLuong = soLuong;
        this.giaGH = giaGH;
        this.thoiGian = thoiGian;
    }
    
}
