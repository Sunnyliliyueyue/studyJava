package class04;

import java.util.Scanner;

public class Method04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int [5];
        // 按规则录入
        for (int i=0; i<arr.length; i++){
            System.out.println("请输入第" + i + "分数");
            arr[i] = scanner.nextInt();
            while (arr[i]<0 || arr[i]>100) {
                System.out.println("请输入第" + i + "分数");
                arr[i] = scanner.nextInt();
            }
        }
        // 计算总分
        double count = 0;
        for(int i=0; i<arr.length; i++){
            count += arr[i];
        }
        int max = numMax(arr);
        int min = numMin(arr);
        count = (count - max - min) / (arr.length-2);
        System.out.println("平均分是" + count);
    }
    public static int numMax(int [] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int numMin(int [] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
