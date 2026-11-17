package class03;

import java.util.Scanner;


public class Arr01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Arr [] = new int [5];
        for (int i=0; i<5; i++){
            System.out.println("请输入第"+ (i+1) + "个数字");
            Arr[i] = scanner.nextInt();
        }
        for(int i=0; i < Arr.length; i++){
            System.out.println(Arr[i]);
        }
    }
}
