/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author ranco
 */
public class GoiHang {
    private String maGH;
    private String tenGH;
    private int gioiHanMua;
    private String ngayHetHan;
    private int giaGH;
    
    public String getMaGH() {
        return maGH;
    }

    public void setMaGH(String maGH) {
        this.maGH = maGH;
    }

    public String getTenGH() {
        return tenGH;
    }

    public void setTenGH(String tenGH) {
        this.tenGH = tenGH;
    }

    public int getGioiHanMua() {
        return gioiHanMua;
    }

    public void setGioiHanMua(int gioiHanMua) {
        this.gioiHanMua = gioiHanMua;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public int getGiaGH() {
        return giaGH;
    }

    public void setGiaGH(int giaGH) {
        this.giaGH = giaGH;
    }

    public GoiHang(String maGH, String tenGH, int gioiHanMua, String ngayHetHan, int giaGH) {
        this.maGH = maGH;
        this.tenGH = tenGH;
        this.gioiHanMua = gioiHanMua;
        this.ngayHetHan = ngayHetHan;
        this.giaGH = giaGH;
    }
    
}
