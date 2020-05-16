import java.util.Scanner;

public class InputValid {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);

        int age = 0;
        int year = 0;

        System.out.print("Please enter your age in years: ");
        age = sc.nextInt();
        System.out.print("Please enter the current year: ");
        year = sc.nextInt();

        sc.close();

        if (age <= 0) {
            System.out.println("Age can't be less than zero!");
            return;
        }

        if (year < 100) {
            System.out.println("Assuming you meant " + (year + 1900));
            year = year + 1900;
        }
        else if (year < 1990) {
            System.out.println("Have we gone back in time?");
            return;
        }

        if (year < 2000)
            System.out.print("You'll be ");
        else
            System.out.print("You were ");

        System.out.println((2000 - year + age) + " years old in the "
                + "year 2000.");
    }
}
