import java.util.Scanner;
public class tri_of_num {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enetra number");
        int n=s.nextInt();
        int i,j;
        int k=1;
        for (i=1;i<=n;i++){
            for (int b=1;b<=n-i;b++){
                System.out.print(" ");
            }
            for  (j=1;j<=k;j++){
                System.out.print(k+j-1);
            }
            System.out.println();
       
            k=k+1;
            
            
        }
        for(i=1;i<=n;i++){
            for(j=1;j<=i-1;j++){
                System.out.print(2*i-j-1);
        
        
         }
          System.out.println();
        

        }
        
    }
}
    

