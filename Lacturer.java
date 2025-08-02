public class Lacturer extends People{


    private String LacturerID;

    Lacturer(){
        System.out.println("Lacturer()");
    }

<<<<<<< HEAD
    Lacturer(String fullname, int LacturerID){
        super.setFullname(fullname);
        this.LacturerID = LacturerID;
    }

    Lacturer(String fullname, int LacturerID ,int yearBorn ,String geder){
        super.setFullname(fullname);//(คำสั่ง super) เรียกใช้method ของตัวแม่
        super.setGender(gender);//ใช้method ของตัวแม่
        super.setYearBorn(yearBorn);//ใช้method ของตัวแม่
=======
    Lacturer(String fullname, String LacturerID){
        this.fullname = fullname;
>>>>>>> d35280dde0a4f10be7b8889ea411b0f44efa2975
        this.LacturerID = LacturerID;
    }

    public void setLacturerID(String LacturerID){
        this.LacturerID = LacturerID;
    }

    public String getLacturerID(){
        return this.LacturerID;
    }

    public void setFullname(String fullname){
        super.setFullname(fullname);//ใช้method ของตัวแม่
    }

    public String getFullname(){
        return super.getFullname();//ใช้method ของตัวแม่
    }


}
