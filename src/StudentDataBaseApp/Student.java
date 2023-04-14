package StudentDataBaseApp;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = " ";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter student´s name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();
        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();
        System.out.println("Enter student class level: \n1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior");
        this.gradeYear = in.nextInt();
        setStudentID();
    }
    //Generate id
    private void setStudentID(){
        //Grade level + ID
        id++;
        this.studentId = gradeYear + " " + id;
    }
    //Enroll in courses
    public void enroll(){
        //Gets inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        }while (1 != 0);
    }
    //View balance
    public void viewBalance(){
        System.out.println("Your balance is $: " + tuitionBalance);
    }
    //Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $"+ payment);
        viewBalance();
    }
    //Show status
    public String toString(){
        return "Name: " + firstName + " "+ lastName +
                "\nGrade level: " + gradeYear +
                "\nStudent ID: " + studentId +
                "\nCourses enrolled: "+ courses +
                "\nBalance: "+ tuitionBalance;
    }
}
