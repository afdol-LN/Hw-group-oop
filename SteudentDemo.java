
public class SteudentDemo extends People{
    //hello
    //hello
    public static void main(String[] args){
        
        Student student1 = new Student();
        double GPX;
        student1.setFullname("mongckontham duaykhunthod");
        student1.setGender("Male");
        student1.setFacuty("Science");
        student1.setMajor("ICT");
        student1.setStudentID("6610210313");

        Student afdol = new Student("afdol leenud","6610210454");
        

        student1.printInfo();
        // afdol.printInfo();

        Lacturer lacturer1 = new Lacturer();

        lacturer1.setFullname("Sarayut");
        lacturer1.setGender("Male");
        lacturer1.setYearBorn(2005);
        lacturer1.calAge();
        lacturer1.setLacturerID("1");

        lacturer1.printInfo();
        
        Lacturer lacturer2 = new Lacturer("ait");

        Subject math = new Subject("math","308-99",3,lacturer1);
        Subject biology = new Subject("biology","308-001",2,lacturer1);
        Subject OOP = new Subject("OOP","308-331",4,lacturer1);
        Subject basicprogram = new Subject("basicprogram","308-111",3,lacturer1);
        Subject SA = new Subject("system anlysis","308-565",3,lacturer1);
        Subject design = new Subject("UXUI","308-555",3,lacturer1);

        
        OOP.showinfo();

        student1.register(math);
        student1.register(biology);
        student1.register(OOP);
        student1.setScore(math,100.00);
        student1.setScore(OOP,64);
        student1.setScore(biology,71);
        student1.showGPAperTerm(1);
        student1.withDraw(OOP);
        student1.showGPAperTerm(1);

        student1.register(2, basicprogram);
        student1.register(2, SA);
        student1.register(2, design);
        student1.setScore(basicprogram, 56, 2);
        student1.setScore(SA, 75, 2);
        student1.setScore(design, 92, 2);
        student1.showGPAperTerm(2);
        // afdol.register(math);
        // afdol.setScore(math.getSubjectID(), 56);
        // afdol.showGPAperTerm(1);
        GPX = student1.calGPX();
        System.out.print("GPX is "+String.format("%.2f", GPX));
        
    }
}
