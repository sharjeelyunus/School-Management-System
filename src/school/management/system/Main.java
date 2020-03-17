package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher vanderhorn = new Teacher(3,"Vanderhorn", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        Student tamasha = new Student(1, "Tamasha", 4);
        Student rakashith = new Student(2, "Rakashith Vasudev", 12);
        Student rabbi = new Student(3, "Rabbi", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakashith);
        studentList.add(rabbi);

        School ghs = new School(teacherList,studentList);

        tamasha.payFees(5000);
        rakashith.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("----Making School Pay Salary----");

        lizzy.recieveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
        + " and now has $" + ghs.getTotalMoneyEarned());

        vanderhorn.recieveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
                + " and now has $" + ghs.getTotalMoneyEarned());

        mellisa.recieveSalary(mellisa.getSalary());
        System.out.println("GHS has spent for salary to " + mellisa.getName()
                + " and now has $" + ghs.getTotalMoneyEarned());

        System.out.println(rakashith);
        System.out.println(mellisa);

    }
}
