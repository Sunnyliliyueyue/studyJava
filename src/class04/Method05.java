package class04;

import java.util.Scanner;

public class Method05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int [10];
        for(int i=0; i<arr.length; i++){
            System.out.println("请输入第" + i + "个同学成绩");
            arr[i] = scanner.nextInt();
            while (arr[i] < 0 || arr[i]>100){
                System.out.println("成绩无效，请重输");
                System.out.println("请输入第" + i + "个同学成绩");
                arr[i] = scanner.nextInt();
            }
        }
        okPeo(arr);
        totalNum(arr);
        numMax(arr);
    }
    public static void okPeo(int [] arr){
        int num = 0;
        int okNum = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] >= 60){
                num++;
            }
        }
        okNum = (int)((double)(num / arr.length) * 100);
        System.out.println("及格人数" + num + "\t" + "及格率" + okNum);
    }
    public static void totalNum(int [] arr){
        int num = 0;
        int pir = 0;
        for (int i = 0; i < arr.length; i++){
            num += arr[i];
        }
        pir = (int) (num / arr.length);
        System.out.println("总分是" + num + "\t" + "平均分是" + pir);
    }
    public static void numMax(int [] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("最高分是" + max);
    }
}
