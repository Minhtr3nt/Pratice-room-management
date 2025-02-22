/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author abccc
 */
public abstract class ThietBi implements Serializable {
    private String MaTb;
    private TaiKhoan tk = new TaiKhoan();
    private String TenTb;
    private int SoLuong;
    private int NamSX; 
    private String LoaiThietBi;
    private String GhiChu;

    public ThietBi() {
    }
    

    public ThietBi(String MaTb,String TenDN, String MatKhau, String TenTb, int SoLuong, int NamSX , String LoaiThietBi, String GhiChu) {
        this.MaTb = MaTb;
        this.TenTb = TenTb;
        this.SoLuong = SoLuong;
        this.NamSX = NamSX;
        this.GhiChu = GhiChu;
        this.LoaiThietBi = LoaiThietBi;
        this.tk.setTenDN(TenDN);
        this.tk.setMatKhau(MatKhau);
    }
    public String getTenDN() {
        return tk.getTenDN();
    }
    public String getMatKhau(){
        return tk.getMatKhau();
    }
    public void setTk(String TenDN, String MatKhau) {
        this.tk.setMatKhau(MatKhau); 
        this.tk.setTenDN(TenDN);
    }
    public String getMaTb() {
        return MaTb;
    }

    public String getTenTb() {
        return TenTb;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public int getNamSX() {
        return NamSX;
    }

    public String getGhiChu() {
        return GhiChu;
    }
    public String getLoaiThietBi() {
        return LoaiThietBi;
    }

    public void setMaTb(String MaTb) {
        this.MaTb = MaTb;
    }

    public void setTenTb(String TenTb) {
        this.TenTb = TenTb;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setNamSX(int NamSX) {
        this.NamSX = NamSX;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    public void setLoaiThietBi(String LoaiThietBi){
        this.LoaiThietBi = LoaiThietBi;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.MaTb);
        hash = 59 * hash + Objects.hashCode(this.tk);
        hash = 59 * hash + Objects.hashCode(this.TenTb);
        hash = 59 * hash + this.SoLuong;
        hash = 59 * hash + this.NamSX;
        hash = 59 * hash + Objects.hashCode(this.LoaiThietBi);
        hash = 59 * hash + Objects.hashCode(this.GhiChu);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ThietBi other = (ThietBi) obj;
        if (this.SoLuong != other.SoLuong) {
            return false;
        }
        if (this.NamSX != other.NamSX) {
            return false;
        }
        if (!Objects.equals(this.MaTb, other.MaTb)) {
            return false;
        }
        if (!Objects.equals(this.TenTb, other.TenTb)) {
            return false;
        }
        if (!Objects.equals(this.LoaiThietBi, other.LoaiThietBi)) {
            return false;
        }
        if (!Objects.equals(this.GhiChu, other.GhiChu)) {
            return false;
        }
        return Objects.equals(this.tk, other.tk);
    }

    @Override
    public String toString() {
        return "ThietBi{" + "MaTb=" + MaTb + ", tk=" + tk + ", TenTb=" + TenTb + ", SoLuong=" + SoLuong + ", NamSX=" + NamSX + ", LoaiThietBi=" + LoaiThietBi + ", GhiChu=" + GhiChu + '}';
    }

    public String getDanhGia() {
       return "";
    }

    

    
    
    
    
}
