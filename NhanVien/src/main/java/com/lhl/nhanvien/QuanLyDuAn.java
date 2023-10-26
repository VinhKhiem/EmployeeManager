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
public class QuanLyDuAn {
    private ArrayList<DuAn> quanLyDA = new ArrayList<>();
    
    public void themDuAn(DuAn q) {
        this.quanLyDA.add(q);
    }
    
    public void xoaDuAn(DuAn q) {
        this.quanLyDA.remove(q);
    }
    
    public void suaDuAn(DuAn q) throws Exception {
        this.quanLyDA.stream().filter(h -> h.getId() == q.getId()).findFirst().get().nhapDuAN();
    }
    
    public void hienThiDuAn() {
        this.quanLyDA.forEach(h -> h.hienThiDuAn());
    }
    
//    public ArrayList<DuAn> timKiem(DuAn q) {
//        
//    }

    /**
     * @return the quanLyDA
     */
    public ArrayList<DuAn> getQuanLyDA() {
        return quanLyDA;
    }

    /**
     * @param quanLyDA the quanLyDA to set
     */
    public void setQuanLyDA(ArrayList<DuAn> quanLyDA) {
        this.quanLyDA = quanLyDA;
    }
}
