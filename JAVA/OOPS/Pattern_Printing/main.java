package Pattern_Printing;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                //System.out.print(j+" ");
                //System.out.print(i+
                //System.out.print(j+64+" ");
                //System.out.print((char)(i+64)+" ");
                //System.out.print((char)(j+64)+" ");//upper case
                System.out.print((char)(j+96)+" ");//lower case
            }
            System.out.println();
        }

    }
}
