package StudentDataBaseApp;
import java.util.Scanner;

public class studentDataBaseApp {
    public static void main(String[] args) {
        //Ask how many new students we want to add
        System.out.print("Enter number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
        //Create n number of new students
        for(int n = 0; n < numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }

    }
}
