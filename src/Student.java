public class Student {

    private int id;
    private String name;
    private int Class;
    private int feesPaid;
    private int feesTotal;


    /**
     * TO create a new student by initializing.
     * Fees for every student is 50,000 pkr.
     * Fees paid initially is 0.
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param Class Class of the student.
     */
    public Student(int id, String name, int Class){
        this.feesPaid=0;
        this.feesTotal=50000;
        this.id=id;
        this.name=name;
        this.Class=Class;

    }

    //Not going to alter student's name, student's id.

    /**
     * Used to update student's grade.
     * @param Class new class of the student.
     */

    private void setClass(int Class) {
        this.Class=Class;

    }

    /**
     * Keep adding the fees to feesPaid field.
     * Add the fees to fees paid.
     * The school is going to receive funds.
     * @param fees fees that the student pays.
     */

    public void updateFeesPaid(int fees){
        feesPaid+=fees;

    }
}
