/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhl.nhanvien;

//import static CauHinh.CauHinh.sc;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER
 */
public class NhanVienDacBiet extends NhanVien {

    private Date ngayNhanChuc;
    private ArrayList<PhongBan> PBQL = new ArrayList<>();
    private int demPBQL = 0;

    public NhanVienDacBiet(Date ngayNhanChuc, Date ngaySinh, String hoTen, String email, boolean gioiTinh, double luongCB, double hsl) {
        super(ngaySinh, hoTen, email, gioiTinh, luongCB, hsl);
        this.ngayNhanChuc = ngayNhanChuc;
    }

    public NhanVienDacBiet(Date ngayNhanChuc, String ngaySinh, String hoTen, String email, boolean gioiTinh, double luongCB, double hsl) throws ParseException {
        super(ngaySinh, hoTen, email, gioiTinh, luongCB, hsl);
        this.ngayNhanChuc = ngayNhanChuc;
    }

   

    public void themPBQL(PhongBan q) throws Exception {
        this.demPBQL++;
        if(this.demPBQL < 0 || this.demPBQL > 2) throw new Exception("So phong ban quan li khong hop le!\n");
        else this.PBQL.add(q);
    }

    @Override
    public void hienThiNhanVien() {
        System.out.println("==NHAN VIEN DAC BIET==");
        super.hienThiNhanVien(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Ngay nhan chuc: " + this.ngayNhanChuc);
    }
    
    public void hienThiPBQL() {
        this.PBQL.forEach(h -> h.hienThiPhongBan());
    }
    
    

    /**
     * @return the ngayNhanChuc
     */
    public Date getNgayNhanChuc() {
        return ngayNhanChuc;
    }

    /**
     * @param ngayNhanChuc the ngayNhanChuc to set
     */
    public void setNgayNhanChuc(Date ngayNhanChuc) {
        this.ngayNhanChuc = ngayNhanChuc;
    }

    /**
     * @return the PBQL
     */
    public ArrayList<PhongBan> getPBQL() {
        return PBQL;
    }

    /**
     * @param PBQL the PBQL to set
     */
    public void setPBQL(ArrayList<PhongBan> PBQL) {
        this.PBQL = PBQL;
    }
    
    
}
