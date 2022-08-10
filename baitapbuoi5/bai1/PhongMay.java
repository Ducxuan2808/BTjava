package baitapbuoi5_1;

import java.util.Scanner;

public class PhongMay {

    public static Scanner sc = new Scanner(System.in);
    private int maPhong;
    private String tenPhong;
    private double DienTich;
    private QuanLy x = new QuanLy();
    private May y = new May();

    public int getMaPhong() {
        return maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public double getDienTich() {
        return DienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public May getY() {
        return y;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public void setDienTich(double DienTich) {
        this.DienTich = DienTich;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public void setY(May y) {
        this.y = y;
    }

    public void input() {
        System.out.print("Ma Phong: ");
        maPhong = sc.nextInt();
        sc.nextLine();
        System.out.print("Ten Phong: ");
        tenPhong = sc.nextLine();
        System.out.print("Dien Tich (m2): ");
        DienTich = sc.nextDouble();
        x.input();
        y.input();

    }

    public void output() {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Ma Phong ", "TenPhong ", "DienTich ", "MaQuanLy ", "HovaTen ", "MaMay ", "KieuMay ", "TinhTrang ");
        System.out.printf("%-10d%-10s%-10f%-10d%-10s%-10d%-10s%-10s", maPhong, tenPhong, DienTich, x.getMaQL(), x.getHoTen(), y.getMaMay(), y.getKieuMay(), y.getTinhTrang());
    }

    public static void main(String[] args) {
        PhongMay pm = new PhongMay();
        pm.input();
        pm.output();
    }
}
