import java.util.Scanner;

public class NguyenVanNguyen_2020605636_Bai4 {
    public static void sapxep(int a[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int tg=a[i];
                    a[i]=a[j];
                    a[j]=tg;
                }
            }
        }
    }

    public static void tachmang(int a[],int n){
        System.out.print("\nMang chan:");
        for (int i=0;i<n;i++){
            if(a[i]%2==0){
                System.out.print(a[i]+"\t");
            }
        }
        System.out.print("\nMang le:");
        for (int i=0;i<n;i++){
            if(a[i]%2==1){
                System.out.print(a[i]+"\t");
            }
        }
    }
    public static void main(String[] args) {
        int a[];
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        n=scanner.nextInt();
        a= new int[n];
        for (int i=0;i<n;i++){
            System.out.print("a["+i+"]= ");
            a[i]=scanner.nextInt();
        }
        sapxep(a,n);
        System.out.print("Mang sau khi sap xep: ");
        for (int i=0;i<n;i++){
            System.out.print(a[i]+"\t");
        }
        tachmang(a,n);
    }
}
