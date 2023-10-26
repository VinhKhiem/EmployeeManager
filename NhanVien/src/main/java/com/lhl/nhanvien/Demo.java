/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhl.nhanvien;

//import static CauHinh.CauHinh.sc;
import java.text.ParseException;

/**
 *
 * @author ngvin
 */
public class Demo {
    public static void main(String[] args) throws ParseException, ClassNotFoundException, InstantiationException, IllegalAccessException, Exception {
        NhanVien nv1 = new LapTrinhVien(2000, "25/06/1998", "Tran Van A", "a12@gmail.com", true, 25000, 2);
//        NhanVien nv2 = new LapTrinhVien(2400, "27/06/1990", "Tran Van B", "ab12@gmail.com", true, 25000, 2);
        DuAn da = new DuAn("Du an 1", "30/05/2017", "30/05/2023", 120000, nv1);
//        da.themNhanVienTG(10);
//        da.themNhanVienTG(nv2);
//        System.out.println(nv1.getClass());
        da.themNhanVienTG(5);
        nv1.themDuAnTG(da);
        nv1.hienThiDuAnTG();
        
    }
    
}
