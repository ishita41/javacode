import java.util.Scanner;

public class ete62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Answer key
        char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };

        // Input the number of students
        System.out.println("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); // Consume the newline

        // 2D array to store each student's answers
        char[][] answers = new char[numStudents][10];

        // Input each student's answers
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter answers for student " + (i + 1) + ": ");
            String answerLine = sc.nextLine();
            answers[i] = answerLine.replaceAll(" ", "").toCharArray();
        }

        // Grade each student's answers
        for (int i = 0; i < numStudents; i++) {
            int correctCount = 0;
            for (int j = 0; j < 10; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCount++;
                }
            }
            System.out.println("Student " + (i + 1) + " got " + correctCount + " correct answers.");
        }

        sc.close();
    }
}
