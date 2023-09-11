import java.util.Scanner;

public class NguyenVanNguyen_2020605636_Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] a;
        int n,m;
        System.out.println("Nhap so hang: ");
        n=scanner.nextInt();
        System.out.println("Nhap so cot: ");
        m=scanner.nextInt();
        a=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print("a["+i+"]["+j+"]= ");
                a[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Mang vua nhap la");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
