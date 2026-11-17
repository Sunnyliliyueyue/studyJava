package class05;

import java.util.Scanner;

public class Method03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("交换前：[");
        for (int i=0; i< arr.length; i++){
            if (i == arr.length -1){
                System.out.print(arr[i] +"]\n");
            }else {
                System.out.print(arr[i] + ",\t");
            }
        }

        System.out.print("请输入i");
        int in = scanner.nextInt();
        System.out.print("请输入j");
        int jn = scanner.nextInt();
        if (in<0 || jn<0 || in>arr.length-1 || jn> arr.length-1){
            System.out.println("范围错误");
            return;
        }
        swap(arr, in, jn);
        System.out.print("交换后：[");
        for (int i=0; i< arr.length; i++){
            if (i == arr.length -1){
                System.out.print(arr[i] +"]");
            }else {
                System.out.print(arr[i] + ",\t");
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int inj = 0;
        inj = arr[i];
        arr[i] = arr[j];
        arr[j] = inj;
    }

}
