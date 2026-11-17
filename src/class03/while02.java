package class03;

public class while02 {
    public static void main(String[] args) {
        int height = 8848860;
        double page = 0.1;
        int num = 0;
        while(page < height) {
            page *= 2;
            num += 1;
        }
        System.out.println(num);
    }
}
