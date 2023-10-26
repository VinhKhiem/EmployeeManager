/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhl.nhanvien;

import static CauHinh.CauHinh.f;
import static CauHinh.CauHinh.sc;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER
 */
public class DuAn {
    private int id;
    private String tenDuAn;
    private Date thoiDiemBatDau;
    private Date thoiDiemKetThuc;
    private double tongKinhPhi;
    private NhanVien nguoiChuNhiem;
    private ArrayList<NhanVien> nhanVienTG = new ArrayList<>(); // 5-10
    private int demNVTG = 0;
    
    private static int dem = 0;
    {
        dem++;
        this.id = dem;
    }

    public DuAn(String tenDuAn, Date batDau, Date ketThuc, double tongKP, NhanVien nguoiChuNhiem) {
        this.tenDuAn = tenDuAn;
        this.thoiDiemBatDau = batDau;
        this.thoiDiemKetThuc = ketThuc;
        this.tongKinhPhi = tongKP;
        this.nguoiChuNhiem = nguoiChuNhiem;
    }
    
    public DuAn(String tenDuAn, String batDau, String ketThuc, double tongKP, NhanVien nguoiChuNhiem) throws ParseException {
        this(tenDuAn, f.parse(batDau), f.parse(ketThuc), tongKP, nguoiChuNhiem);
    }
    
    
    public void themNhanVienTG(int SL) throws Exception {
        this.demNVTG+=SL;
        if(this.demNVTG < 5 || this.demNVTG > 10) throw new Exception("So luong nhan vien tham gia khong hop le(5 <= SL <= 10)");
        else {
            for(int i = 0;i < SL; i++) {
                System.out.printf("Nhap loai nhan vien cua nhan vien %d: ", i+1);
                Class<?> clazz  = Class.forName(sc.nextLine());
                NhanVien nv = (NhanVien) clazz.newInstance();
                nv.nhapNV();
                this.nhanVienTG.add(nv);
            }
            System.out.println("Da them nhan vien thanh cong");
        } 
    }
    
    
    public void themNhanVienTG(NhanVien q) throws Exception {
        this.demNVTG++;
        if(this.demNVTG < 5 || this.demNVTG > 10) throw new Exception("So luong nhan vien tham gia khong hop le(5 <= SL <= 10)");
        else this.nhanVienTG.add(q);
    }
    
    public void hienThiDuAn() {
        System.out.printf("Ten du an: %s\n", this.tenDuAn);
        System.out.printf("Ma du an: %d\n", this.id);
        System.out.println("Thoi diem bat dau: " + this.thoiDiemBatDau);
        System.out.println("Thoi diem ket thuc: " + this.thoiDiemKetThuc);
        System.out.printf("Tong kinh phi: %.1f\n", this.tongKinhPhi);
        System.out.printf("Nguoi chu nhiem: %s\n", this.nguoiChuNhiem.getHoTen());
    }
    
    public void hienThiNVTG() {
        this.nhanVienTG.forEach(h -> h.hienThiNhanVien());
    }
    
    public void nhapDuAN() throws ParseException, Exception {
        System.out.print("Nhap ten du an: ");
        this.tenDuAn = sc.nextLine();
        System.out.print("Thoi diem bat dau: ");
        this.thoiDiemBatDau = f.parse(sc.nextLine());
        System.out.print("Thoi diem ket thuc: ");
        this.thoiDiemKetThuc = f.parse(sc.nextLine());
        System.out.print("Tong kinh phi: ");
        this.tongKinhPhi = Double.parseDouble(sc.nextLine());
        System.out.print("Nguoi chu nhiem: ");
        this.nguoiChuNhiem.nhapNV();
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the tenDuAn
     */
    public String getTenDuAn() {
        return tenDuAn;
    }

    /**
     * @param tenDuAn the tenDuAn to set
     */
    public void setTenDuAn(String tenDuAn) {
        this.tenDuAn = tenDuAn;
    }

    /**
     * @return the thoiDiemBatDau
     */
    public Date getThoiDiemBatDau() {
        return thoiDiemBatDau;
    }

    /**
     * @param thoiDiemBatDau the thoiDiemBatDau to set
     */
    public void setThoiDiemBatDau(Date thoiDiemBatDau) {
        this.thoiDiemBatDau = thoiDiemBatDau;
    }

    /**
     * @return the thoiDiemKetThuc
     */
    public Date getThoiDiemKetThuc() {
        return thoiDiemKetThuc;
    }

    /**
     * @param thoiDiemKetThuc the thoiDiemKetThuc to set
     */
    public void setThoiDiemKetThuc(Date thoiDiemKetThuc) {
        this.thoiDiemKetThuc = thoiDiemKetThuc;
    }

    /**
     * @return the tongKinhPhi
     */
    public double getTongKinhPhi() {
        return tongKinhPhi;
    }

    /**
     * @param tongKinhPhi the tongKinhPhi to set
     */
    public void setTongKinhPhi(double tongKinhPhi) {
        this.tongKinhPhi = tongKinhPhi;
    }

    /**
     * @return the nguoiChuNhiem
     */
    public NhanVien getNguoiChuNhiem() {
        return nguoiChuNhiem;
    }

    /**
     * @param nguoiChuNhiem the nguoiChuNhiem to set
     */
    public void setNguoiChuNhiem(NhanVien nguoiChuNhiem) {
        this.nguoiChuNhiem = nguoiChuNhiem;
    }

    /**
     * @return the nhanVienTG
     */
    public ArrayList<NhanVien> getNhanVienTG() {
        return nhanVienTG;
    }

    /**
     * @param nhanVienTG the nhanVienTG to set
     */
    public void setNhanVienTG(ArrayList<NhanVien> nhanVienTG) {
        this.nhanVienTG = nhanVienTG;
    }

    
}
