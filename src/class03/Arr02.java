package class03;

import java.util.Scanner;

public class Arr02 {
    public static void main(String[] args) {
        int[] Arr = {33, 5, 22, 44, 55, 33};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = scanner.nextInt();
        boolean flag = false;
        for (int i=0; i<Arr.length; i++) {
            if(num == Arr[i]){
                System.out.println(i);
                flag = true;
                break;
            }

        }
        if (!flag){
            System.out.println("不存在");
        }
    }
}
