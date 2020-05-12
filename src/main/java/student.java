import java.util.Scanner;

public class student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private int costofCouse = 600;
    private static int id = 1000;

    // Constructor : prompt user to student name and year
    public student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name : ");
        this.firstName=in.nextLine();

        System.out.print("Enter student last name : ");
        this.lastName=in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();
    }
    // Generate ID
    private void setStudentID(){
        id++;
        this.studentID = gradeYear + "" + id;
    }
    // Enroll in course
    public void enroll(){
        do{
            System.out.print("Enter course to enroll (Q to quit) : ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costofCouse;
            }
        else{
            break;
        }
        }while (1 != 0);
}
    // View balance
    public void viewBalance(){
        System.out.println("Your balance is : $" + tuitionBalance);
    }
    //Pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment : $ ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    // Show status
    public String toString(){
        return "---------------------------------------" +
               "\nName : " + firstName + " " + lastName +
               "\nGrade level : " + gradeYear +
               "\nStudent ID : " + studentID +
               "\nCourses enrolled : " + courses + " " +
               "\nBalance : $" + tuitionBalance +
               "\n---------------------------------------";
    }
}

