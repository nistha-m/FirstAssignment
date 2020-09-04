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

    class Person {
    private String name;
    private String Occupation;
    private double Salary ;
    private double bonusSalary;

    public Person(){
    }

    public Person(String name,String Occupation,double Salary, double bonusSalary){
        this.name = name;
        this.Occupation = Occupation;
        this.bonusSalary = bonusSalary;
        this.Salary =Salary;
        System.out.println("Name: "+name);
        System.out.println("Occupation :" +Occupation);
        System.out.println("Salary:" + Salary);
        System.out.println("BonusSalary: "+(this.bonusSalary));
        System.out.println("Total Salary:"+(this.Salary +this.bonusSalary));
    }
}

class Politician extends Person{

    public Politician(String name,String Occupation,double Salary ,double bonusSalary) {
        super(name,Occupation,Salary, bonusSalary);
    }

    public Politician() {
    }
}
class Sportsman extends Person{

    public Sportsman(String name,String Occupation,double Salary,double bonusSalary){
        super(name,Occupation,Salary,bonusSalary);
    }

    public Sportsman() {
    }
}

class Person2 {
    public static void main(String[] args) {
        Politician politician = new Politician("Alaric Saltzman","Politician",50000,2000);
        Sportsman sportsman = new Sportsman("Tyler Lockwood","Sports Man",25000,1000);
    }
}

