/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author Ranco
 */
public class SanPham {

    protected String maSP;
    protected String tenSP;
    protected String donVi;
    protected float donGia;
    protected int soLuong;
    
    public SanPham(String maSP, String tenSP, String donVi, float donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donVi = donVi;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    
    
    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }
    

    public SanPham() {
    }

    

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
