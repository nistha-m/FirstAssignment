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
        b) NullPointer*/
public class NullPointer {
    public static void main(String args[])
   {
          try{
            String string1=null;
            System.out.println (string1.length());
	}
        catch(NullPointerException e){
            System.out.println("Exception occurred=" + e);
	}
   }
}
