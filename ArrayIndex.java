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
            c) ArrayIndexOutOfBound
*/
public class ArrayIndex {
    
    public static void main(String[] args) {
        try
        {
            int Array []= {2,4,6,8};
            System.out.println(Array[10]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
            
        }
        System.out.println("Rest of code");
    }
}
