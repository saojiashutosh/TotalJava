package TotalJava.Loops;

import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Table of entered number : ");
        for( int i = 1; i <=10 ;i++){
            int mult =n*i;
            System.out.println(n+"*"+i+"="+mult);
        }
    }
}
