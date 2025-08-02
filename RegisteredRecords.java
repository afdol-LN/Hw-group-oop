public class RegisteredRecords {
    private Subject subject;
    private Student student;
    private String  studentID;
    private String subjectID;
    private double score;
    private int credit;
    private double scorepersubj;

    public RegisteredRecords() {
        System.out.println("record begin");
        this.studentID = "unknow";
        this.subjectID = "unknow";
        
    }
    public RegisteredRecords(Subject newsubject){
        this.subject = newsubject;
        this.subjectID = subject.getSubjectID();
        this.credit = subject.getCredit();
        System.out.println("subject is update");
    }
     public RegisteredRecords(Student newstudent){
        this.student = newstudent;
        this.studentID = student.getStudentID();
        this.score = student.getScore();
        calScore(this.score);
        System.out.println("student is update");
    }
    public void calScore(double score){
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
        return this.score;
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
