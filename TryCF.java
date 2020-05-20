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
/*8) Write a program to demonstrate exception handling using try, catch and finally block.*/
public class TryCF {
    public static void main(String args[])
    {
        int Firstnum, SecondNum ;
        Scanner di = new Scanner(System.in);
        System.out.println("Divisior");
        
        System.out.println("Enter First Number: ");
        Firstnum = di.nextInt();
        
        System.out.println("Enter Second Number: ");
        SecondNum = di.nextInt();
        
        try{
            int Quotient=Firstnum/SecondNum ;
            System.out.println("Quotient =" + Quotient);
        }
        catch(Exception e){
            System.out.println("error");
        }
        finally{
            System.out.println("Try Catch has been executed");
        }  
    }
            
    
}
