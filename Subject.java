
public class Subject {
    private String subjectname;
    private int subjectID;
    private int credit;
    private Lacturer lecturer;
    private int section;
    private int semester;
    private int year;

    public Subject(){
        this.subjectname="unknow";
        this.subjectID = 000000;
        this.credit = 0;
        this.section = 1;
        this.semester = 0;
        this.year = 2025;
    }

    public Subject(String subname,int subID,int credit,int section,int semester,int year){
        this.subjectname=subname;
        this.subjectID = subID;
        this.credit = credit;
        this.section = section;
        this.semester = semester;
        this.year = year;

    }
}
