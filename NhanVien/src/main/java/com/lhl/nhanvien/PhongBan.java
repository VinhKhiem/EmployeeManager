/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhl.nhanvien;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class PhongBan {
    private String tenPhongBan;
    private ArrayList<NhanVien> nhanVienTrucThuoc = new ArrayList<>();
    private NhanVienDacBiet nhanVienQL;
    
    public PhongBan(String tenPB, NhanVienDacBiet q) {
        this.tenPhongBan = tenPB;
        this.nhanVienQL = q;
    }
    
    public void themNVTT(NhanVien q) {
        this.nhanVienTrucThuoc.add(q);
    }
    
    public void hienThiNVTT() {
        this.nhanVienTrucThuoc.forEach(h -> h.hienThiNhanVien());
    }
    
    public void hienThiPhongBan() {
        System.out.printf("Ten phong ban: %s\n", this.tenPhongBan);
        System.out.printf("Nhan vien quan ly: %s\n", this.nhanVienQL.getHoTen());
    }

    /**
     * @return the tenPhongBan
     */
    public String getTenPhongBan() {
        return tenPhongBan;
    }

    /**
     * @param tenPhongBan the tenPhongBan to set
     */
    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    /**
     * @return the nhanVienTrucThuoc
     */
    public ArrayList<NhanVien> getNhanVienTrucThuoc() {
        return nhanVienTrucThuoc;
    }

    /**
     * @param nhanVienTrucThuoc the nhanVienTrucThuoc to set
     */
    public void setNhanVienTrucThuoc(ArrayList<NhanVien> nhanVienTrucThuoc) {
        this.nhanVienTrucThuoc = nhanVienTrucThuoc;
    }

    /**
     * @return the nhanVienQL
     */
    public NhanVienDacBiet getNhanVienQL() {
        return nhanVienQL;
    }

    /**
     * @param nhanVienQL the nhanVienQL to set
     */
    public void setNhanVienQL(NhanVienDacBiet nhanVienQL) {
        this.nhanVienQL = nhanVienQL;
    }

    /**
     * @return the nhanVienQL
     */
    
    
}
