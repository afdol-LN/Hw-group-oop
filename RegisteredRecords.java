
public class RegisteredRecords {

    private Subject subject;
    private Student student;
    private String studentID;
    private String subjectID;
    private double score = 0.123;
    private int credit;
    private double scorepersubj;
    private int semester;
    private int year;
    private String type ;

    public RegisteredRecords() {
        System.out.println("record begin");
        this.studentID = "unknow";
        this.subjectID = "unknow";

    }

    public RegisteredRecords(int semester, int year, Student student, Subject subject) {
        this.semester = semester;
        this.year = year;
        this.student = student;
        this.subject = subject;
        this.studentID = student.getStudentID();
        this.subjectID = subject.getSubjectID();
        this.credit = subject.getCredit();
        // this.score = student.getScore(); 
        this.scorepersubj = 0.0;
        this.type = "C";

    }

    public void setScore(double score) {
        this.score = score;
        calScore(this.score);
    }

    public void setTypeWithdraw() {
        this.type = "W";
    }

    private void calScore(double score) {
        // System.out.println("calScore");
        if (score >= 80) {
            this.scorepersubj = 4.0;
        } else if (score >= 75) {
            this.scorepersubj = 3.5;
        } else if (score >= 70) {
            this.scorepersubj = 3.0;
        } else if (score >= 65) {
            this.scorepersubj = 2.5;
        } else if (score >= 60) {
            this.scorepersubj = 2.0;
        } else if (score >= 55) {
            this.scorepersubj = 1.5;
        } else if (score >= 50) {
            this.scorepersubj = 1.0;
        } else {
            this.scorepersubj = 0;
        }
    }

    public String getSubjectID() {
        return this.subjectID;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public double getScore() {
        return this.scorepersubj;
    }

    public String getTypeOfSubject() {
        return this.type;
    }

    public int getCredit() {
        return this.credit;
    }

    public String getSubjectName() {
        return subject.getSubjectName();
    }

    public void showReecordScore() {
        // System.out.println("ชื่อนักศึกษา:"+student.getFullname()+" "+" รหัสวิชา:"+getSubjectID()+" ชื่อวิชา:"
        // +subject.getSubjectName()+" เครดิต:"+subject.getCredit()+" เกรด:"+scorepersubj);

        System.out.println("--- score Info ---");
        System.out.println("studentname: " + student.getFullname());
        System.out.println("StudentID: " + getStudentID());
        System.out.println("subjectID: " + getSubjectID());
        System.out.println("subjectname: " + subject.getSubjectName());
        System.out.println("credit: " + subject.getCredit());
        System.out.println("Type: "+this.type);
        // System.out.println("grade "+scorepersubj);
        if (getTypeOfSubject().equals("W")) {
            System.out.println("Grade is W");
        } else if (getTypeOfSubject().equals("C")) {
            System.out.println("Grade: " + getScore());
        }

    }

    //defualt contructer
}
