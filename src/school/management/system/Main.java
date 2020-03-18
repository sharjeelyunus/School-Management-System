package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher asifurrehman = new Teacher(1, "Asif ur Rehman", 500);
        Teacher munawer = new Teacher(2, "Munawer", 700);
        Teacher arshad = new Teacher(3,"Arshad", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(asifurrehman);
        teacherList.add(munawer);
        teacherList.add(arshad);

        Student aadil = new Student(1, "Aadil", 4);
        Student hamza = new Student(2, "Hamza", 12);
        Student ali = new Student(3, "Ali", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(aadil);
        studentList.add(hamza);
        studentList.add(ali);

        School ghs = new School(teacherList,studentList);

        System.out.println("----School is earning Money----");

        aadil.payFees(5000);
        System.out.println(aadil.getName() + " has paid fees.");
        hamza.payFees(6000);
        System.out.println(hamza.getName() + " has paid fees.");
        ali.payFees(5500);
        System.out.println(ali.getName() + " has paid fees.");

        System.out.println("======School has earned $" + ghs.getTotalMoneyEarned() + "======");

        System.out.println("----Making School Pay Salary----");

        asifurrehman.recieveSalary(asifurrehman.getSalary());
        System.out.println("GHS has spent for salary to " + asifurrehman.getName());

        arshad.recieveSalary(arshad.getSalary());
        System.out.println("GHS has spent for salary to " + arshad.getName());

        munawer.recieveSalary(munawer.getSalary());
        System.out.println("GHS has spent for salary to " + munawer.getName());

        System.out.println("Total remaining Money $" +ghs.getTotalMoneyEarned());

//        System.out.println(hamza);
//        System.out.println(munawer);

    }
}
