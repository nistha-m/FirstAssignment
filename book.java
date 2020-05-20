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
/*
6) Write a program which has class Book with data members bookName , ISBN , author &
price and appropriate function members to read and display data members*/
import java.util.Scanner;


public class book {
    
   /*  double isb = 5622.65;
     String nam;
    String  au ;
    Float pric;
    */
    
    String bookName;
    int ISBN;
    String author;
    Float price;


public void read()
{
   
    
 Scanner bok = new Scanner(System.in);
    System.out.println("name of the book");
        bookName= bok.nextLine();
    System.out.println("ISBN of the book");
         ISBN= bok.nextInt();
    System.out.println("Author of the book");
       author= bok.nextLine();
    System.out.println("Price");
        price = bok.nextFloat();
}

public void print()
{
    System.out.println("name of book=" + bookName);
    System.out.println("ISBN of the book=" + ISBN);
    System.out.println("Author of the Boook" + author);
    System.out.println("Price=" + price);
}
    public static void main(String[] args) {
       book b = new book ();
       b.read();
       b.print();
    }
}