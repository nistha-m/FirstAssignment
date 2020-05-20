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
/*3) WAP to find simple interest. [si=(p*t*r)/100]*/
import java.util.Scanner;

public class SimpInt {
    public static void main(String[] args) {
        
     float pi , p, t , r;
     
        System.out.println("Simple Intrest");
        System.out.println("Enter Principle:");
        
        Scanner pin = new Scanner(System.in);
        p = pin.nextFloat();
        
        System.out.println(" Enter Time:");
        t = pin.nextFloat();
        
        System.out.println("Enter Rate:");
        r = pin.nextFloat();
        
        
        pi = (p*t*r)/100;
        
        System.out.println("Simple Intrest =" +pi );
                
    }
}
