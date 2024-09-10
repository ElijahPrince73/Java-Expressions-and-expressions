import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        int currentYear = 2024;

        try{
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }


//        String userDateofBirth = "1996";
//
//        int dateOfBirth = Integer.parseInt(userDateofBirth);
//
//        System.out.println("Age = " + (currentYear - dateOfBirth));
//
//        String userAgeWithPartialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(userAgeWithPartialYear);
//        System.out.println(ageWithPartialYear);
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi what is your name?");
        System.out.println("Hi " + name);

        String dateOfBirth = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "You are " + age;
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Hi what is your name?");
        System.out.println("Hi whats your name?");
        String name = scanner.nextLine();

        System.out.println("Hi " + name);

//      String dateOfBirth = System.console().readLine("What year were you born?");
        System.out.println("What year were you born?");
        String dateOfBirth = scanner.nextLine();

        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "You are " + age;
    }
}