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
/*5) Write a program to define a class with its data members and function members. Use the
object of this class in the main program to access its members.*/
public class Datamem {
    
public String fname = "nistha ";

public String getfname(){
    return fname;
}
}
 
class main
{
    public static void main(String[] args) {
        Datamem s1 = new Datamem();
        System.out.println(s1.getfname()  );
    }
}