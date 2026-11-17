package class04;

import java.util.Scanner;

public class Method06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入重量");
        double weight = scanner.nextDouble();
        if (weight <= 1){
            min(weight);
        } else if(weight > 1 && weight <=5) {
            sea(weight);
        } else if (weight > 5) {
            max(weight);
        } else {
            System.out.println("快递总重量必须大于0");
        }
    }

    public static void min(double weight) {
        System.out.println("10元");
    }
    public static void sea(double weight) {
        double price = 0;
        price = 10 + (weight -1) * 2;
        System.out.println("应付" + price + "元");
    }

    public static void max(double weight) {
        double price = 0;
        price = 10 + (weight - 1) * 1.5;
        System.out.println("应付" + price + "元");
    }
}
