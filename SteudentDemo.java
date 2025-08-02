
public class SteudentDemo extends People{
    //hello
    //hello
    public static void main(String[] args){

        Student student1 = new Student();
        student1.setFullname("aonglee");
        student1.setGender("Male");
        student1.setFacuty("Science");
        student1.setMajor("ICT");
        student1.setStudentID("1");

        student1.printInfo();

        Lacturer lacturer1 = new Lacturer();
        lacturer1.setFullname("afdol");
        lacturer1.setGender("Male");
        lacturer1.setYearBorn(2005);
        lacturer1.calAge();
        lacturer1.setLacturerID("1");

        lacturer1.printInfo();

        Subject math = new Subject("math","308-99",3,lacturer1);

        student1.register(math);

        student1.setScore(100);
        
        student1.showInfoGPA();
  

    }
}
