package class02;

import java.util.Scanner;

public class dingdan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入订单金额：");
        double total = scanner.nextDouble();
        double first = total * 0.9;
        double second = total - (total / 30) * 10;
        if (first > second){
            System.out.println("选美团" + second);
        } else if(second > first ){
            System.out.println("选饿了么" + first);
        } else {
            System.out.println("都一样" + first);
        }
    }
}
