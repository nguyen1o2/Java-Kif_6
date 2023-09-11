/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai1;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class NHANVIEN {
    protected String maNV,hoTen,soDT,email;
    protected long luongCoBan;
    static Scanner sc=new Scanner(System.in);
    public void Nhap(){
        System.out.print("Nhap maNV: ");
        maNV=sc.nextLine();
        System.out.print("Nhap hoTen: ");
        hoTen=sc.nextLine();
        System.out.print("Nhap soDT: ");
        soDT=sc.nextLine();
        System.out.print("Nhap email: ");
        email=sc.nextLine();
        System.out.print("Nhap luongCoBan: ");
        luongCoBan=sc.nextLong();
    }
    @Override
    public String toString(){
        return maNV+" "+hoTen+" "+soDT+" "+email+" "+luongCoBan;
    }
}
