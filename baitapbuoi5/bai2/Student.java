
package baitapbuoi5_2;

import java.util.Scanner;

public class Student {

    public static Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private int age;
    private int n;
    private Address add = new Address();

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void input() {
        System.out.print("ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Ten: ");
        name = sc.nextLine();

        System.out.print("Tuoi: ");
        age = sc.nextInt();
        add.input();
    }

    public void output() {

        System.out.println("Masv: " + getId() + " Ten: " + getName() + " Tuoi: " + getAge());
        add.output();
    }

    public static Student[] xoa(Student obj[], int t) {
        int n = obj.length;
        Student sv[] = new Student[n - 1];
        for (int i = 0; i < n - 1; i++) {
            sv[i] = new Student();
        }
        for (int i = 0; i < t - 1; i++) {
            sv[i] = obj[i];
        }
        for (int i = t; i < n; i++) {
            sv[i] = sv[i + 1];
        }
        return sv;
    }

    public static void main(String[] args) {
        System.out.print("Nhap so sinh vien: ");
        int n = sc.nextInt();
        Student obj[] = new Student[n];
        for (int i = 0; i < n; i++) {
            obj[i] = new Student();
        }
        System.out.println("--------------------------------MENU----------------------------");
        System.out.println("1. Nhap mang " + n + " sinh vien: ");
        System.out.println("2. Hien thi thông tin cac sinh vien ra man hinh.");
        System.out.println("3. Tim kiem sinh vien theo Id và hien thi ra man hinh.");
        System.out.println("4. Sua cac sinh vien có province la “ThanhHoa” thanh “HaiPhong”");

        int a;
        System.out.println("5. Xoa sinh vien theo Id");
        do {
            System.out.print("Chon so: ");
            a = sc.nextInt();
        } while (a < 1 || a > 5);
        switch (a) {
            case 1: {
                for (int i = 0; i < n; i++) {
                    obj[i].input();
                }
                break;
            }
            case 2: {
                for (int i = 0; i < n; i++) {
                    obj[i].input();
                }
                System.out.println("THONG TIN SINH VIEN");
                for (int i = 0; i < n; i++) {
                    obj[i].output();
                    System.out.println("");
                }
                break;
            }
            case 3: {
                System.out.print("Nhap id sinh vien muon tim");
                int x = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    if (obj[i].id == x) {
                        obj[i].output();
                    }
                }
                break;
            }
            case 4: {
                for (int i = 0; i < n; i++) {
                    obj[i].input();
                }

                System.out.println("Thong tin sau khi sua province");
                for (int i = 0; i < n; i++) {
                    obj[i].add.setProvince(obj[i].add.getProvince().replaceAll("ThanhHoa", "HaiPhong"));
                    obj[i].output();
                }
                break;
            }
            case 5: {
                for (int i = 0; i < n; i++) {
                    obj[i].input();
                }
                int m;
                System.out.print("Nhap ID sinh vien can xoa: ");
                m = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    if (obj[i].getId() == m);
                    obj = xoa(obj, i);
                }
                System.out.println("Thong tin sau khi xoa sinh vien ");
                for (int i = 0; i < n; i++) {
                    obj[i].output();
                }
                break;
            }
        }

    }

}
