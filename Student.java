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

    public Student(String gender, String fullname){
      System.out.println("Student(String gender, String fullname)");  
      super.setFullname(fullname);
      super.setGender(gender);
      numberOfStudent = numberOfStudent + 1;
    }

    //setter/methods
    
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

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