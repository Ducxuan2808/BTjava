
package baitapbuoi5_3;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class KiemTra {

    public static Scanner sc = new Scanner(System.in);

    public static Boolean isPrime(int n) {

        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Boolean isPrime(long n) {

        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Boolean isPrime(float n) {
        if (n - (int) n != 0) {
            return false;
        } else {
            if (n < 2) {
                return false;
            } else {
                for (int i = 2; i < sqrt(n); i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static Boolean isPrime(double n) {
        if (n - (int) n != 0) {
            return false;
        } else {
            if (n < 2) {
                return false;
            } else {
                for (int i = 2; i < sqrt(n); i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println("Kiem tra so nguyen to ");
        System.out.println("2 " + isPrime(2));
        System.out.println("3 " + isPrime(3));
        System.out.println("3,9 " + isPrime(3.9f));
        System.out.println("1,15 " + isPrime(5.15f));
    }
}
