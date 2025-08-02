public class Lacturer extends People{


    private int LacturerID;

    public Lacturer(){
        System.out.println("Lacturer()");
    }

    public Lacturer(String fullname, int LacturerID){
        this.LacturerID = LacturerID;
        super.setFullname(fullname);
        
    }

    public Lacturer(String fullname, int LacturerID ,int yearBorn ,String geder){
        super.setFullname(fullname);//(คำสั่ง super) เรียกใช้method ของตัวแม่
        super.setGender(gender);//ใช้method ของตัวแม่
        super.setYearBorn(yearBorn);//ใช้method ของตัวแม่
        this.LacturerID = LacturerID;
    }

    public void setLacturerID(int LacturerID){
        this.LacturerID = LacturerID;
    }

    public int getLacturerID(){
        return this.LacturerID;
    }

    public void setFullname(String fullname){
        super.setFullname(fullname);//ใช้method ของตัวแม่
    }

    public String getFullname(){
        return super.getFullname();//ใช้method ของตัวแม่
    }


<<<<<<< HEAD

}
=======
}
>>>>>>> a423a5371babb8f5cc5bd8e0a9944572939b17c8
