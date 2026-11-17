package class03;
import java.util.Scanner;
public class switch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入星期数字");
        int week = scanner.nextInt();
        switch (week){
            case 1:
                System.out.println("去健身");
                break;
            case 2:
                System.out.println("去游泳");
                break;
            case 3:
                System.out.println("去攀岩");
                break;
            case 4:
                System.out.println("去滑雪");
                break;
            case 5:
                System.out.println("去徒步");
                break;
            case 6:
                System.out.println("去欧洲");
                break;
            case 7:
                System.out.println("去做梦");
                break;
            default:
                System.out.println("输入错误！！！");
                break;
        }

    }
}
