import java.util.*;
public class patterns{
    static void print1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
          System.out.println();
        }
    }
    static void print2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
           System.out.println(); 
        }
    }
    static void print3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
           System.out.println(); 
        }
    }
    static void print4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
           System.out.println(); 
        }
    }
    static void print5(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
           System.out.println(); 
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        print1(n);
        print2(n);
        print3(n);
        print4(n);
        print5(n);


    }
}
