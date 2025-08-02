import java.util.ArrayList;

public class Student extends People{
    //attributes
    private String studentID;
    public String faculty;
    public String major;
    public double score;
    private double GPA;
    private Student std;

    private ArrayList<RegisteredRecords> registeredRecords;
    RegisteredRecords newStdID = new RegisteredRecords(std);
    // class variable
    static int numberOfStudent;
    //constructors
    public Student(){
        System.out.println("Student()"); 
        numberOfStudent = numberOfStudent + 1;
        registeredRecords = new ArrayList<>();
    }
    public Student(String fullanme,String studentID,String gender, String nickname){
      System.out.println("Student(String gender, String nickname)");  
      this.studentID = studentID;
      super.setFullname(fullname);
      super.setGender(gender);
      super.setNickname(nickname);
      
      numberOfStudent = numberOfStudent + 1;
    }

    public Student(String gender, String fullname){
      System.out.println("Student(String gender, String fullname)");  
      super.setFullname(fullname);
      super.setGender(gender);
      numberOfStudent = numberOfStudent + 1;
    }

    

    //setter/methods
<<<<<<< HEAD
    @Override
    public void setFullname(String fullname){
        super.setFullname(fullname);
    }
    @Override
    public String getFullname(){
        return super.getFullname();
    }
=======
    
>>>>>>> c90df5ab8793b85b3fe88dbffbe6a6dc014e5b25
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

<<<<<<< HEAD

    public void register(Subject s){
=======
    public String getStudentID(){
        return this.studentID;
    }

    public void setFacuty(String faculty){
        this.faculty = faculty;
    }
    
    public String getFaculty(){
        return this.faculty;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public String getMajor(){
        return this.major;
    }

    public void printInfo(){
        System.out.println("--- Student Info ---");
        System.out.println("Fullname: " + getFullname());
        System.out.println("Gender: " + getGender());
        System.out.println("Faculty: " + getFaculty());
        System.out.println("Major: " + getMajor());
        System.out.println("Student ID: " + getStudentID());
        System.out.println("----------------------");
    }


    public void register(Subject s , Student std){
        RegisteredRecords newStdID = new RegisteredRecords(std);
>>>>>>> c90df5ab8793b85b3fe88dbffbe6a6dc014e5b25
        RegisteredRecords newsubj = new RegisteredRecords(s);
        this.registeredRecords.add(newsubj);
        this.registeredRecords.add(newStdID);

    }

    public void setScore(double score){
        this.score=score;
        this.registeredRecords.add(newStdID);
    }
    public double getScore(){
        return this.score;
    }

    public void calGPA(){
        double totalscore = 0;
        int totalcredit = 0;
        for (RegisteredRecords record : registeredRecords) {
            totalscore += record.getScore();
            totalcredit += record.getCredit();
        }
        this.GPA = totalscore/totalcredit;
    }
    public double getGPA(){
        return  this.GPA;
    }

    public void printRegisteredRecords(){
        System.out.println("--- Registered Records ---");
        if (registeredRecords.isEmpty()) {
            System.out.println("No records registered.");
        } else {
            for (RegisteredRecords record : registeredRecords) {
                System.out.println(record); // This will call the toString() method of RegisteredRecords
            }
        }
        System.out.println("--------------------------");
    }
    
    public void showInfoGPA(){
        for (RegisteredRecords record : registeredRecords) {
            record.showReecordScore();
        }
        System.out.println("GPA:"+this.GPA);
    }
}