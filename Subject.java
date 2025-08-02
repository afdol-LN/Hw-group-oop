
public class Subject {
    private String subjectname;
    private String subjectID;
    private int credit;
    private Lacturer lecturer;
    private int section;
    private int semester;
    private int year;

    public Subject(){
        this.subjectname="unknow";
        this.subjectID = "unknow";
        this.credit = 0;
        this.section = 1;
        this.semester = 0;
        this.year = 2025;
    }

    public Subject(String subname,String subID,int credit,int section,int semester,int year){
        this.subjectname=subname;
        this.subjectID = subID;
        this.credit = credit;
        this.section = section;
        this.semester = semester;
        this.year = year;

    }

    public String getSubjectID(){
        return  this.subjectID;
    }
}
