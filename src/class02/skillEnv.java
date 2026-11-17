package class02;

import java.util.Scanner;

public class skillEnv {
    public static void main() {
        int total = 200;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入伤害");
        int hurt = scanner.nextInt();
        total -= hurt;
        if (total <= 0){
            System.out.println("您已阵亡");
        } else {
            System.out.println("您还剩余" + total + "血" );
            System.out.println("要充值血量吗" );
            int panduan = scanner.nextInt();
            if( panduan != 0){
                total = total + panduan >= 200 ? 200 : total + panduan ;
                System.out.println("您还剩余" + total + "血" );
            } else {
                System.out.println("end" );
            }
        }

    }
}
