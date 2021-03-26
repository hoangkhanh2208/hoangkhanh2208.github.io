import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi kí tự 1: ");
        String string1 = scr.nextLine();
        System.out.println("Nhập vào chuỗi kí tự 2: ");
        String string2 = scr.nextLine();

        var result = string1.equalsIgnoreCase(string2);

        if (result == true) {
            System.out.println("2 chuỗi giống nhau");
        } else {
            System.out.println("2 chuỗi khác nhau");
            
        }
    }
}