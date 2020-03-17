package school.management.system;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /**
     * TO create a new student by initializing.
     * Fees for every student is 50,000 pkr.
     * Fees paid initially is 0.
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */
    public Student(int id, String name, int grade){
        this.feesPaid=0;
        this.feesTotal=50000;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }

    //Not going to alter student's name, student's id.

    /**
     * Used to update student's grade.
     * @param grade new class of the student.
     */

    private void setgrade(int grade) {
        this.grade=grade;

    }

    /**
     * Keep adding the fees to feesPaid field.
     * Add the fees to fees paid.
     * The school is going to receive funds.
     * @param fees fees that the student pays.
     */

    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);

    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getGrade(){
        return grade;
    }

    public int getFeesPaid(){
        return feesPaid;
    }

    public int getFeesTotal(){
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name : "+name+
                " Total fees paid so far $"+ feesPaid;
    }
}
