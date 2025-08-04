
public class SteudentDemo extends People{
    //hello
    //hello
    public static void main(String[] args){
        
        Student student1 = new Student();
        
        student1.setFullname("mongckontham duaykhunthod");
        student1.setGender("Male");
        student1.setFacuty("Science");
        student1.setMajor("ICT");
        student1.setStudentID("6610210313");

        Student afdol = new Student("afdol leenud","6610210454");
        

        student1.printInfo();
        afdol.printInfo();

        Lacturer lacturer1 = new Lacturer();

        lacturer1.setFullname("Sarayut");
        lacturer1.setGender("Male");
        lacturer1.setYearBorn(2005);
        lacturer1.calAge();
        lacturer1.setLacturerID("1");

        lacturer1.printInfo();

        Subject math = new Subject("math","308-99",3,lacturer1);
        Subject biology = new Subject("biology","308-001",2,lacturer1);
        Subject OOP = new Subject("OOP","308-331",4,lacturer1);

        student1.register(math);
        student1.register(biology);
        student1.register(OOP);
        student1.setScore(math.getSubjectID(),100.00);
        student1.setScore(OOP.getSubjectID(),64);
        student1.setScore(biology.getSubjectID(),71);
        student1.showInfoGPA();
        
        afdol.register(math);
        afdol.setScore(math.getSubjectID(), 56);
        afdol.showInfoGPA();
    }
}
