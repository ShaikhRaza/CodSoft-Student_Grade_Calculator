import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        float EMT, SPD, DC, An_Com, An_Cir, NPTEL;
        float percentage, total_marks;
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter a student name :  ");
        name = scanner.next();

        System.out.println("\nEnter a six subject marks :-  ");

        System.out.print("\nElectromagnetic Theory : ");
        EMT = scanner.nextFloat();

        System.out.print("Semiconductor Physics & Device : ");
        SPD = scanner.nextFloat();

        System.out.print("Analog Circuit : ");
        An_Cir = scanner.nextFloat();

        System.out.print("Analog Communication : ");
        An_Com = scanner.nextFloat();

        System.out.print("Digital Circuit : ");
        DC = scanner.nextFloat();

        System.out.print("National Programme on Technology Enhanced Learning : ");
        NPTEL = scanner.nextFloat();

        total_marks = EMT + SPD + An_Cir + An_Com + DC + NPTEL;
        System.out.println("\nTotal Marks : " + total_marks);

        percentage = (total_marks / 600) * 100;
        System.out.println("Average Percentage : " + percentage + " % ");

        if ((percentage >= 90) && (percentage >= 95)) {
            System.out.println("\nCongratulation! " + name + " Your are Topper in this Semester " + "& Your Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B ");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >= 50) {
            System.out.println("Grade E");
        } else {
            System.out.println("\nSoory " + name + " You Fail ");
        }

        scanner.close();
    }
}
