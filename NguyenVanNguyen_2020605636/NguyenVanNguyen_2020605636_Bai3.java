import java.util.Scanner;

public class NguyenVanNguyen_2020605636_Bai3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap vao a = ");
        int a=scanner.nextInt();
        System.out.print("Nhap vao b = ");
        int b=scanner.nextInt();
        System.out.println("Tong = "+(a+b));
        System.out.println("Hieu = "+(a-b));
        System.out.println("Tich = "+(a*b));
        System.out.println("Thuong = "+((float)a/b));
    }
}
