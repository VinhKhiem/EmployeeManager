/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhl.nhanvien;

import static CauHinh.CauHinh.f;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author USER
 */
public class ThanNhan {
    private String tenThanNhan;
    private Date ngaySinh;
    private String moiQuanHe;
    
    public ThanNhan(String ten, Date ngaySinh, String mqh) {
        this.tenThanNhan = ten;
        this.ngaySinh = ngaySinh;
        this.moiQuanHe = mqh;
    }
    
    public ThanNhan(String ten, String ngaySinh, String mqh) throws ParseException {
        this(ten, f.parse(ngaySinh), mqh);
    }
    
    public void hienThiThanNhan() {
        System.out.printf("Ten than nhan: %s\n", this.tenThanNhan);
        System.out.println("Ngay sinh: " + this.ngaySinh);
        System.out.printf("Moi quan he: %s\n", this.moiQuanHe);
    }

    /**
     * @return the tenThanNhan
     */
    public String getTenThanNhan() {
        return tenThanNhan;
    }

    /**
     * @param tenThanNhan the tenThanNhan to set
     */
    public void setTenThanNhan(String tenThanNhan) {
        this.tenThanNhan = tenThanNhan;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the moiQuanHe
     */
    public String getMoiQuanHe() {
        return moiQuanHe;
    }

    /**
     * @param moiQuanHe the moiQuanHe to set
     */
    public void setMoiQuanHe(String moiQuanHe) {
        this.moiQuanHe = moiQuanHe;
    }
}
