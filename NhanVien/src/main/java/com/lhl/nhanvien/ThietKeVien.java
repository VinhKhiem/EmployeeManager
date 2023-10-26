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
public class ThietKeVien extends NhanVien {
    private double bonus;
    
//    public ThietKeVien() throws ParseException, Exception {
//        
//        this.bonus = parseDouble(sc.nextLine());
//    }

    @Override
    public void nhapNV() throws ParseException, Exception {
        super.nhapNV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print("Nhap luong bonus: ");
        this.bonus = parseDouble(sc.nextLine());
    }

    public ThietKeVien(double bonus, Date ngaySinh, String hoTen, String email, boolean gioiTinh, double luongCB, double hsl) {
        super(ngaySinh, hoTen, email, gioiTinh, luongCB, hsl);
        this.bonus = bonus;
    }

    public ThietKeVien(double bonus, String ngaySinh, String hoTen, String email, boolean gioiTinh, double luongCB, double hsl) throws ParseException {
        super(ngaySinh, hoTen, email, gioiTinh, luongCB, hsl);
        this.bonus = bonus;
    }

    public ThietKeVien() {
    }
    

    

    @Override
    public double tinhLuong() {
        this.luong = this.luongCoBan*this.heSoLuong + this.bonus;
        return this.luong; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void hienThiNhanVien() {
        System.out.println("==THIET KE VIEN==");
        super.hienThiNhanVien(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("Luong bonus: %.1f\n", this.bonus);
    }
    
    
    
    
    
    

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
