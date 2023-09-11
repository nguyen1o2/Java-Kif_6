/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai2;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class SinhVien {
    private String hoTen;
    private Date ngaySinh = new Date() ;
    private Mon[] monHoc;
    private float diemThi;
    private int soMon;
    static Scanner sc = new Scanner(System.in);
    
    public void nhap(){
        System.out.print("Nhap hoTen: ");
        hoTen=sc.nextLine();
        ngaySinh.nhap();
        System.out.print("Nhap soMon: ");
        soMon=sc.nextInt();
        monHoc= new Mon[soMon];
        for(int i=0;i<soMon;i++){
            System.out.println("Nhap thong tin mon thu: "+(i+1));
            monHoc[i]= new Mon();
            monHoc[i].nhap();
            
        }
        System.out.print("Nhap diemThi: ");
            diemThi=sc.nextFloat();
    }
    
    public void inTieuDe(){
        System.out.printf("%15s%15s%15s%15s%15s\n","hoTen","ngaySinh","soMon","mon","diemThi");
    }
    
    public void xuat(){
        System.out.printf("%15.30s%15.15s%15.15s",hoTen,ngaySinh.toString(),soMon);
        for(int i=0;i<soMon;i++){
            monHoc[i].xuat();
        }
    }
}
