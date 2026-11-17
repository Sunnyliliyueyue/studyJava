package class03;
import java.util.Scanner;
/**
 * 输入两个数 既能被3整除又能被5整除*/
public class for01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int firstNum = scanner.nextInt();
        System.out.println("请输入第二个数字");
        int secondNum = scanner.nextInt();
        int zhongjian = 0;
        if (firstNum > secondNum) {
            zhongjian = firstNum;
            firstNum = secondNum;
            secondNum = zhongjian;
        }
        int zoom = 0;
        for (int i = firstNum; i <= secondNum; i++ ) {
            if (i % 3 == 0 && i % 5 == 0) {
                zoom ++;
            }
        }
        System.out.println(zoom);
    }
}
