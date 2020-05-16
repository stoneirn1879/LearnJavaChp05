import java.util.Scanner;

public class ThreeVariables {

    public static void main(String[] args) {

        Scanner sc = new java.util.Scanner(System.in);

        int deptNumber =0;
        float salary =0;
        int jobClass =0;

        System.out.println("What is your Department Number? ");

        deptNumber = sc.nextInt();

        System.out.println("What is your Salary? ");

        salary = sc.nextFloat();

        System.out.println("What is your job Classification? ");

        jobClass = sc.nextInt();


        System.out.println("Your Department Number is: " + deptNumber + " " + "Your Salary is: " + salary + " " +

                "Your job Classification is: " + " " + jobClass);

        System.out.println("Your Department Number is: " + deptNumber + "\t" + "Your Salary is: " + salary + " \t" +

                "Your job Classification is: " + jobClass);

        System.out.println("Your Department Number is: " + deptNumber + "\n" + "Your Salary is: " + salary + "\n" +

                "Your job Classification is: " + jobClass);

        sc.close();
    }
}