
package baitapbuoi5_1;

import java.util.Scanner;

public class QuanLy {

    public static Scanner sc = new Scanner(System.in);
    private int maQL;
    private String hoTen;

    public void setMaQL(int maQL) {
        this.maQL = maQL;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getMaQL() {
        return maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void input() {
        System.out.print("Ma Quan Ly: ");
        maQL = sc.nextInt();
        System.out.print("Ho va Ten: ");
        hoTen = sc.nextLine();

    }
}
