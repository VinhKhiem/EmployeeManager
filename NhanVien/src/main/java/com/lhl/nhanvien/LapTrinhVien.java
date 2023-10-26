/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhl.nhanvien;

import static CauHinh.CauHinh.sc;
import static java.lang.Double.parseDouble;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author USER
 */
public class LapTrinhVien extends NhanVien {
    private double luongOT;

    @Override
    public void nhapNV() throws ParseException, Exception {
        super.nhapNV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print("Nhap luong overtime: ");
        this.luongOT = parseDouble(sc.nextLine());
    }

    public LapTrinhVien(double luongOT, Date ngaySinh, String hoTen, String email, boolean gioiTinh, double luongCB, double hsl) {
        super(ngaySinh, hoTen, email, gioiTinh, luongCB, hsl);
        this.luongOT = luongOT;
    }

    public LapTrinhVien(double luongOT, String ngaySinh, String hoTen, String email, boolean gioiTinh, double luongCB, double hsl) throws ParseException {
        super(ngaySinh, hoTen, email, gioiTinh, luongCB, hsl);
        this.luongOT = luongOT;
    }

    public LapTrinhVien() {
    }
    
    
    

    

    @Override
    public double tinhLuong() {
//        this.luong = super.tinhLuong() + this.luongOT;
        this.luong = this.luongCoBan*this.heSoLuong + this.luongOT;
        return this.luong; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void hienThiNhanVien() {
        System.out.println("==LAP TRINH VIEN");
        super.hienThiNhanVien(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("Luong overtime: %.1f\n", this.luongOT);
    }
    
    
    
    
    
    

    /**
     * @return the luongOT
     */
    public double getLuongOT() {
        return luongOT;
    }

    /**
     * @param luongOT the luongOT to set
     */
    public void setLuongOT(double luongOT) {
        this.luongOT = luongOT;
    }
    
}
