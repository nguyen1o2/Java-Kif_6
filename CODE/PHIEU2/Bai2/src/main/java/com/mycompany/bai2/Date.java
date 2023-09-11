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
public class Date {
    private int ngay,thang,nam;
    Scanner sc = new Scanner(System.in);
    
    public void nhap(){
        System.out.print("Nhap ngay: ");
        ngay=sc.nextInt();
        System.out.print("Nhap thang: ");
        thang=sc.nextInt();
        System.out.print("Nhap nam: ");
        nam=sc.nextInt();
    }
    
    @Override
    public String toString(){
        return ngay+"/"+thang+"/"+nam;
    }
}
