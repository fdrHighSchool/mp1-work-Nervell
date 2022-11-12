import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the day of the weak: ");
        String DayOfWeek = s.nextLine();

        System.out.println("Enter the number of the month: ");
        String Month = s.nextLine();

        System.out.println("Enter the day of the month: ");
        String DayOfMonth = s.nextLine();

        System.out.println("Enter the number of the year: ");
        String Year = s.nextLine();

        System.out.println("Today is " + DayOfWeek + " " + Month + "/" + DayOfMonth + "/" + Year + " - US format");
        System.out.println("Today is " + DayOfWeek + " " + DayOfMonth + "/" + Month + "/" + Year + " - EU format");
    }
}