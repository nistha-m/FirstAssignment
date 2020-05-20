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

/*4) WAP to find smallest among three numbers.*/
import java.util.Scanner;
public class Smallest {
    public static void main(String[] args) {
        
        int x,y,z,a;
        System.out.println("Enter 3 numbers to find the smallest:");
        
        Scanner sm = new Scanner(System.in);
        x = sm.nextInt();
        y = sm.nextInt();
        z = sm.nextInt();
        
        a = Math.min(Math.min(x,y), z);
        
        System.out.println("the smallest number among " + x + "," + y + "," + z + "is" + a);
    }
}
