//a logical class
public class People{
	//attributes: General and which for BMI calculation
    //accessibility/visibility, data type or class, attribute nams
    
    // instance variable
    public String gender; // "male", "female" 
    public String nickname;
    protected String identifcationID;
    public String fullname;
    
    //private int yearBorn;
    protected int yearBorn;
    //private int age;
    protected int age;

    private double weight;
    private double height;   
    

    // protected double weight;
    // protected double height;   
    // protected double BMI;

    // class variable
    public static int numberOfPeople;

    //default constructor
    public People(){
    //   System.out.println("People()");  
      numberOfPeople = numberOfPeople + 1;
    }
    // Overloading constructors
    public People(String gender, String nickname, String identifcationID, String fullname){
      System.out.println("Overloading constructor of People()");  
      this.gender = gender;
      this.nickname = nickname;
      this.identifcationID = identifcationID;
      this.fullname = fullname;
      numberOfPeople = numberOfPeople + 1;
    }
    public People(String gender, String nickname){
      System.out.println("People(String gender, String nickname)");  
      this.gender = gender;
      this.nickname = nickname;
      numberOfPeople = numberOfPeople + 1;
    }
    public People(int yearBorn, String gender, String nickname){
      System.out.println("Overloading constructor of People()");  
      this.yearBorn = yearBorn;
      this.gender = gender;
      this.nickname = nickname;
      numberOfPeople = numberOfPeople + 1;
    }
    //methods
    public void greeting(){
        System.out.println("Sawasdee");  
    }
    public void setFullname(String fullname){
        this.fullname = fullname;
    }
    public String getFullname(){
        return this.fullname;
    }
    // setter/getter methods
	public void setGender(String gender){ //gender: informal parameter
        this.gender = gender;
    }
    public String getGender(){
        //return gender;
        return this.gender;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public String getNickname(){
        return this.nickname;
    }
    // public double getWeight(){
    //     return weight;
    // }
    // public double getHeight(){
    //     return height;
    // }
    // // Overloading methods
    // public void calBMI(){
    //     this.BMI = this.weight / ( (this.height/100.0) * (this.height/100.0) );
    // }
    // public double calBMI(People people){
    //     double tempBMI = people.getWeight() / ( (people.getHeight()/100.0) * (people.getHeight()/100.0) );
    //     return tempBMI;
    // }

    // public double getBMI(){
    //     return this.BMI;
    // }
    // helper methods
    // public String gender; // "male", "female" 
    // public String nickname;
    public void setYearBorn(int yearBorn){
        this.yearBorn = yearBorn;
    }
    public int getYearBorn(){
        return this.yearBorn;
    }
    public void setIdentificationID(String identifcationID){
        this.identifcationID = identifcationID;
    }
    public void calAge(){
        //this.age = currentYear - this.yearBorn;
        this.age = 2025 - this.yearBorn;
    }
    public int getAge(){
        return age;
    }

    // public void setHeight(double height){
    //     this.height = height;
    // }

    // public void setWeight(double weight){
    //     this.weight = weight;
    // }

    public void printInfo(){
        System.out.println();
        System.out.println("Year born: " + yearBorn);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Nickname: " + nickname);
        System.out.println("Identifcation ID: " + identifcationID);
        System.out.println("Fullname: " + fullname);
    }
    public void printInfo(int parameterNumbers){ //p5.printInfo(3);
        System.out.println();
        System.out.println("Year born: " + yearBorn);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    // public void printBMI(){
    //     System.out.println();
    //     System.out.println("Nickname: " + nickname);
    //     System.out.println("Weight: " + weight);
    //     System.out.println("Height: " + height);
    //     System.out.println("BMI: " + BMI);
    // }
    
}
