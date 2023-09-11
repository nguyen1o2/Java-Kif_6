/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author OS
 */
public class HCN extends HINHPHANG{
    private int chieuDai,chieuRong;
    Scanner scanner = new Scanner(System.in);
    public void Nhap(){
        tenHinh="Hinh chu nhat";
        System.out.print("Nhap chieu dai: ");
        chieuDai=scanner.nextInt();
        System.out.print("Nhap chieu rong: ");
        chieuRong=scanner.nextInt();
    }

    @Override
    double CV() {
        return (chieuDai+chieuRong)*2;
    }

    @Override
    double DT() {
        return chieuDai*chieuRong;
    }
    
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("###,###.#");
        return super.toString()+" Chieu dai: "+chieuDai+" Chieu rong: "+chieuRong+" Chu vi: "+df.format(CV())+" Dien tich: "+df.format(DT());
    }
}
