public class Vehicle {
    private int year;
    private String make;
    private String model;
    public static final int MAX_SPEED = 200;

    public Vehicle(){
        this(0,"Undefined" , "Undefined");
        System.out.println("Base class constructor with 0 params");
    }

    public Vehicle(int year,String make){
        this( year ,  make , "Undefined");
        System.out.println("Base class constructor with 2 params");
    }

    public Vehicle(int year , String make , String model){
       this.SetYear(year);
       this.SetMake(make);
       this.SetModel(model);
       System.out.println("Base class constructor with 3 params");
    }

    public void SetYear(int year){
        this.year = year;
    }

    public void SetMake(String make){
        this.make = make;
    }

    public void SetModel(String model){
        this.model = model;
    }

    public int GetYear(){
        return  this.year;
    }
    public String GetMake(){
        return  this.make;
    }
    public String GetModel(){
        return  this.model;
    }

    public void Accelerate(){
        System.out.println("The vechicle is accelerating...");
    }

    public void Break(){
        System.out.println("The vechicle is Breaking...");
    }
    public void displayInfo() {
        System.out.println("--\nMake: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("MAX_SPEED: " + MAX_SPEED);
    }

}
