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

    public Student(String gender, String nickname){
      System.out.println("Student(String gender, String nickname)");  
      this.gender = gender;
      this.nickname = nickname;
      numberOfStudent = numberOfStudent + 1;
    }

    

    //setter/methods
    @Override
    public void setFullname(String fullname){
        super.setFullname(fullname);
    }
    @Override
    public String getFullname(){
        return super.getFullname();
    }
    public void setStudentID(String studentID){
        this.studentID = studentID;
    };
    public String getStudentID(){
        return studentID;
    }


    public void register(Subject s){
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