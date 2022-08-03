
package baitap4_1;

import java.util.Scanner;


public class Employee {
    public static Scanner sc=new Scanner(System.in);
    private String id;
    private String name;
    private int age;
    private int workingDays;
    private double salary;
    public static int PRICE =50;
    public static Employee nv1=new Employee();
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWorkingDays() {
        return workingDays;
    }
    public double getSalary() {
        return salary;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }
     public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
//    public Employee(int id, String name, int age, int workingDays) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.workingDays = workingDays;
//    }
    public double LayraSalary(){
        salary=PRICE*workingDays;
        return salary;
    } 
    public void input(){
        
        System.out.print("Ma nhan vien: ");
        id=sc.nextLine();
        System.out.print("Ten nhan vien: ");
        name=sc.nextLine();
        
        System.out.print("Tuoi nhan vien: ");
        age=sc.nextInt();
        System.out.print("Ngay lam: ");
        workingDays=sc.nextInt();
    }
    public void output(){
        System.out.println("Ma nhan vien:"+nv1.getId());
        
        System.out.println("Ten nhan vien: "+nv1.getName());
        
        System.out.println("Tuoi nhan vien: "+nv1.getAge());
        System.out.println("Ngay lam: "+nv1.getWorkingDays());
    }
    public static void main(String[] args) {
        
        nv1.input();
        nv1.output();
        System.out.println("Tien cong:"+nv1.LayraSalary());
        
    }
}
