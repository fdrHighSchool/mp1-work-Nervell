
import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        // create Scanner object
        Scanner s = new Scanner(System.in);

        // get String input from user
        System.out.print(ANSI_BLUE + "Enter your first name: ");
        String firstName = s.nextLine();
        firstName = firstName.toLowerCase();
        System.out.print(ANSI_BLUE + "Enter your last name: ");
        String lastName = s.nextLine();
        lastName = lastName.toLowerCase();

        System.out.print(ANSI_BLUE + "Are you student or a teacher?" + "\n" + " Answer: ");
        String roleInSociaty = s.nextLine();
        roleInSociaty = roleInSociaty.toLowerCase();
        int randomNum = (int)(Math.random() * 9999)  + 1;

        if (roleInSociaty.equals("student")) {
            System.out.println(ANSI_YELLOW + "Your email will be: " + firstName + initialize(lastName) + randomNum + "@nycstudent.net");
        } else if (roleInSociaty.equals("teacher")) {
            System.out.println(ANSI_YELLOW + "Your email will be: " + initialize(firstName) + lastName + randomNum + "@schools.nyc.gov");
        } else {
            System.out.println(ANSI_RED + "Check your data");
        }

        s.close();
    } // end main method

    /*
     * Name: initialize
     * Purpose: send back the first character (inital) of a name
     * Input: a name (String)
     * Return: a single character (String)
     */
    public static String initialize(String n) {
        return n.substring(0, 1); //Substring is taking a letter from the word and by numbers we created the range, for example numbers 0 and 1 is to start from the first letter and end by second letter
    } // end initialize method

    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";

} // end class