import java.util.Scanner;
 class StudentGradeAverageCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int[] marks = new int[subjects];
        int totalMarks = 0;

        for (int i = 0; i < subjects; i++) {

            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            totalMarks += marks[i];
        }

        double average = (double) totalMarks / subjects;

        System.out.println("\n===== Student Report =====");
        System.out.println("Total Marks : " + totalMarks);
        System.out.printf("Average     : %.2f\n", average);

        if (average >= 90) {
            System.out.println("Grade       : A");
        } else if (average >= 75) {
            System.out.println("Grade       : B");
        } else if (average >= 60) {
            System.out.println("Grade       : C");
        } else if (average >= 40) {
            System.out.println("Grade       : D");
        } else {
            System.out.println("Grade       : F");
        }

        sc.close();
    }
}