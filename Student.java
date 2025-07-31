import java.util.ArrayList;

public class Student extends People{
    //attributes
    private String studentID;
    public String faculty;
    public String major;

    private double GPA;

    private ArrayList<RegisteredRecords> registeredRecords;

    // class variable
    static int numberOfStudent;
    //constructors
    public Student(){
        System.out.println("Student()"); 
        numberOfStudent = numberOfStudent + 1;
        registeredRecords = new ArrayList<>();
    }

    public Student(String gender, String nickname){
      System.out.println("Student(String gender, String nickname)");  
      this.gender = gender;
      this.nickname = nickname;
      numberOfStudent = numberOfStudent + 1;
    }

    //setter/methods
    public void setStudentID(String studentID){
        this.studentID = studentID;
    };
    public String getStudentID(){
        return studentID;
    }

    public void register(Subject s , Student std){
        RegisteredRecords newStdID = new RegisteredRecords(std);
        RegisteredRecords newsubj = new RegisteredRecords(s);
        this.registeredRecords.add(newsubj);
        this.registeredRecords.add(newStdID);

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
}