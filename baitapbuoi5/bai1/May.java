
package baitapbuoi5_1;

import java.util.Scanner;

public class May {

    public static Scanner sc = new Scanner(System.in);
    private int maMay;
    private String kieuMay;
    private String tinhTrang;

    public int getMaMay() {
        return maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void input() {      
        System.out.print("Ma May: ");
        maMay = sc.nextInt();
        sc.nextLine();
        System.out.print("Kieu May: ");
        kieuMay = sc.nextLine();      
        System.out.print("Tinh Trang: ");
        tinhTrang = sc.nextLine();
    }

}
