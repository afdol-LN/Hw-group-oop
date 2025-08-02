public class Lacturer extends People{


    private int LacturerID;

    Lacturer(){
        System.out.println("Lacturer()");
    }

    Lacturer(String fullname, int LacturerID){
        this.fullname = fullname;
        this.LacturerID = LacturerID;
    }

    public void setLacturerID(int LacturerID){
        this.LacturerID = LacturerID;
    }

    public int getLacturerID(){
        return this.LacturerID;
    }

    public void setFullname(String fullname){
        this.fullname = fullname;
    }

    public String getFullname(){
        return this.fullname;
    }


}
