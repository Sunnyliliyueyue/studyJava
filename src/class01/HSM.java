package class01;

import java.util.Scanner;

public class HSM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputS = scanner.nextInt();
        int H = inputS / 3600 ;
        System.out.println(H);
        int F = inputS / 60 % 60;
        System.out.println(F);
        int M = inputS % 60 ;
        System.out.println(M);
        System.out.println(H + "小时：" + F + "分钟：" + M + "秒");
    }
}
