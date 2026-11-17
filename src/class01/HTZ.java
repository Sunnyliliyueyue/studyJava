package class01;

import java.util.Scanner;

public class HTZ {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int H = num / 100 % 10;
        int T = num / 10 % 10;
        int Z = num % 10;
        System.out.println(H + "百位" + T + "十位" + Z + "个位");
    }
}
