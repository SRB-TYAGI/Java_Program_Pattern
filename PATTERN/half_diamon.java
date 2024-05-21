import java.util.Scanner;
public class half_diamon {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enetra number");
        int n=s.nextInt();
        int k=1;
        for (int i=1;i<=n;i++){
            for (int b=1;b<=n-i;b++){
                System.out.print(" ");
            }
            for (int j=1;j<=k;j++){
                System.out.print("*");
            }
            System.out.println();
            k=k+2;
        }
    }
    
}
