/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author PC
 */
import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class test {
//    static int n,loaiLD;
//    static NguoiLaoDong NLD[]; 
//    Scanner a = new Scanner(System.in);
//       public void nhap(){
//        System.out.print("Nhap so nguoi lao dong :");
//        n= a.nextInt();
//        n+=3;
//        NLD = new NguoiLaoDong[n];
////        fakeDaTa();
//        for(int i=3;i<n;i++){
//            System.out.print("1:Lao dong pho thong||2:Ky su");
//            loaiLD = a.nextInt();
//            if(loaiLD==1){
//                NLD[i] = new LaoDongPhoThong("Minh","ND","LDPT",27,500000);
//                NLD[i].nhapthongtin();
//            } else if (loaiLD == 2) {
//                NLD[i] = new Kisu("Minh","ND","KS",12000000,1.5,25);
//                NLD[i].nhapthongtin();
//            }
//        }
//       
         static List<NguoiLaoDong> NLD = new ArrayList<>();
    public static void fakeDaTa()
        {
//            LaoDongPhoThong x =new LaoDongPhoThong("Minh","ND","LDPT",27,500000);
//            NLD[0]=x;
//            LaoDongPhoThong y =new LaoDongPhoThong("Linh","ND","LDPT",17,500000);
//            NLD[1]=y;
//            LaoDongPhoThong z =new LaoDongPhoThong("Ninh","ND","LDPT",22,500000);
//            NLD[2]=z;
            LaoDongPhoThong x = new LaoDongPhoThong("Minh","ND","LDPT",27,500000);
            LaoDongPhoThong y = new LaoDongPhoThong("Linh","ND","LDPT",17,500000);
            LaoDongPhoThong z = new LaoDongPhoThong("Ninh","ND","LDPT",22,500000);
            
            NLD.add(x);
            NLD.add(y);
            NLD.add(z);
            
        }
//        public void xuat(){
//        System.out.println("===================Danh sach LDPT====================");
//       
//        for(int i=0;i<n;i++){
//            if(NLD[i] instanceof LaoDongPhoThong)
//                NLD[i].inthongtin();
//        }
//        System.out.println("==================Danh sach KS=============== ");
//   
//        for(int i=0;i<n;i++){
//            if(NLD[i] instanceof Kisu) 
//                NLD[i].inthongtin();
//        }
//        
//    }
//    
//}
        public static void main(String[] args){
//        test X = new test();
//        X.nhap();
//        X.xuat();
//            LaoDongPhoThong x = new LaoDongPhoThong("Minh","ND","LDPT",27,500000);
//            LaoDongPhoThong y = new LaoDongPhoThong("Linh","ND","LDPT",17,500000);
//            LaoDongPhoThong z = new LaoDongPhoThong("Ninh","ND","LDPT",22,500000);
//            
//            List<NguoiLaoDong> NLD = new ArrayList<>();
//            NLD.add(x);
//            NLD.add(y);
//            NLD.add(z);
            
            fakeDaTa();
            for(NguoiLaoDong s: NLD){
                s.inthongtin();
            }
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap so lhuong NLD: ");
            n = sc.nextInt();
            for(int i=0;i<n;i++){
                LaoDongPhoThong ldnew= new LaoDongPhoThong();
                ldnew.nhapthongtin();
                NLD.add(ldnew);
            }
            for(NguoiLaoDong s: NLD){
                s.inthongtin();
            }
//            Collections.sort(NLD,new SortName());
            Collections.sort(NLD, new SortLuong());
            System.out.println("sau sap xep");
            for(NguoiLaoDong s: NLD){
                s.inthongtin();
            }
        }
}
