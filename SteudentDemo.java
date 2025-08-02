
public class SteudentDemo extends People{
    //hello
    //hello
    public static void main(String[] args){

        Student student = new Student();
        student.setFullname("aonglee");
        student.setGender("Male");
        student.setFacuty("Science");
        student.setMajor("ICT");
        student.setStudentID("1");

        student.printInfo();

        Lacturer lacturer = new Lacturer();
        lacturer.setFullname("afdol");
        lacturer.setGender("Male");
        lacturer.setYearBorn(2005);
        lacturer.calAge();
        lacturer.setLacturerID("1");

        lacturer.printInfo();

        Subject subject = new Subject();



  

    }
}
