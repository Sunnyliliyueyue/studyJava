package class03;

import java.util.Scanner;

public class for04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数字：");
        int num = scanner.nextInt();
        if (num < 0) {
            num *= -1;
        }
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
