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
public class Kisu extends NguoiLaoDong{
    private double lcb;
    private double hsl;
    private int songay;
    
    public Kisu(String hoten,String diachi,String loailaodong,double lcb,double hsl,int songay){
        super(hoten,diachi,loailaodong);
        this.hsl=hsl;
        this.lcb=lcb;
        this.songay=songay;
    }
    @Override
    public double tinhLuong(){
         double thuong;
        if(songay>=25){
            thuong = 2000000;
            }
        else if (15<songay&&songay<25){
                    thuong = 1000000;
                    }
        else {
            thuong = 500000;
        }
        return lcb*hsl +thuong;
    }
    @Override
    public void nhapthongtin(){
        super.nhapthongtin();
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap luong co ban :"+ lcb);
        lcb=scanner.nextDouble();
        System.out.print("Nhap he so luong :"+ hsl);
        hsl=scanner.nextDouble();
        System.out.print("Nhap so ngay cong :"+ songay);
        songay=scanner.nextInt();       
    }
    public void xuattieude(){
        System.out.printf("%-25s%-25s%-25s%-25s","Ho Ten","Dia Chi","Loai Lao Dong","Luong Thang");
    }
    @Override
    public void inthongtin(){
        System.out.printf("%-25s%-25s%-25s%-25s",super.getHoten(),super.getDiachi(),super.getLoailaodong(),tinhLuong());
    }
}
