import java.util.Scanner;

public class Ex2{
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);

        System.out.println("Nhập vào một chuỗi kí tự: ");
        String string = scr.nextLine();

        System.out.println("Kích thước của chuỗi này là: " + string.length());
    }
}
