package com.mycompany.bai3;

import java.util.Scanner;


public class PTB2 {
    private int a,b,c;
    
    Scanner scanner = new Scanner(System.in);
    
    public void Nhap(){
        System.out.print("Nhap a = ");
        a=scanner.nextInt();
        System.out.print("Nhap b = ");
        b=scanner.nextInt();
        System.out.print("Nhap c = ");
        c=scanner.nextInt();
    }
    
    public void Xuat(){
        System.out.println(a+"X^2 + "+b+"X + "+c);
    }
}
