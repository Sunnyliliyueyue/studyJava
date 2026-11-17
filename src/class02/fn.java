package class02;

import java.util.Scanner;

public class fn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = scanner.nextInt();
        if (num % 2 != 0){
            System.out.println("奇数"+ (num * 3 + 1));
        } else {
            System.out.println("偶数"+ num / 2);
        }
    }
}
