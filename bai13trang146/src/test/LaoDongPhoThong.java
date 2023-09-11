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
public class LaoDongPhoThong extends NguoiLaoDong {
    private int songay;
    private double dongia;

    public LaoDongPhoThong() {
        super("", "", "");
    }
    
    public LaoDongPhoThong(String hoten,String diachi,String loailaodong,int songay,double dongia){
        super(hoten,diachi,loailaodong);
        this.songay=songay;
        this.dongia=dongia;
    }
    @Override
    public double tinhLuong(){
        double thuong;
        if(songay>=25){
            thuong = 1000000;
            }
        else if (15<songay&&songay<25){
                    thuong = 700000;
                    }
        else {
            thuong = 0;
        }
        return songay*dongia + thuong;
    }
    @Override
    public void nhapthongtin(){
        super.nhapthongtin();
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap so ngay cong :"+songay);
        songay=scanner.nextInt();
        System.out.print("Nhap don gia ngay cong"+dongia);
        dongia=scanner.nextDouble();
    }
    public void xuattieude(){
        System.out.printf("%-25s%-25s%-25s%-25s","Ho Ten","Dia Chi","Loai Lao Dong","Luongthang");
    }
    @Override
    public void inthongtin(){
        System.out.printf("%-25s%-25s%-25s%-25f",super.getHoten(),super.getDiachi(),super.getLoailaodong(),tinhLuong());
        System.out.println();
    }      
}
