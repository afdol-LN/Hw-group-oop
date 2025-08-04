public class Subject {
    private String subjectname;
    private String subjectID;
    private int credit;
    private String lecturer;
    private int section;
    private int semester;
    private int year;

    

    public Subject(){
        this.subjectname="unknow";
        this.subjectID = "000000";
        this.credit = 0;
        this.section = 1;
        this.semester = 0;
        this.year = 2025;

    }
     public Subject(String subjname,String subjID,int credit,Lacturer lecturer){
        this.subjectname = subjname;
        this.subjectID = subjID;
        this.credit = credit;
        this.lecturer = lecturer.getFullname();
       
    }

    public Subject(String subname,String subID,int credit,Lacturer lecturer,int section,int semester,int year){
        this.subjectname = subname;
        this.subjectID = subID;
        this.credit = credit;
        this.lecturer = lecturer.getFullname();
        this.section = section;
        this.semester = semester;
        this.year = year;
        
    }

    public void setSubjectName(String subname){
        this.subjectname = subname;
    }
    public String getSubjectName(){
        return this.subjectname;
    }

    public void setSubjectID(String subID){
        this.subjectID = subID;
    }
    public String getSubjectID(){
        return this.subjectID;
    }

    public void setCredit(int credit){
        this.credit = credit;
    }
    public int getCredit(){
        return this.credit;
    }

    public void setLecturer(Lacturer lecturer){
        this.lecturer = lecturer.getFullname();
        
    }
    public String getLecturer(){
        return this.lecturer;
    }

    public void setSection(int section){
        this.section = section;
    }
    public int getSection(){
        return this.section;
    }

    public void setSemester(int semester){
        this.semester = semester;
    }
    public int getSemester(){
        return this.semester;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }

}