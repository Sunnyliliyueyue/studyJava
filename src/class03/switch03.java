package class03;
import java.util.Scanner;
/**
 * switch 新特性
 * 1. 箭头函数
 * 2. case后面可以是多个值
 * 3. switch可以有运行结果
 * 4. yield 关键字 相当于JS里的return
 * */
public class switch03 {
    public static void main(String[] args) {
//        int num = 3;
//        switch (num){
//            case 1,2,3 -> System.out.println('一');
//            case 4,5,6 -> System.out.println('二');
//            case 7,8,9 -> System.out.println('三');
//            default -> System.out.println(0);
//        }
        String a = "*";
        int b = 10;
        int c = 20;
        int d = switch (a){
            case "+" -> {
                yield b + c;
            }
            case "-" -> {
                yield b - c;
            }
            case "*" -> {
                yield  b * c;
            }
            case "/" -> {
                yield b / c;
            }
            default -> {
                yield 0;
            }
        };
        System.out.println(d);
    }
}
