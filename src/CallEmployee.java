package chap3;

import static chap3.Employee.work;

public class CallEmployee{
    public static void main(String[] args){
    System.out.println("Id : +Employee.id");
    work();
    
    Employee f = new Employee();
    System.out.println("Name : "+f.name);
    System.out.println("Age : "+f.age);    
    f.getSalary();
    
    }
    
}
