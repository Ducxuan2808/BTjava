
package baitap4_1;

import java.util.Scanner;
 
public class NhanVien {
    public static Scanner sc=new Scanner(System.in);
    private static int Manv = 0;
    private String Tennv;
    private int Tuoi;
    private String DiaChi;
    private String BoPhan;    
    
    public void output(){
        Manv ++;
        System.out.printf("%-10d%-10s%-10d%-10s%-10s\n",Manv,Tennv,Tuoi,DiaChi,BoPhan);
        System.out.println("");
    }
    NhanVien(String Tennv,int Tuoi,String DiaChi,String BoPhan){
        this.Tennv=Tennv;
        this.Tuoi=Tuoi;
        this.DiaChi=DiaChi;
        this.BoPhan=BoPhan;
    }
    public static void main(String[] args) { 
        System.out.println("-----------THONG TIN CAC NHAN VIEN-------------");
        System.out.println("");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Manv","Tennv","Tuoi","DiaChi","BoPhan");
        System.out.println("");
        NhanVien a1 =new NhanVien("A",23,"TH","CNTT");
        NhanVien a2 =new NhanVien("B",21,"HN","QLI");
        NhanVien a3 =new NhanVien("C",21,"HP","CNTT");
        NhanVien a4 =new NhanVien("D",24,"QLI","CNTT");
        NhanVien a5 =new NhanVien("E",25,"HN","QLI");
        a1.output();
        a2.output();
        a3.output();
        a4.output();
        a5.output();                                               
    }
    
}
