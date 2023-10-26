/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhl.nhanvien;

import static CauHinh.CauHinh.sc;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author USER
 */
public class KiemThuVien extends NhanVien {
    private int error;


    @Override
    public void nhapNV() throws ParseException, Exception {
        super.nhapNV(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print("Nhap so loi(error): ");
        this.error = Integer.parseInt(sc.nextLine());
    }

    public KiemThuVien(int error, Date ngaySinh, String hoTen, String email, boolean gioiTinh, double luongCB, double hsl) {
        super(ngaySinh, hoTen, email, gioiTinh,luongCB, hsl);
        this.error = error;
    }

    public KiemThuVien(int error, String ngaySinh, String hoTen, String email, boolean gioiTinh,double luongCB, double hsl) throws ParseException {
        super(ngaySinh, hoTen, email, gioiTinh, luongCB, hsl);
        this.error = error;
    }

    public KiemThuVien() {
    }
    
    
  

    @Override
    public double tinhLuong() {
        this.luong = this.luongCoBan*this.heSoLuong + this.error*20000;
        return this.luong; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void hienThiNhanVien() {
        System.out.println("==KIEM THU VIEN==");
        super.hienThiNhanVien(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("So loi: %d\n", this.error);
    }
    
    
    
    
    
    

    /**
     * @return the error
     */
    public int getError() {
        return error;
    }

    /**
     * @param error the error to set
     */
    public void setError(int error) {
        this.error = error;
    }
}
