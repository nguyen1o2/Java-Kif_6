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
public class Mon {
    private String tenMon,hocKy;
    private int soHocTrinh;
    static Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhap tenMon: ");
        tenMon=sc.nextLine();
         System.out.print("Nhap soHocTrinh: ");
        soHocTrinh=sc.nextInt();
         System.out.print("Nhap hocKy: ");
        hocKy=sc.nextLine();
    }
    
    public void xuat(){
        System.out.printf("%15.15s%15.15s%15.15s\n",tenMon,soHocTrinh,hocKy);
    }
}
