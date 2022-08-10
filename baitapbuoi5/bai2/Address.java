
package baitapbuoi5_2;

import java.util.Scanner;

public class Address {
    public static Scanner sc = new Scanner(System.in);
    private int id;
    private String district;
    private String province;

    public void setId(int id) {
        this.id = id;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getId() {
        return id;
    }

    public String getDistrict() {
        return district;
    }

    public String getProvince() {
        return province;
    }
    public void input(){
        System.out.print("Ma: ");
        id=sc.nextInt();
        sc.nextLine();
        System.out.print("Huyen: ");
        district=sc.nextLine();
        
        System.out.print("Tinh: ");
        province=sc.nextLine();
        
    }
    public void output(){      
        System.out.print("MaAdd: "+getId()+" Huyen: "+getDistrict()+" Tinh: "+getProvince());
    }
}
