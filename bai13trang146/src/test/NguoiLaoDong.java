/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public abstract class NguoiLaoDong {
    protected String hoten;
    protected String diachi;
    protected String loailaodong;
//    protected double luongthang;
    
    public NguoiLaoDong(String hoten,String diachi,String loailaodong){
        this.hoten=hoten;
        this.diachi=diachi;
        this.loailaodong=loailaodong;
//        this.luongthang=luongthang;   
    }
    public void setHoten(String hoten){
        this.hoten=hoten;
    }
    public String getHoten(){
        return hoten;
    }
     public void setDiachi(String diachi){
        this.diachi=diachi;
    }
    public String getDiachi(){
        return diachi;
    }
     public void setLoailaodong(String loailaodong){
        this.loailaodong=loailaodong;
    }
    public String getLoailaodong(){
        return loailaodong;
    }
//    public void setLuongthang(double luongthang){
//        this.luongthang=luongthang;
//    }
//    public double getLuongthang(){
//        return luongthang;
//    }
    
    public abstract double tinhLuong();
    
    public void nhapthongtin(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap ho ten:"+ hoten);
        hoten=scanner.nextLine();
        System.out.print("Nhap dia chi:"+ diachi);
        diachi=scanner.nextLine();
        System.out.print("Nhap loai lao dong:"+ loailaodong);
        loailaodong=scanner.nextLine();
//        System.out.print("Nhap luong thang:"+ luongthang);
//        luongthang=scanner.nextDouble();
    }
    public void inthongtin(){
        System.out.print("Ho Ten"+hoten);
        System.out.print("Dia Chi"+diachi);
        System.out.print("Loai Lao Dong"+loailaodong);
//        System.out.print("Luong Thang"+luongthang);
    }
}
