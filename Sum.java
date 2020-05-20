/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstAssign;

/**
 *
 * @author NISTHA
 */
/*1) WAP to find the sum of two numbers.*/
import java.util.Scanner;
public class Sum {
    
    public static void main(String[] args) {
        int a,b,x;
        
        System.out.println("Sum of two number");
        System.out.println("Enter two number:");
        Scanner sum = new Scanner(System.in);
        
        a = sum.nextInt();
        b = sum.nextInt();
        
        x = a + b;
        
        System.out.println("Sum of two integer:" + a + "+" + b + "=" + x );
    }
}
