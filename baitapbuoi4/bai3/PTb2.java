
package baitap4_1;

import static java.lang.Math.sqrt;
import java.util.Scanner;


public class PTb2 {
    public static Scanner sc=new Scanner(System.in);
    private double a;
    private double b;
    private double c;
    
    public void input(){
        System.out.print("a = ");
        a=sc.nextDouble();
        System.out.print("b = ");
        b=sc.nextDouble();
        System.out.print("c = ");
        c=sc.nextDouble();
    }
    
    public void bienluan(){
        if(a==0){
            if(b==0&&c==0){
            System.out.println("Phuong trinh vo so nghiem");
            }
            else if(b==0&&c!=0)
            {
            System.out.println("Phuong trinh vo nghiem");
            }
            else if(b!=0&&c!=0)
            {
            System.out.println("Phuong trinh co nghiem don "+(float)(-c/b));
            }
        }
        else if(a!=0)
        {
            double delta = b*b-4*a*c;
            double x1,x2;
            if(delta>0){
                x1=(-b+sqrt(delta))/(2*a);
                x2=(-b-sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co 2 nghiem phan biet x1= "+x1+" x2= "+x2);
            }
            else if(delta==0){
                x1=-b/(2*a);
                System.out.println("Phuong trinh co nghiem kep x= "+x1);
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
    public void output(){
        System.out.printf("%-10s%-10s%-10s\n","a ","b ","c ");
        System.out.printf("%-10f%-10f%-10f\n",a,b,c);
        bienluan();
    }
    public static void main(String[] args) {
        PTb2 PtBac2=new PTb2();
        PtBac2.input();
        PtBac2.output();
    }
}
