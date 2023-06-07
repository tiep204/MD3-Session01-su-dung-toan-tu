import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chiều dài của hình chữ nhật: ");
        int height = sc.nextInt();
        System.out.println("Mời bạn nhập chiều rộng của hình chữ nhật:");
        int with = sc.nextInt();
        int s = height*with;
        System.out.println("Diện tích của hình chữ nhật là: "+s);
    }
}