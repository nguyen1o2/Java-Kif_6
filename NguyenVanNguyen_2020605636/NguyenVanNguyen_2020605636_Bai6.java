import java.util.Scanner;

public class NguyenVanNguyen_2020605636_Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        int a[][],b[][],c[][];
        int n,k,m;
        System.out.print("Nhap hang mt1: ");
        n=scanner.nextInt();
        System.out.print("Nhap cot mt1,hang mt2: ");
        k=scanner.nextInt();
        System.out.print("Nhap cot mt2: ");
        m=scanner.nextInt();
        a=new int[n][k];
        b=new int[k][m];
        c=new int[n][m];
// MTA
        System.out.println("Nhap ma tran 1");
        for (int i=0;i<n;i++){
            for (int j=0;j<k;j++){
                System.out.print("a["+i+"]["+j+"]= ");
                a[i][j]=scanner.nextInt();
            }
        }
// MT B
//        1 1 1    1
//        1 1 1    1
//                 1
        System.out.println("Nhap ma tran 2");
        for (int i=0;i<k;i++){
            for (int j=0;j<m;j++){
                System.out.print("a["+i+"]["+j+"]= ");
                a[i][j]=scanner.nextInt();
            }
        }

        //nhan
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            c[i][j]=0;
            for (int s=0;s<k;s++){
                c[i][j]=c[i][j]+a[n][k]*b[k][m];
            }
            }
        }

        for(int i=0;i<n;i++){
            for (int j=0;j<k;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.print("\t*\t");
        for(int i=0;i<k;i++){
            for (int j=0;j<m;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.print("\t=\t");
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
