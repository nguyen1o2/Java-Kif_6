/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Bai4 {

    public static void main(String[] args) {
        List<XE> dsxe = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        while(true){
            System.out.println("Chon 1: Them thong tin xe"); 
            System.out.println("Chon 2: Hien thi thong tin cac xe");
            System.out.println("Chon 3: Thoat");
            int key=sc.nextInt();
            switch(key){
                case 1:
                    XE a = new XE();
                    a.Nhap();
                    a.thue();
                    dsxe.add(a);
                    break;
                case 2:
                   System.out.printf("%15s%15s%15s%15s%15s%n","Ten chu xe","Loai xe","Dung tich","Tri gia","Thue phai nop");
                   for(int i=0;i<dsxe.size();i++){
                       dsxe.get(i).thue();
                       dsxe.get(i).Xuat();
                   }
                   break;
                case 3:
                    return;
                    default:
                        System.out.println("Chon lai");
        }
    }

    }
}
