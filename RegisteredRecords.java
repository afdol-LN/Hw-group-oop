public class RegisteredRecords {
    private Subject subject;
    private Student student;
    private String  studentID;
    private String subjectID;

    public RegisteredRecords() {
        System.out.println("record begin");
        this.studentID = "unknow";
        this.subjectID = "unknow";
    }
    public RegisteredRecords(Subject newsubject){
        this.subject = newsubject;
        this.subjectID = subject.getSubjectID();
        System.out.println("subject is update");
    }
     public RegisteredRecords(Student newstudent){
        this.student = newstudent;
        this.studentID = student.getStudentID();
        System.out.println("student is update");
    }

    

    //defualt contructer
    
}   
