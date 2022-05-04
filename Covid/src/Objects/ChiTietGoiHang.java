/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author ranco
 */
public class ChiTietGoiHang {
    private String maGH;
    private String maSP;
    private int soLuongBan;
    
    public String getMaGH() {
        return maGH;
    }

    public void setMaGH(String maGH) {
        this.maGH = maGH;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public ChiTietGoiHang(String maGH, String maSP, int soLuongBan) {
        this.maGH = maGH;
        this.maSP = maSP;
        this.soLuongBan = soLuongBan;
    }
    
}
