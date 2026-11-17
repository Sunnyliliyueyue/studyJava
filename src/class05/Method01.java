package class05;

public class Method01 {
    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.print("main方法"+a);
    }
    public static void change(int a){
        a = 200;
        System.out.print("方法内部:"+a);
    }
}
