package class04;

public class Method03 {
    public static void main(String[] args) {
        tableList();
    }
    public static void tableList(){
        for (int i=1; i<10; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i + "*" + j + "=" + i*j+ "\t");
            }
            System.out.println();
        }
    }
}
