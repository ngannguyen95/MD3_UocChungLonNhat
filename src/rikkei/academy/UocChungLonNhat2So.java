package rikkei.academy;

import java.util.Scanner;

public class UocChungLonNhat2So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a:");
        int a = sc.nextInt();
        System.out.println("Nhập vào số b:");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
                System.out.println("Hiệu a-b: "+a);
            }else {
                b=b-a;
                System.out.println("b: "+b);
            }
        }
        System.out.println("Uớc chung lớn nhất: "+a);
    }
}
