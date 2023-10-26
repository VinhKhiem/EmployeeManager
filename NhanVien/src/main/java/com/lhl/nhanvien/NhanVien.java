/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lhl.nhanvien;

//import static CauHinh.CauHinh.sc;

//import static CauHinh.CauHinh.HE_SO;
//import static CauHinh.CauHinh.LUONG_CO_BAN;
import static CauHinh.CauHinh.f;
import static CauHinh.CauHinh.sc;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author USER
 */
public abstract class NhanVien {
    private int id;
    private Date ngaySinh;
    private String hoTen;
    private boolean gioiTinh;
    private PhongBan phongBan;
    private ArrayList<DuAn> duAnTG = new ArrayList<>();
    private String email;
    protected double luong, luongCoBan, heSoLuong;
    private ArrayList<ThanNhan> thanNhan = new ArrayList<>();
    
    private int demDATG = 0;
    
    private static int dem = 0;
    
    {
        dem++;
        this.id = dem;
    }
    
  
    
    // constructor
    public NhanVien() {
        
    }
    
    public NhanVien(Date ngaySinh, String hoTen, String email, boolean gioiTinh, double luongCB, double hsl) {
        this.ngaySinh = ngaySinh;
        this.hoTen = hoTen;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.luongCoBan = luongCB;
        this.heSoLuong = hsl;
    } 
    
    public NhanVien(String ngaySinh, String hoTen, String email, boolean gioiTinh, double luongCB, double hsl) throws ParseException {
        this(f.parse(ngaySinh), hoTen, email, gioiTinh, luongCB, hsl);
    }
    
    public double tinhLuong() {
        this.luong = this.luongCoBan*this.heSoLuong;
        return this.luong;
    }
    
    public void themThanNhan(ThanNhan q) {
        this.thanNhan.add(q);
    }
    
    public void hienThiThanNhan() {
        this.thanNhan.forEach(h -> h.hienThiThanNhan());
    }
    
    public void themDuAnTG(DuAn q) throws Exception {
        this.demDATG++;
        if(this.demDATG > 3) throw new Exception("Qua gioi han tham gia du an!\n");
        else this.duAnTG.add(q);
    }
    
    public void hienThiDuAnTG() {
        this.duAnTG.forEach(h -> h.hienThiDuAn());
    }
    
    public void nhapNV() throws ParseException, Exception {
        System.out.print("Nhap ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        this.ngaySinh = f.parse(sc.nextLine());
        System.out.print("Nhap email: ");
        this.email = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        String gt = sc.nextLine();
        if(gt.equalsIgnoreCase("Nam")) {
            this.gioiTinh = true;
        } else if(gt.equalsIgnoreCase("Nu")) {
            this.gioiTinh = false;
        } else throw new Exception("Gioi tinh khong hop le!\n");
    }
    
    public void hienThiNhanVien() {
        System.out.printf("Ten nhan vien: %s\n", this.hoTen);
        System.out.printf("Ma nhan vien: %d\n", this.id);
        System.out.println("Ngay sinh: " + this.ngaySinh);
        System.out.print("Gioi tinh: ");
        if(this.gioiTinh) System.out.println("Nam");
        else System.out.println("Nu");
        System.out.printf("Dia chi email: %s\n", this.email);
        System.out.printf("Luong: %.1f\n", this.tinhLuong());
    }
    
    public static void main(String[] args) {

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
    
    public void setNgaySinh(String ngaySinh) throws ParseException {
        this.setNgaySinh(f.parse(ngaySinh));
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the gioiTinh
     */
    public boolean isGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the phongBan
     */
    public PhongBan getPhongBan() {
        return phongBan;
    }

    /**
     * @param phongBan the phongBan to set
     */
    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    /**
     * @return the thanNhan
     */
    public ArrayList<ThanNhan> getThanNhan() {
        return thanNhan;
    }

    /**
     * @param thanNhan the thanNhan to set
     */
    public void setThanNhan(ArrayList<ThanNhan> thanNhan) {
        this.thanNhan = thanNhan;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the duAnTG
     */
    public ArrayList<DuAn> getDuAnTG() {
        return duAnTG;
    }

    /**
     * @param duAnTG the duAnTG to set
     */
    public void setDuAnTG(ArrayList<DuAn> duAnTG) {
        this.duAnTG = duAnTG;
    }
    
}
