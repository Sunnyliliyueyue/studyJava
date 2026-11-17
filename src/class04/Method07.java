package class04;

import java.util.Random;
import java.util.Scanner;

public class Method07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入Size");
        int size = scanner.nextInt();
        if (size == 0){
            System.out.print("[]");
            return;
        }
        System.out.print("请输入min");
        int min = scanner.nextInt();
        System.out.print("请输入max");
        int max = scanner.nextInt();
        if((size < 0) || (min > max)){
            System.out.print("输入不合法");
            return;
        }
        int scope = max - min + 1;
        if (scope < size){
            System.out.print("不能生成，必须合理处理");
            return;
        }
        int[] arr = generateArray(size, min, max);
        printArray(arr,"|");
    }
    // 判断数字是否存在
    public static boolean contains(int[] arr, int num, int validLength) {
        for (int i=0;i< validLength;i++){
            if(num == arr[i]){
                return true;
            }
        }
        return false;
    }
    // 生成不重复数组
    public static int[] generateArray(int size, int min, int max) {
        Random random = new Random();
        int [] arr = new int[size];
        for(int i=0; i<size;){
            int number = random.nextInt(min, max + 1);
            boolean flag = contains(arr, number, i);
            if (!flag){
                arr[i] = number;
                i++;
            }
        }
        return arr;
    }
    // 打印数组
    public static void printArray(int[] arr) {
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
    // 重载
    public static void printArray(int[] arr, String separator){
        for (int i = 0; i<arr.length; i++){
            if (i == arr.length-1){
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + separator);
            }
        }
    }
}
