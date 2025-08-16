
import java.util.ArrayList;

public class Year {

    private Student student;
    private Subject subject;
    private int year = 2568;
    private int semester;
    private double GPAsemester1;
    private double GPAsemester2;

    private ArrayList<RegisteredRecords> semester1 = new ArrayList<>();
    private ArrayList<RegisteredRecords> semester2 = new ArrayList<>();

    public Year() {

    }

    public Year(Student student) {
        this.student = student;
    }

    public Year(int semester, Subject s) {
        this.subject = s;
        this.semester = semester;
    }

    public void register(Subject subject) {
        this.semester = 1;
        this.subject = subject;
        storeTOArreyList();
    }

    public void register(int semester, Subject subject) {
        this.semester = semester;
        this.subject = subject;
        storeTOArreyList();
    }

    public void setScore(Subject subject, double score) {

        for (RegisteredRecords record : semester1) {
            if (record.getSubjectID().equals(subject.getSubjectID())) {
                record.setScore(score);
                break;
            }
        }

    }

    public double getGPA() {

        return this.GPAsemester1;
    }

    public double getGPA(int semester) {
        if (semester == 1) {
            return this.GPAsemester1;
        } else if (semester == 2) {
            return this.GPAsemester2;
        } else {
            return 0;
        }
    }

    public void setScore(Subject subject, double score, int semester) {

        if (semester == 1) {
            for (RegisteredRecords record : semester1) {
                if (record.getSubjectID().equals(subject.getSubjectID())) {
                    record.setScore(score);
                    break;
                }

            }
        } else if (semester == 2) {
            for (RegisteredRecords record : semester2) {
                if (record.getSubjectID().equals(subject.getSubjectID())) {
                    record.setScore(score);
                    break;
                }
            }
        } else {
            System.out.println("invalid in put");
        }
    }

    public int getSumOfCredit(int semester) {
        int sumCredit = 0;
        if (semester == 1) {
            for (RegisteredRecords record : semester1) {
                if (record.getTypeOfSubject().equals("C")) {

                    sumCredit += record.getCredit();
                }
            }
            return sumCredit;

        } else if (semester == 2) {
            for (RegisteredRecords record : semester2) {
                if (record.getTypeOfSubject().equals("C")) {

                    sumCredit += record.getCredit();
                }
            }
            return sumCredit;

        } else {
            return 0;
        }
    }

    public void calGPA() {
        //for semester1
        double sumPointscore = 0;

        for (RegisteredRecords record : semester1) {
            if (record.getTypeOfSubject().equals("C")) {
                sumPointscore += (record.getScore() * record.getCredit());

            }
        }
        this.GPAsemester1 = sumPointscore / getSumOfCredit(1);;

    }

    public void calGPA(int semester) {

        double sumPointscore = 0;

        if (semester == 1) {//for semester1
            for (RegisteredRecords record : semester1) {
                if (record.getTypeOfSubject().equals("C")) {
                    sumPointscore += (record.getScore() * record.getCredit());
                }
            }
            this.GPAsemester1 = sumPointscore / getSumOfCredit(semester);
        } else if (semester == 2) {//for semester2
            for (RegisteredRecords record : semester2) {
                if (record.getTypeOfSubject().equals("C")) {
                    sumPointscore += (record.getScore() * record.getCredit());
                }
            }
            this.GPAsemester2 = sumPointscore / getSumOfCredit(semester);

        }
    }

    private void storeTOArreyList() {
        if (this.semester == 1) {
            for (RegisteredRecords r : semester1) {
                if (r.getSubjectID().equals(this.subject.getSubjectID())) {
                    System.out.println("Already registered: " + this.subject.getSubjectName());
                    return;
                }
            }
            RegisteredRecords record = new RegisteredRecords(1, this.year, this.student, this.subject);
            this.semester1.add(record);
        } else if (this.semester == 2) {
            for (RegisteredRecords r : semester2) {
                if (r.getSubjectID().equals(this.subject.getSubjectID())) {
                    System.out.println("Already registered: " + this.subject.getSubjectName());
                    return;
                }
            }
            RegisteredRecords record = new RegisteredRecords(2, this.year, this.student, this.subject);
            this.semester2.add(record);
        }
    }

    public void withDraw(Subject subject) {
        for (RegisteredRecords record : semester1) {
            if (subject.getSubjectID().equals(record.getSubjectID())) {
                record.setTypeWithdraw();
            }
        }
    }

    public void showGPAperTerm(int semester) {
        if (semester == 1) {
            for (RegisteredRecords record : semester1) {
                record.showReecordScore();
            }
            calGPA(1);
            
            System.out.println("");
            System.out.println("--- GPA semester 1 Info ---");
            System.out.println("GPA:" + String.format("%.2f", this.GPAsemester1));
            System.out.println("------------------");
            System.out.println("");
        } else if (semester == 2) {
            for (RegisteredRecords record : semester2) {
                record.showReecordScore();
            }
            calGPA(2);
            // System.out.println("GPA semister 2 :" + String.format("%.2f", GPAsemester2));
            System.out.println("");
            System.out.println("--- GPA semester 2 Info ---");
            System.out.println("GPA:" + String.format("%.2f", this.GPAsemester2));
            System.out.println("------------------");
            System.out.println("");
        }
    }

    // public void showGPACurrent(){
    //     int i = 1;
    //     for (RegisteredRecords record : semester1) {
    //         System.out.println("----Subject "+i+"----");
    //         System.out.print("StudentID : "+record.getStudentID());
    //         System.out.println("Subject name : "+record.getSubjectName());
    //         System.out.print("SubjectID : "+record.getSubjectID());
    //         System.out.println("Credit : "+record.getCredit());
    //         System.out.println("Tpye : " + record.getTypeOfSubject());
    //         i++;
    //     }
    // }
}
