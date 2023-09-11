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
public class HCN {
    private int chieuDai,chieuRong;
    
    Scanner scanner = new Scanner(System.in);
    public void Nhap(){
        System.out.print("Nhap chieu dai: ");
        chieuDai=scanner.nextInt();
        System.out.print("Nhap chieu rong: ");
        chieuRong=scanner.nextInt();
    }
    
    public int CV(){
        return (chieuDai+chieuRong)*2;
    }
    
    public int DT(){
        return chieuDai*chieuRong;
    }
//    public void inTieuDe(){
// System.out.printf("%15s%15s%15s%15s%n",
//"Chiều dài ","Chiều rộng "," chu vi","Diện tich"); 
//}
    public void Xuat(){
        System.out.println("Chieu dai: "+chieuDai+"\nChieu rong: "+chieuRong+"\nChu vi: "+CV()+"\nDien tich: "+DT());
    }
}
