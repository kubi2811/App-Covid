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
public class NhanVien {
    private String maNV;
    private String tenNV;
    private String namSinh;
    private String diaChi;
    private String thanhPho;
    private String quan;
    private String phuong;
    private String trangThai;
    private String noiDieuTri;
    private String lienQuan;
    private String lichSuCovid;

    public NhanVien(String maNV, String tenNV, String namSinh, String diaChi, String thanhPho, String quan, String phuong, String trangThai, String noiDieuTri, String lienQuan, String lichSuCovid) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.thanhPho = thanhPho;
        this.quan = quan;
        this.phuong = phuong;
        this.trangThai = trangThai;
        this.noiDieuTri = noiDieuTri;
        this.lienQuan = lienQuan;
        this.lichSuCovid = lichSuCovid;
    }

    public NhanVien() {
    }
    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getPhuong() {
        return phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getNoiDieuTri() {
        return noiDieuTri;
    }

    public void setNoiDieuTri(String noiDieuTri) {
        this.noiDieuTri = noiDieuTri;
    }

    public String getLienQuan() {
        return lienQuan;
    }

    public void setLienQuan(String lienQuan) {
        this.lienQuan = lienQuan;
    }

    public String getLichSuCovid() {
        return lichSuCovid;
    }

    public void setLichSuCovid(String lichSuCovid) {
        this.lichSuCovid = lichSuCovid;
    }
 
    public NhanVien(String maNV) {
        this.maNV = maNV;
    }

    public NhanVien(String maNV,String tenNV) {
        this.tenNV = tenNV;
        this.maNV = maNV;
    }
    
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    
}
