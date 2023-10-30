import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("---Grade Average Program---");
        System.out.println("");
        System.out.print("Enter grade one: ");
        double grade1 = input.nextDouble();
        System.out.print("Enter grade two: ");
        double grade2 = input.nextDouble();
        System.out.print("Enter grade three: ");
        double grade3 = input.nextDouble();
        System.out.print("Enter grade four: ");
        double grade4 = input.nextDouble();
        System.out.println("");
        System.out.printf("Your average is %.2f" , GradeAverage.average(grade1, grade2, grade3, grade4));
        System.out.println(".");
        System.out.println("You have a(n) " + GradeAverage.gradeLetter(grade1, grade2, grade3, grade4) + ".");


    }
}
