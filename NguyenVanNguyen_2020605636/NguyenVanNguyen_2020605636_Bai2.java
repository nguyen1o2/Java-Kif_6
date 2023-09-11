import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NguyenVanNguyen_2020605636_Bai2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String inp;
        System.out.print("Nhap chuoi: ");
        inp=scanner.nextLine();
        System.out.print("Xuat chuoi: "+inp);
        try{
            BufferedReader inpu = new BufferedReader(new InputStreamReader(System.in));
            String a;
            System.out.print("\nNhap chuoi: ");
            a=inpu.readLine();
            System.out.print("Xuat chuoi:"+a);
        }catch (IOException e){
            System.out.println("loi: "+e);
        }

    }
}
