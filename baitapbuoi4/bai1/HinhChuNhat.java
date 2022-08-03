
package baitapbuoi2_1;

import java.util.Scanner;

public class HinhChuNhat {
    private static Scanner sc=new Scanner(System.in);
    private int chieudai;
    private int chieurong;
    private String k;
    private int chuvi;
    private int dientich;
    public void so(String k){
        System.out.print("Hinh chu nhat: "+k);
        k=sc.nextLine();       
    }

    
    //Cach 1: Input
    public void input(){
    System.out.print("Chieu dai: ");
    chieudai=sc.nextInt();
     System.out.print("Chieu rong: ");
    chieurong=sc.nextInt();
    }
    public void output(){
        
        System.out.printf("%-10s%-10d%-10d",k,chieudai,chieurong);
    }
    //Cach2: getter,setter
    public int getChieudai(){
        return chieudai;
    }

    public int getChieurong() {
        return chieurong;
    }  
    public int chuvi(){
        return (chieudai+chieurong)*2;
    }
    public int dientich(){
        return (chieudai*chieurong);
    }
    public void setChieudai(int chieudai){
        this.chieudai=chieudai;
    }
    public void setChieurong(int chieurong) {
        this.chieurong = chieurong;
    }        
    public static void main(String[] args) {
//        Cach 1
        HinhChuNhat a =new HinhChuNhat();
        HinhChuNhat b =new HinhChuNhat();
        a.so("a");
        b.so("b");
        System.out.println("Hinh chu nhat a: ");
        a.input();             
        System.out.println("Hinh chu nhat b: ");
        b.input();
        System.out.printf("%-10s%-10s%-10s\n","Hinh chu nhat"," Chieu dai "," Chieu rong");
        a.output();
        System.out.println("");
        b.output();
//        Cach 2
//        System.out.println("Hinh chu nhat a: ");
//        System.out.println("Chieu dai: "+a.getChieudai());
//        System.out.println("Chieu rong: "+a.getChieurong());
//        System.out.println("Hinh chu nhat b: ");
//        System.out.println("Chieu dai: "+b.getChieudai());
//        System.out.println("Chieu rong: "+b.getChieurong());
        System.out.println("");
        System.out.println("Hinh chu nhat a: ");
        System.out.println("Chu vi: "+a.chuvi());
        System.out.println("Dien tich: "+a.dientich());
        System.out.println("Hinh chu nhat b: ");
        System.out.println("Chu vi: "+b.chuvi());
        System.out.println("Dien tich: "+b.dientich());
        if(a.dientich()>b.dientich())
        {
            System.out.println("Dien tich hinh chu nhat a lon hon hinh chu nhat b");
        }
        else 
        {
            System.out.println("Dien tich hinh chu nhat b lon hon hinh chu nhat a");
        }
         
        
    }
    
    }
    
           
    

