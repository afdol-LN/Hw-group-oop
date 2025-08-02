public class RegisteredRecords {
    private Subject subject;
    private Student student;

    public RegisteredRecords() {

    }
    public RegisteredRecords(Subject newsubject){
        this.subject = newsubject;
        System.out.println("subject is update");
    }
     public RegisteredRecords(Student newstudent){
        this.student = newstudent;
        System.out.println("student is update");
    }

    //defualt contructer
    
}   
