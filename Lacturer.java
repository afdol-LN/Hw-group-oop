public class Lacturer extends People{


    private String LacturerID;

    Lacturer(){
        System.out.println("Lacturer()");
    }

    Lacturer(String fullname, String LacturerID){
        this.fullname = fullname;
        this.LacturerID = LacturerID;
    }

    public void setLacturerID(String LacturerID){
        this.LacturerID = LacturerID;
    }

    public String getLacturerID(){
        return this.LacturerID;
    }

    public void setFullname(String fullname){
        this.fullname = fullname;
    }

    public String getFullname(){
        return this.fullname;
    }


}
