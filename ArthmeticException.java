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
/*11) Write a program to handle following exceptions:
a) Arithmetic*/
public class ArthmeticException {
    public static void main(String args[])
   {
      try{
         
         int output= 50/0;
         System.out.println ("Result: "+output);
           }
      catch(ArithmeticException e){
        System.out.println ("Arithmetic Exception  =" + e);
      }
   }
}
