import java.util.Scanner;

public class Lanternfly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Are male or female? ");
        String Gender = input.nextLine();
        System.out.print("How old are you? ");
        int Age = input.nextInt();
        String MGender = "male";
        String FGender = "female";

        if (Gender.equals(FGender) && Age <= 10) {
            System.out.println("Go to lady, child size section");
        } else if ((Gender.equals(FGender)) && (10 < Age && Age < 19)){
            System.out.println("Go to lady, teen size section");
        } else if ((Gender.equals(FGender)) && (18 < Age)) {
            System.out.println("Go to lady, adult size section");
        } else if ((Gender.equals(MGender)) && (10 <= Age)) {
            System.out.println("Go to man, teen size section");
        } else if ((Gender.equals(MGender)) && (10 < Age && Age < 19)) {
            System.out.println("Go to man, adult size section");
        } else if ((Gender.equals(MGender)) && (18 < Age)) {
            System.out.println("Go to man, man size section");
        } else {
            System.out.println("Your data is wrong");
        }

    } // end main method

} // end class