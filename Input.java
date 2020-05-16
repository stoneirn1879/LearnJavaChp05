import java.util.Scanner;

class Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = 0;
        int year = 0;

        System.out.print("Please enter your age in years: ");
        age = sc.nextInt();
        System.out.print("Please enter the current year: ");
        year = sc.nextInt();

        sc.close();

        if (year < 2000) {
            System.out.print("You'll be ");
        }
        else {
            System.out.print("You were ");
        }

        System.out.println((2000 - year + age) + " years old in the "
                + "year 2000.");

    }
}
