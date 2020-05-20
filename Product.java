/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstAssign;

import java.util.Scanner;

/**
 *
 * @author NISTHA
 */
/*2) WAP to find the product of two numbers.*/

import java.util.Scanner;

public class Product {
    
    public static void main(String[] args) {
        int a,b,x;
        
        System.out.println("Product of two number");
        System.out.println("Enter two number:");
        Scanner pro = new Scanner(System.in);
        
        a = pro.nextInt();
        b = pro.nextInt();
        
        x = a * b;
        
        System.out.println("Product of two integer:" + a + "*" + b + "=" + x );
    }
}
