import java.util.*;
public class FunPattern {
    public static void hollow_reactangle(int totalrow , int totalcol){
        for(int i=1;i<=totalrow;i++){
            for(int j=1;j<=totalcol;j++){
                if(i==1 || i==totalrow || j==1 || j==totalcol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }  
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number for Row");
        int n=sc.nextInt();
        System.out.println("Enter the Number for Column" );
        int m=sc.nextInt();
        hollow_reactangle(n,m);
    }
}
