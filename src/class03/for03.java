package class03;

import java.util.Scanner;

public class for03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
