
public class Car extends Vehicle {

    private int TankSize;
    private int EnginePower;
    private int NumberOfDoors;

    public Car(){
        this(0,"Undefined","Undefined",0,0,0);
        System.out.println("Derived class constructor with 0 params");
    }
    public Car(int year,String make){
        super(year, make);
        System.out.println("Derived class constructor with 2 params");
    }
    public Car(int year,String make,String model){
        this.SetYear(year);
        this.SetMake(make);
        this.SetModel(model);
        this.SetEnginePower(0);
        this.SetNumberOfDoors(0);
        System.out.println("Derived class constructor with 3 params");
    }

    public Car(int year,String make,String model,int TankSize , int EnginePower , int NumberOfDoors  ){
        super(year, make, model);
        this.SetTankSize(TankSize);
        this.SetEnginePower(EnginePower);
        this.SetNumberOfDoors(NumberOfDoors);
        System.out.println("Derived class constructor with 5 params");
    }

    public void SetTankSize(int size){
        this.TankSize = size;
    }
    public int GetTankSize(){
        return this.TankSize;
    }

    public void SetEnginePower(int power){
        this.EnginePower = power;
    }
    public void SetNumberOfDoors(int number){
        this.NumberOfDoors = number;
    }

    public int GetEnginePower(){
        return this.EnginePower;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("TankSize: " + TankSize + "l");
        System.out.println("EnginePower: " + EnginePower + "cm3");
        System.out.println("NumberOfDoors: " + NumberOfDoors);
    }

    public void Honk(){
        System.out.println("The car is honking...");
    }

    public void OpenDoors(){
        System.out.println("All "+NumberOfDoors+" are opened");
    }



}
