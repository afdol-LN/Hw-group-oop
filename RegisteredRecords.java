public class RegisteredRecords {
    private Subject subject;
    private Student student;
    private String  studentID;
    private String subjectID;
    private double score = 0.123;
    private int credit;
    private double scorepersubj;

    public RegisteredRecords() {
        System.out.println("record begin");
        this.studentID = "unknow";
        this.subjectID = "unknow";
        
    }
    // public RegisteredRecords(Subject newsubject){
    //     this.subject = newsubject;
    //     this.subjectID = subject.getSubjectID();
    //     this.credit = subject.getCredit();
    //     System.out.println("subject is update");
    // }
    //  public RegisteredRecords(Student newstudent){
    //     this.student = newstudent;
    //     this.studentID = student.getStudentID();
    //     this.score = student.getScore();
    //     System.out.println(score);
    //     calScore(this.score);
    //     System.out.println("student is update");
    // }
    public RegisteredRecords(Student student, Subject subject) {
    this.student = student;
    this.subject = subject;
    this.studentID = student.getStudentID();
    this.subjectID = subject.getSubjectID();
    this.credit = subject.getCredit();
    this.score = student.getScore(); 
    // คะแนนจาก Student
    calScore(this.score);             // แปลงคะแนนเป็นเกรด
    
}
    public void calScore(double score){
        System.out.println("calScore");
        if (score>=80) {
            this.scorepersubj = 4.0;
        }
        else if (score>=75) {
            this.scorepersubj = 3.5;
        }
        else if (score>=70) {
            this.scorepersubj = 3.0;
        }
        else if(score>=65){
            this.scorepersubj = 2.5;
        }
        else if (score>=60) {
             this.scorepersubj = 2.0;
        }
        else if (score>=55) {
            this.scorepersubj = 1.5;
        }
        else if(score>=50){
            this.scorepersubj = 1.0;
        }
        else{
            this.scorepersubj = 0;
        }
    }
    public String getSubjectID(){
        return  this.subjectID;
    }
    public String getStudentID(){
        return this.studentID;
    }
    public double getScore(){
        return this.scorepersubj;
    }
    public int getCredit(){
        return this.credit;
    }




    public void showReecordScore(){
        System.out.println("ชื่อนักศึกษา:"+student.getFullname()+"รหัสวิชา:"+getSubjectID()+"ชื่อวิชา:"
        +subject.getSubjectName()+"เครดิต:"+subject.getCredit()+"เกรด:"+scorepersubj);
    }
    //defualt contructer
    
}   
