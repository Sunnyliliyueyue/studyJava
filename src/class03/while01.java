package class03;

public class while01 {
    public static void main(String[] args) {
        double money = 100000;
        int num = 0;
        while (money <=200000){
            money += money * 0.017;
            num ++;
        }
        System.out.println(num);
    }
}
