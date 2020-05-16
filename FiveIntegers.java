import java.util.Scanner;

public class FiveIntegers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userInput1 = 0;
        int userInput2 = 0;
        int userInput3 = 0;
        int userInput4 = 0;
        int userInput5 = 0;

        System.out.println("We are going to ask you for 5 Numbers");
        System.out.println(" Enter your first number: ");

        userInput1 = sc.nextInt();

        System.out.println(" Enter your second number: ");

        userInput2 = sc.nextInt();

        System.out.println(" Enter your third number: ");

        userInput3 = sc.nextInt();

        System.out.println(" Enter your forth number: ");

        userInput4 = sc.nextInt();

        System.out.println("Enter your fifth number: ");

        userInput5 = sc.nextInt();

        System.out.println("Your numbers are: " + userInput1 + " " + userInput2 + " " + userInput3 +  " " + userInput4
                + " " + userInput5);

        System.out.println("Your numbers are: \t" + userInput1 + "\t" + userInput2 + "\t" + userInput3 +  "\t" +
                userInput4 + "\t" + userInput5);

        System.out.println("Your numbers are: \n" + userInput1 + "\n" + userInput2 + "\n" + userInput3 +  "\n" +
                userInput4 + "\n" + userInput5);

        sc.close();

    }
}
