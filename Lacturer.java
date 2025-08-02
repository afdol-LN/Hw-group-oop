public class Lacturer extends People{


    private String LacturerID;

    public Lacturer(){
        System.out.println("Lacturer()");
    }

    public Lacturer(String fullname, String LacturerID ,int yearBorn ,String geder, int Age){
        super.setFullname(fullname);//(คำสั่ง super) เรียกใช้method ของตัวแม่
        super.setGender(gender);//ใช้method ของตัวแม่
        super.setYearBorn(yearBorn);//ใช้method ของตัวแม่
        this.LacturerID = LacturerID;
        super.calAge();//ใช้method ของตัวแม่
    }
    public void setLacturerID(String LacturerID){
        this.LacturerID = LacturerID;
    }

    public String getLacturerID(){
        return this.LacturerID;
    }

    public void printInfo() {
        System.out.println("--- Lacturer Info ---");
        System.out.println("Fullname: " + getFullname());
        System.out.println("Gender: " + getGender());
        System.out.println("Year born: " + getYearBorn());
        System.out.println("Age: " + getAge());
        System.out.println("Lacturer ID: " + getLacturerID());
        System.out.println("----------------------");
    }
}
