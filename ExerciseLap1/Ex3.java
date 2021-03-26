import java.time.LocalDate;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("Ngày giờ hiện tại: " + formattedDate);

    }
}
