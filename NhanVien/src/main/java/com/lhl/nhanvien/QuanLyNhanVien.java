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
public class QuanLyNhanVien {
    private ArrayList<NhanVien> quanLyNV = new ArrayList<>();

    public double tinhLuong(NhanVien q) {
        return this.quanLyNV.stream().filter(h -> h.getId() == q.getId()).findFirst().get().tinhLuong();
    }
    /**
     * @return the quanLyNV
     */
    public ArrayList<NhanVien> getQuanLyNV() {
        return quanLyNV;
    }
    
    public void themNhanVien(NhanVien q) {
        this.quanLyNV.add(q);
    }
    
    public void hienThiDSNV() {
        this.quanLyNV.forEach(h -> h.hienThiNhanVien());
    }

    /**
     * @param quanLyNV the quanLyNV to set
     */
    public void setQuanLyNV(ArrayList<NhanVien> quanLyNV) {
        this.quanLyNV = quanLyNV;
    }
}
