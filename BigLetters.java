import java.util.Scanner;

public class BigLetters {

    public static void main(String[] args) {

        Scanner sc = new java.util.Scanner(System.in);

        String firstInitial = "";
        String middleInitial = "";
        String lastInitial = "";

        System.out.println("Let's have fun with names! ");

        System.out.println("What is your first initial? (Enter W)");
        firstInitial = sc.next();

        System.out.println("What is your second initial? (Enter A)");
        middleInitial = sc.next();

        System.out.println("What is your last initial? (Enter P)");
        lastInitial = sc.next();

        System.out.println(" " + firstInitial + "     " + firstInitial + "     " + middleInitial + "     " + lastInitial +
                lastInitial + lastInitial + lastInitial + lastInitial + lastInitial);

        System.out.println(" " + firstInitial + "  " + firstInitial + "  " + firstInitial + "    " + middleInitial + " "
                + middleInitial + "    " + lastInitial + "    " + lastInitial);

        System.out.println(" " + firstInitial + "  " + firstInitial + "  " + firstInitial + "   " + middleInitial + "   "
                + middleInitial + "   " + lastInitial + "    " + lastInitial);

        System.out.println(" " + firstInitial + "  " + firstInitial + "  " + firstInitial + "  "+ middleInitial + "     "
                + middleInitial + "  " + lastInitial + lastInitial + lastInitial + lastInitial + lastInitial + lastInitial);

        System.out.println(" " + firstInitial + "  " + firstInitial + "  " + firstInitial + "  " + middleInitial +
                middleInitial + middleInitial + " " + middleInitial + middleInitial + middleInitial + "  " + lastInitial);

        System.out.println(" " + firstInitial + "  " + firstInitial + "  " + firstInitial + "  " + middleInitial + "     "
                 + middleInitial + "  " + lastInitial);
        System.out.println("  " + firstInitial + firstInitial + " " + firstInitial + firstInitial + "   " + middleInitial + "     "
                + middleInitial + "  " + lastInitial);

    }

}